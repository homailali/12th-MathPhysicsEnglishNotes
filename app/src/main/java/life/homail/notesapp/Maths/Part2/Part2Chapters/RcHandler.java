package life.homail.notesapp.Maths.Part2.Part2Chapters;

import android.content.Intent;

import life.homail.notesapp.Maths.Part2.Part2Exercises.Part2ExMain;

public class RcHandler {
    private Part2Main part2Main;
    public RcHandler(Part2Main part2Main) {
        this.part2Main = part2Main;
    }
    protected void rcHolderMain(int position){
        Intent intent=new Intent(this.part2Main, Part2ExMain.class);
        intent.putExtra("chapter",String.valueOf(position+1));
        this.part2Main.startActivity(intent);
    }
}
