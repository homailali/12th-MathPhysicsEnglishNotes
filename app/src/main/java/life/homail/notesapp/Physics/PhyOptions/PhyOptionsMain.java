package life.homail.notesapp.Physics.PhyOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import life.homail.notesapp.Physics.PhyExerciseViewer.PhySolvedExViewerMain;
import life.homail.notesapp.R;

public class PhyOptionsMain extends AppCompatActivity{
    private String chNoReceived;
    private TextView chNoTv;
    private Button showSolvedExBtn;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_option_activity);
        this.initializeViews();
        this.getChNoReceived();
        this.setChNo();
        this.showSolvedExBtnHandler();
    }
    private void showSolvedExBtnHandler(){
        this.showSolvedExBtn.setOnClickListener(e->{
            Intent intent=new Intent(this, PhySolvedExViewerMain.class);
            intent.putExtra("chapterNo",this.chNoReceived);
            super.startActivity(intent);
        });
    }
    private void initializeViews(){
        this.chNoTv=super.findViewById(R.id.chNoTv);
        this.showSolvedExBtn=super.findViewById(R.id.showSolvedExBtn);
    }
    private void getChNoReceived(){
        Intent intent=getIntent();
        this.chNoReceived=intent.getStringExtra("chapterNo");
    }
    private void setChNo(){

        this.chNoTv.setText("Chapter "+this.chNoReceived);
    }
}