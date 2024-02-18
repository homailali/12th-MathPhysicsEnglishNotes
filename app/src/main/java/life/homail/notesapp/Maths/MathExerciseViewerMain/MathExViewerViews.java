package life.homail.notesapp.Maths.MathExerciseViewerMain;

import androidx.recyclerview.widget.RecyclerView;

import com.github.barteksc.pdfviewer.PDFView;

import life.homail.notesapp.R;

public class MathExViewerViews {
    private MathExerciseViewerMain mathExerciseViewerMain;
    protected RecyclerView rcView;
    protected PDFView pdfView;

    public MathExViewerViews(MathExerciseViewerMain mathExerciseViewerMain) {
        this.mathExerciseViewerMain = mathExerciseViewerMain;
        this.initializeViews();
    }

    private void initializeViews(){
        this.rcView=this.mathExerciseViewerMain.findViewById(R.id.rcView);
        this.pdfView=this.mathExerciseViewerMain.findViewById(R.id.pdfView);
    }
}
