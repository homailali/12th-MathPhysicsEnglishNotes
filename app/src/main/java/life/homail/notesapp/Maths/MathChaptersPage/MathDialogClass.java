package life.homail.notesapp.Maths.MathChaptersPage;

import android.app.Dialog;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import life.homail.notesapp.Maths.MathExercisesPage.MathExMain;
import life.homail.notesapp.Maths.MathMcqsPage.MathMcqsPageMain;
import life.homail.notesapp.R;

public class MathDialogClass {
    private MathChapterMain mathChapterMain;
    private Dialog mathDialog;

    private String chapterNoReceived;

    private Button showExercisesBtn;
    private Button showMcqsBtn;
    private TextView mathChapterNoTv;

    protected  MathDialogClass (MathChapterMain mathChapterMain){
        this.mathChapterMain=mathChapterMain;
        this.setUpDialog();
    }



    private void setUpDialog(){
        this.mathDialog=new Dialog(this.mathChapterMain);
        this.mathDialog.setContentView(R.layout.math_dialog_class);
        this.initializeViews();
        this.setEventHandlers();
    }
    private void initializeViews(){
        this.showMcqsBtn=this.mathDialog.findViewById(R.id.showMcqsBtn);
        this.showExercisesBtn=this.mathDialog.findViewById(R.id.showExercisesBtn);
        this.mathChapterNoTv=this.mathDialog.findViewById(R.id.mathChapterNoTv);
    }
    private void setEventHandlers(){
        this.showMcqsBtn.setOnClickListener(e->this.changeIntent(MathMcqsPageMain.class));
        this.showExercisesBtn.setOnClickListener(e->this.changeIntent(MathExMain.class));
    }
    private void changeIntent(Class<? extends AppCompatActivity> classToGoTo){
        Intent intent=new Intent(this.mathChapterMain,classToGoTo);
        intent.putExtra("chapterNo",this.chapterNoReceived);
        this.mathChapterMain.startActivity(intent);
        this.mathDialog.dismiss();
    }





    public Dialog getMathDialog(String chapterNo) {
        this.chapterNoReceived=chapterNo;
        this.mathChapterNoTv.setText("Chapter "+chapterNo);
        return mathDialog;
    }

    public void setMathDialog(Dialog mathDialog) {
        this.mathDialog = mathDialog;
    }
}
