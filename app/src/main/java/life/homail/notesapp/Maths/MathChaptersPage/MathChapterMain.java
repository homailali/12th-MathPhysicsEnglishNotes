package life.homail.notesapp.Maths.MathChaptersPage;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;
public class MathChapterMain extends AppCompatActivity{
    protected MathChViews mathChViews;
    private MathDialogClass mathDialogClass;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_chapter_activity);
        this.doAtEndOfOnCreate();
    }
    private void doAtEndOfOnCreate(){
        mathChViews =new MathChViews(this);
        this.mathDialogClass=new MathDialogClass(this);
    }


    public MathDialogClass getMathDialogClass() {
        return mathDialogClass;
    }

    public void setMathDialogClass(MathDialogClass mathDialogClass) {
        this.mathDialogClass = mathDialogClass;
    }
}