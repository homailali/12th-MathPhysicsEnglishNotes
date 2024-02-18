package life.homail.notesapp.Maths.Part1.Part1Exercises;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import life.homail.notesapp.R;
public class Part1ExMain extends AppCompatActivity{
    protected String chapterNoReceived;
    protected Part1ExViews part1ExViews;
    protected ArrayList<Model> modelArr=new ArrayList<>();
    protected Part1ExAdapter part1ExAdapter;
    protected Part1RcHandler part1RcHandler=new Part1RcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_part1_ex_activity);
        this.changeStatusBarColor();
        this.getChapterNoReceived();
        this.initializeViewsObj();
        this.adapterSettings();
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.part1ExViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part1ExViews.rcView.setAdapter(this.part1ExAdapter);
    }
    private void adapterSettings(){
        this.part1ExAdapter=new Part1ExAdapter(this);
    }
    private void initializeViewsObj(){
        this.part1ExViews=new Part1ExViews(this);
    }
    private void getChapterNoReceived(){
        Intent intent=getIntent();
        this.chapterNoReceived=intent.getStringExtra("chapter");
    }
    private void changeStatusBarColor(){
        Window window=getWindow();
        window.setStatusBarColor(Color.BLACK);
    }
}