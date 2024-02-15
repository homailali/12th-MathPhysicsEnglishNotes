package life.homail.notesapp.ExerciseViewerMain;

import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class ExViewerViews {
    private ExerciseViewerMain exerciseViewerMain;
    protected RecyclerView rcView;


    public ExViewerViews(ExerciseViewerMain exerciseViewerMain) {
        this.exerciseViewerMain = exerciseViewerMain;
        this.initializeViews();
    }

    private void initializeViews(){
        this.rcView=this.exerciseViewerMain.findViewById(R.id.rcView);
    }
}
