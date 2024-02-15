package life.homail.notesapp.ExerciseViewerMain;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;
public class ExerciseViewerMain extends AppCompatActivity{
    // Fields
    protected String partNo;
    protected String chapterNo;
    protected String exerciseNo;
    protected ExViewerAdapter exViewerAdapter;
    protected ExViewerViews exViewerViews;
    protected Part1ExViewer part1ExViewer=new Part1ExViewer(this);
    protected Part2ExViewer part2ExViewer=new Part2ExViewer(this);
    protected ArrayList<ExViewerModel> exViewerModelArr=new ArrayList<>();
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.ex_viewer_activity);
        this.atEndOfOnCreate();
        this.getIntentData();
        this.determineTheControlBasedOnParts();
    }
    private void atEndOfOnCreate(){
        this.exViewerViews=new ExViewerViews(this);
        this.exViewerAdapter=new ExViewerAdapter(this);
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.exViewerViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.exViewerViews.rcView.setAdapter(this.exViewerAdapter);
    }
    private void getIntentData(){
        Intent intent=getIntent();
        this.partNo=intent.getStringExtra("part");
        this.chapterNo=intent.getStringExtra("chapterNo");
        this.exerciseNo=intent.getStringExtra("exNo");
    }
    private void determineTheControlBasedOnParts(){
        if (this.partNo.equals("1")) this.part1ExViewer.part1ExViewerMain();
        else if (this.partNo.equals("2")) this.part2ExViewer.part2ExViewerMain();
    }
}