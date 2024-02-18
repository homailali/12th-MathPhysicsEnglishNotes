package life.homail.notesapp.Maths.MathOptionsPage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import life.homail.notesapp.Maths.MathExercisesPage.MathExMain;
import life.homail.notesapp.Maths.MathMcqsPage.MathMcqsPageMain;
import life.homail.notesapp.R;

public class MathOptionPageMain extends AppCompatActivity{
    private String chNoReceived;

    private Button exBtn;
    private Button mcqBtn;
    private TextView chNoTv;


    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_option_activity);
        this.initializeViews();
        this.getChName();
        this.setChNo();
        this.setEventHandlers();
    }




    private void setEventHandlers(){
        this.mcqBtn.setOnClickListener(e->{
            this.changeActivity(MathMcqsPageMain.class,this.chNoReceived);
        });
        this.exBtn.setOnClickListener(e->{
            this.changeActivity(MathExMain.class,this.chNoReceived);
        });
    }

    private void changeActivity(Class<? extends AppCompatActivity> classToGo,String chNoReceived){
        Intent intent=new Intent(this,classToGo);
        intent.putExtra("chapterNo",chNoReceived);
        super.startActivity(intent);
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
        this.exBtn=super.findViewById(R.id.exBtn);
        this.mcqBtn=super.findViewById(R.id.mcqBtn);
    }

}
