package life.homail.notesapp.Maths.MathExercisesPage;

import android.content.Intent;

import life.homail.notesapp.Maths.MathExerciseViewerMain.MathExerciseViewerMain;

public class MathExRcHandler {
    private MathExMain mathExMain;
    public MathExRcHandler(MathExMain mathExMain) {
        this.mathExMain = mathExMain;
    }
    // Methods
    protected void exRcItemHandlerMain(int position) {
        String exNo = String.valueOf(position + 1);
        String chNo = this.mathExMain.chapterNoReceived;
        Intent intent = new Intent(this.mathExMain, MathExerciseViewerMain.class);
        intent.putExtra("chapterNo", chNo);
        intent.putExtra("exNo", exNo);
        this.mathExMain.startActivity(intent);
    }
}