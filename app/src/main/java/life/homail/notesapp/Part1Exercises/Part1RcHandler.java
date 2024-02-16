package life.homail.notesapp.Part1Exercises;
import android.content.Intent;
import life.homail.notesapp.ExerciseViewerMain.ExerciseViewerMain;
public class Part1RcHandler {
    private Part1ExMain part1ExMain;
    public Part1RcHandler(Part1ExMain part1ExMain) {
        this.part1ExMain = part1ExMain;
    }
    protected void part1RcHandlerMain(int position){
        Intent intent=new Intent(this.part1ExMain, ExerciseViewerMain.class);
        intent.putExtra("exNo",String.valueOf(position+1));
        intent.putExtra("part","1");
        intent.putExtra("chapterNo",this.part1ExMain.chapterNoReceived);
        this.part1ExMain.startActivity(intent);
    }
}
