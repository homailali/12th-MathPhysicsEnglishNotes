package life.homail.notesapp.Maths.MathExerciseViewerMain;
import android.content.res.Configuration;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;

import life.homail.notesapp.R;
import androidx.appcompat.app.AppCompatActivity;
public class MathExerciseViewerMain extends AppCompatActivity{
    // Fields

    protected String chapterNo;
    protected String exerciseNo;
    protected MathExViewerViews mathExViewerViews;
    protected MathViewExercises mathViewExercises=new MathViewExercises(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_ex_viewer_activity);
        this.atEndOfOnCreate();
        this.getIntentData();
        this.transferControl();
        this.onConfigChanged(getResources().getConfiguration());
    }

    public void onConfigChanged(Configuration configuration) {
        if (configuration.orientation==Configuration.ORIENTATION_PORTRAIT){
            this.mathExViewerViews.pdfView.resetZoom();
        } else if (configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
            this.mathExViewerViews.pdfView.resetZoom();
            this.mathExViewerViews.pdfView.zoomTo(this.mathExViewerViews.pdfView.getZoom()+1f);
        }
    }
    private void atEndOfOnCreate(){
        this.mathExViewerViews =new MathExViewerViews(this);

    }
    private void getIntentData(){
        Intent intent=getIntent();
        this.chapterNo=intent.getStringExtra("chapterNo");
        this.exerciseNo=intent.getStringExtra("exNo");
    }
    private void transferControl(){
        this.mathViewExercises.mathViewExercisesMain();
    }



}