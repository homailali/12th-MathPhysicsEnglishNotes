package life.homail.notesapp.Maths.MathChaptersPage;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;
public class MathChapterMain extends AppCompatActivity{
    protected MathChViews MathChViews;
    protected MathChAdapter mathChAdapter;
    protected ArrayList<MathChModel> MathChModelArr =new ArrayList<>();
    protected MathChRcHandler MathChRcHandler =new MathChRcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_chapter_activity);
        this.doAtEndOfOnCreate();
    }
    private void doAtEndOfOnCreate(){
        MathChViews =new MathChViews(this);
        mathChAdapter=new MathChAdapter(this);
        this.rcViewSettings();
    }

    private void rcViewSettings(){
        this.MathChViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.MathChViews.rcView.setAdapter(this.mathChAdapter);
    }

}