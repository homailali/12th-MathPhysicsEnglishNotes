package life.homail.notesapp.Part1Exercises;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1ExViews {
    private Part1ExMain part1ExMain;
    protected RecyclerView rcView;
    protected TextView part1ChHeading;
    public Part1ExViews(Part1ExMain part1ExMain) {
        this.part1ExMain = part1ExMain;
        this.initializeViews();
    }
    private void initializeViews(){
        this.rcView=this.part1ExMain.findViewById(R.id.rcView);
        this.part1ChHeading=this.part1ExMain.findViewById(R.id.part1ChHeading);
        this.setChapterName();
    }


    // Settings values based on chapter received
    private void setChapterName(){
        this.part1ChHeading.setText("Part 1 Chapter "+this.part1ExMain.chapterNoReceived);
        this.setValuesInsideModelArr();
    }
    private void setValuesInsideModelArr(){
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".1"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".2"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".3"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".4"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".5"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".6"));
        this.part1ExMain.modelArr.add(new Model("Ex#"+this.part1ExMain.chapterNoReceived+".7"));
    }
}
