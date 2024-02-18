package life.homail.notesapp.Maths.Part2.Part2Chapters;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;
public class Part2Main extends AppCompatActivity{
    protected Part2Views part2Views;
    protected Part2Adapter part2Adapter;
    protected ArrayList<Model> modelArr=new ArrayList<>();
    protected RcHandler rcHandler=new RcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_part2_chapter_activity);
        this.changeStatusBarColor();
        this.doAtEndOfOnCreate();
    }
    private void doAtEndOfOnCreate(){
        part2Views=new Part2Views(this);
        part2Adapter=new Part2Adapter(this);
        this.rcViewSettings();
    }

    private void rcViewSettings(){
        this.part2Views.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part2Views.rcView.setAdapter(this.part2Adapter);
    }
    private void changeStatusBarColor(){
        Window window=getWindow();
        window.setStatusBarColor(Color.BLACK);
    }
}