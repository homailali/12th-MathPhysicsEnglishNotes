package life.homail.notesapp.Maths.Part1.Part1Exercises;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1ExViews {
    private Part1ExMain part1ExMain;
    protected RecyclerView rcView;
    public Part1ExViews(Part1ExMain part1ExMain) {
        this.part1ExMain = part1ExMain;
        this.initializeViews();
    }
    private void initializeViews(){
        this.rcView=this.part1ExMain.findViewById(R.id.rcView);
        this.setValuesInsideModelArr();
    }


    // Settings values based on chapter received
    private void setValuesInsideModelArr(){
        if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("1")){
            this.part1ExMain.modelArr.add(new Model("Ex#1.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#1.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#1.3"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("2")){
            this.part1ExMain.modelArr.add(new Model("Ex#2.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.5"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.6"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.7"));
            this.part1ExMain.modelArr.add(new Model("Ex#2.8"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("3")){
            this.part1ExMain.modelArr.add(new Model("Ex#3.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#3.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#3.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#3.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#3.5"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("4")){
            this.part1ExMain.modelArr.add(new Model("Ex#4.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.5"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.6"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.7"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.8"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.9"));
            this.part1ExMain.modelArr.add(new Model("Ex#4.10"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("5")){
            this.part1ExMain.modelArr.add(new Model("Ex#5.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#5.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#5.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#5.4"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("6")){
            this.part1ExMain.modelArr.add(new Model("Ex#6.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.5"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.6"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.7"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.8"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.9"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.10"));
            this.part1ExMain.modelArr.add(new Model("Ex#6.11"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("7")){
            this.part1ExMain.modelArr.add(new Model("Ex#7.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.5"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.6"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.7"));
            this.part1ExMain.modelArr.add(new Model("Ex#7.8"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("8")){
            this.part1ExMain.modelArr.add(new Model("Ex#8.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#8.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#8.3"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("9")){
            this.part1ExMain.modelArr.add(new Model("Ex#9.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#9.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#9.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#9.4"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("10")){
            this.part1ExMain.modelArr.add(new Model("Ex#10.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#10.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#10.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#10.4"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("11")){
            this.part1ExMain.modelArr.add(new Model("Ex#11.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#11.2"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("12")){
            this.part1ExMain.modelArr.add(new Model("Ex#12.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.2"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.3"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.4"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.5"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.6"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.7"));
            this.part1ExMain.modelArr.add(new Model("Ex#12.8"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("13")){
            this.part1ExMain.modelArr.add(new Model("Ex#13.1"));
            this.part1ExMain.modelArr.add(new Model("Ex#13.2"));
        } else if (this.part1ExMain.chapterNoReceived.equalsIgnoreCase("14")) {
            this.part1ExMain.modelArr.add(new Model("Ex#14.1"));
        }
    }
}
