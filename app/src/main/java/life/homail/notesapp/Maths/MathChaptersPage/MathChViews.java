package life.homail.notesapp.Maths.MathChaptersPage;

import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class MathChViews {
    private MathChapterMain MathChapterMain;
    protected RecyclerView rcView;
    public MathChViews(MathChapterMain MathChapterMain) {
        this.MathChapterMain = MathChapterMain;
        this.initializeViews();
        this.fillModelArr();
    }
    private void initializeViews(){
        this.rcView=this.MathChapterMain.findViewById(R.id.rcView);
    }

    private void fillModelArr(){
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 1 - Functions & limits"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 2 - Differentiation"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 3 - Integration"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 4 - Intro to analytical geometry"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 5 - Linear inequalities & linear programming"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 6 - Conic Sections"));
        this.MathChapterMain.MathChModelArr.add(new MathChModel("Chapter 7 - Vectors"));
    }
}
