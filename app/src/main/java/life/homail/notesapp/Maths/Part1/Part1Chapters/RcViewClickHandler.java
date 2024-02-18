package life.homail.notesapp.Maths.Part1.Part1Chapters;
import android.content.Intent;

import life.homail.notesapp.Maths.Part1.Part1Exercises.Part1ExMain;
public class RcViewClickHandler {
    private Part1Main part1Main;
    public RcViewClickHandler(Part1Main part1Main) {
        this.part1Main = part1Main;
    }
    public void onClickMain(int position){
        Intent intent=new Intent(this.part1Main, Part1ExMain.class);
        intent.putExtra("chapter",String.valueOf(position+1));
        this.part1Main.startActivity(intent);
    }
}