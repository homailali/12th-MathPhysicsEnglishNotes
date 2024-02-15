package life.homail.notesapp.Part2Exercises;
import android.content.Intent;
import android.os.Bundle;
import life.homail.notesapp.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
public class Part2ExMain extends AppCompatActivity{
    protected Part2ExViews part2ExViews;
    protected Part2ExAdapter part2ExAdapter;
    protected String chapterNoReceived;
    protected ArrayList<Model> modelsArr=new ArrayList<>();
    protected ExRcItemHandler exRcItemHandler=new ExRcItemHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.part2_ex_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.getChapterNoReceived();
        this.part2ExViews=new Part2ExViews(this);
        this.part2ExAdapter=new Part2ExAdapter(this);
        this.rcViewSettings();
    }
    private void getChapterNoReceived(){
        Intent intent=getIntent();
        this.chapterNoReceived=intent.getStringExtra("chapter");
        System.out.println(this.chapterNoReceived);
    }
    private void rcViewSettings(){
        this.part2ExViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part2ExViews.rcView.setAdapter(this.part2ExAdapter);
    }
}
