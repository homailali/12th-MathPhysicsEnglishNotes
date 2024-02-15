package life.homail.notesapp.Part2Exercises;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part2ExViews{
    private Part2ExMain part2ExMain;
    protected RecyclerView rcView;
    protected TextView part2ChHeading;
    public Part2ExViews(Part2ExMain part2ExMain){
        this.part2ExMain = part2ExMain;
        this.initializeViews();
        this.fillArrayList();
        this.setChapterTitle();
    }
    private void initializeViews(){
        this.rcView=this.part2ExMain.findViewById(R.id.rcView);
        this.part2ChHeading=this.part2ExMain.findViewById(R.id.part2ChHeading);
    }

    private void setChapterTitle(){
        part2ChHeading.setText("Part 2 Chapter "+this.part2ExMain.chapterNoReceived);
    }
    private void fillArrayList(){
        if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("1")){
            this.part2ExMain.modelsArr.add(new Model("Ex#1.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#1.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#1.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#1.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#1.5"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("2")){
            this.part2ExMain.modelsArr.add(new Model("Ex#2.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.5"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.6"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.7"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.8"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.9"));
            this.part2ExMain.modelsArr.add(new Model("Ex#2.10"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("3")){
            this.part2ExMain.modelsArr.add(new Model("Ex#3.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.5"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.6"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.7"));
            this.part2ExMain.modelsArr.add(new Model("Ex#3.8"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("4")){
            this.part2ExMain.modelsArr.add(new Model("Ex#4.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#4.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#4.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#4.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#4.5"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("5")){
            this.part2ExMain.modelsArr.add(new Model("Ex#5.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#5.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#5.3"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("6")){
            this.part2ExMain.modelsArr.add(new Model("Ex#6.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.5"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.6"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.7"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.8"));
            this.part2ExMain.modelsArr.add(new Model("Ex#6.9"));
        } else if (this.part2ExMain.chapterNoReceived.equalsIgnoreCase("7")){
            this.part2ExMain.modelsArr.add(new Model("Ex#7.1"));
            this.part2ExMain.modelsArr.add(new Model("Ex#7.2"));
            this.part2ExMain.modelsArr.add(new Model("Ex#7.3"));
            this.part2ExMain.modelsArr.add(new Model("Ex#7.4"));
            this.part2ExMain.modelsArr.add(new Model("Ex#7.5"));
        }
    }
}