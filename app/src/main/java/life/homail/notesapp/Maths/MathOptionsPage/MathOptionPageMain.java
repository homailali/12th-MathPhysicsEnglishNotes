package life.homail.notesapp.Maths.MathOptionsPage;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import life.homail.notesapp.Maths.MathExercisesPage.MathExMain;
import life.homail.notesapp.Maths.MathMcqsPage.MathMcqsPageMain;
import life.homail.notesapp.R;
public class MathOptionPageMain extends AppCompatActivity{
    protected String chNoReceived;
    private Button exBtn;
    private Button mcqBtn;
    private RecyclerView rcView;
    private TextView chNoTv;
    protected ArrayList<String> btnTextArr=new ArrayList<>();
    protected MathOpPgAdapter mathOpPgAdapter;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_option_activity);
        this.initializeViews();
        this.getChName();
        this.setChNo();
        this.addBtnTextsToArr();
        this.rcViewAndAdapterSettings();
    }
    private void rcViewAndAdapterSettings(){
        this.mathOpPgAdapter=new MathOpPgAdapter(this);
        this.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.rcView.setAdapter(this.mathOpPgAdapter);
    }
    private void addBtnTextsToArr(){
        this.btnTextArr.add("Show mcq's");
        this.btnTextArr.add("Show exercises");
    }
    private void setChNo(){
        this.chNoTv.setText("Chapter "+this.chNoReceived);
    }
    private void getChName(){
        Intent intent=getIntent();
        this.chNoReceived=intent.getStringExtra("chapterNo");
    }
    private void initializeViews(){
        this.chNoTv=super.findViewById(R.id.chNoTv);
        this.rcView=super.findViewById(R.id.rcView);
    }
}