package life.homail.notesapp.Maths.MathChaptersPage;

import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class MathChViews {

    private Button chapterOneBtn;
    private Button chapterTwoBtn;
    private Button chapterThreeBtn;
    private Button chapterFourBtn;
    private Button chapterFiveBtn;
    private Button chapterSixBtn;
    private Button chapterSevenBtn;


    private MathChapterMain mathChapterMain;

    public MathChViews(MathChapterMain mathChapterMain) {
        this.mathChapterMain = mathChapterMain;
        this.initializeViews();
        this.setEventHandlers();

    }
    private void initializeViews(){
        this.chapterOneBtn=this.mathChapterMain.findViewById(R.id.chapterOneBtn);
        this.chapterTwoBtn=this.mathChapterMain.findViewById(R.id.chapterTwoBtn);
        this.chapterThreeBtn=this.mathChapterMain.findViewById(R.id.chapterThreeBtn);
        this.chapterFourBtn=this.mathChapterMain.findViewById(R.id.chapterFourBtn);
        this.chapterFiveBtn=this.mathChapterMain.findViewById(R.id.chapterFiveBtn);
        this.chapterSixBtn=this.mathChapterMain.findViewById(R.id.chapterSixBtn);
        this.chapterSevenBtn=this.mathChapterMain.findViewById(R.id.chapterSevenBtn);
    }

    private void setEventHandlers(){
        this.chapterOneBtn.setOnClickListener(e->this.showDialog("1"));
        this.chapterTwoBtn.setOnClickListener(e->this.showDialog("2"));
        this.chapterThreeBtn.setOnClickListener(e->this.showDialog("3"));
        this.chapterFourBtn.setOnClickListener(e->this.showDialog("4"));
        this.chapterFiveBtn.setOnClickListener(e->this.showDialog("5"));
        this.chapterSixBtn.setOnClickListener(e->this.showDialog("6"));
        this.chapterSevenBtn.setOnClickListener(e->this.showDialog("7"));
    }

    private void showDialog(String chNo){
        this.mathChapterMain.getMathDialogClass().getMathDialog(chNo).show();
    }
}
