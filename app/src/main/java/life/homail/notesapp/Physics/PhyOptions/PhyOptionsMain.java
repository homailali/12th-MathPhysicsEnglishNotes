package life.homail.notesapp.Physics.PhyOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import life.homail.notesapp.Physics.PhyExerciseViewer.PhySolvedExViewerMain;
import life.homail.notesapp.R;

public class PhyOptionsMain extends AppCompatActivity{
    protected String chNoReceived;
    private TextView chNoTv;
    protected PhyOpAdapter phyOpAdapter;
    protected RecyclerView rcView;
    protected ArrayList<String> btnTextsArr=new ArrayList<>();
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_option_activity);
        this.initializeViews();
        this.getChNoReceived();
        this.setChNo();
        this.addTextToBtnTextsArr();
        this.rcViewAndAdapterSettings();
    }
    private void rcViewAndAdapterSettings(){
        this.phyOpAdapter=new PhyOpAdapter(this);
        this.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.rcView.setAdapter(this.phyOpAdapter);
    }
    private void initializeViews() {
        this.chNoTv=super.findViewById(R.id.chNoTv);
        this.rcView=super.findViewById(R.id.rcView);
    }
    private void getChNoReceived(){
        Intent intent=getIntent();
        this.chNoReceived=intent.getStringExtra("chapterNo");
    }
    private void setChNo(){

        this.chNoTv.setText("Chapter "+this.chNoReceived);
    }

    private void addTextToBtnTextsArr(){
        this.btnTextsArr.add("Show solved exercise");
    }
}