package life.homail.notesapp.Maths.MathExercisesPage;
import android.content.Intent;
import android.os.Bundle;
import life.homail.notesapp.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
public class MathExMain extends AppCompatActivity{
    protected MathExViews mathExViews;
    protected MathExAdapter mathExAdapter;
    protected String chapterNoReceived;
    protected ArrayList<MathExModel> modelsArr=new ArrayList<>();
    protected MathExRcHandler mathExRcHandler =new MathExRcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_ex_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.getChapterNoReceived();
        this.mathExViews =new MathExViews(this);
        this.mathExAdapter=new MathExAdapter(this);
        this.rcViewSettings();
    }
    private void getChapterNoReceived(){
        Intent intent=getIntent();
        this.chapterNoReceived=intent.getStringExtra("chapterNo");
        System.out.println(this.chapterNoReceived);
    }
    private void rcViewSettings(){
        this.mathExViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.mathExViews.rcView.setAdapter(this.mathExAdapter);
    }

}
