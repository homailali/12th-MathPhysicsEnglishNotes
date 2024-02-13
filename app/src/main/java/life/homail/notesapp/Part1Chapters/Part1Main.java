package life.homail.notesapp.Part1Chapters;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;
public class Part1Main extends AppCompatActivity{
    protected Part1Views part1Views;
    protected Part1Adapter part1Adapter;
    protected ArrayList<Model> modelArr=new ArrayList<>();
    protected RcViewClickHandler rcViewClickHandler =new RcViewClickHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.part1_math_activity);
        this.initializePart1ViewsObj();
        this.adapterSettings();
        this.part1Views.addDataToModelArr();
        this.rcViewSettings();
    }




    private void rcViewSettings(){
        this.part1Views.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part1Views.rcView.setAdapter(this.part1Adapter);
    }
    private void adapterSettings(){
        this.part1Adapter=new Part1Adapter(this);
    }
    private void initializePart1ViewsObj(){
        this.part1Views=new Part1Views(this);
    }
}