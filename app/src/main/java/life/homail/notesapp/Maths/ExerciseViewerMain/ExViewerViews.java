package life.homail.notesapp.Maths.ExerciseViewerMain;

import androidx.recyclerview.widget.RecyclerView;

import com.github.barteksc.pdfviewer.PDFView;

import life.homail.notesapp.R;

public class ExViewerViews {
    private ExerciseViewerMain exerciseViewerMain;
    protected RecyclerView rcView;
    protected PDFView pdfView;

    public ExViewerViews(ExerciseViewerMain exerciseViewerMain) {
        this.exerciseViewerMain = exerciseViewerMain;
        this.initializeViews();
    }

    private void initializeViews(){
        this.rcView=this.exerciseViewerMain.findViewById(R.id.rcView);
        this.pdfView=this.exerciseViewerMain.findViewById(R.id.pdfView);
    }
}
