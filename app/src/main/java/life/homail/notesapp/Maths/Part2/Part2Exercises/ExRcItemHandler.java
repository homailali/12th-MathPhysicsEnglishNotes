package life.homail.notesapp.Maths.Part2.Part2Exercises;

import android.content.Intent;

import life.homail.notesapp.Maths.ExerciseViewerMain.ExerciseViewerMain;

public class ExRcItemHandler{
    private Part2ExMain part2ExMain;
    public ExRcItemHandler(Part2ExMain part2ExMain) {
        this.part2ExMain = part2ExMain;
    }
    // Methods
    protected void exRcItemHandlerMain(int position) {
        String exNo = String.valueOf(position + 1);
        String chNo = this.part2ExMain.chapterNoReceived;

        Intent intent = new Intent(this.part2ExMain, ExerciseViewerMain.class);
        intent.putExtra("part","2");
        intent.putExtra("chapterNo", chNo);
        intent.putExtra("exNo", exNo);
        this.part2ExMain.startActivity(intent);
    }
}