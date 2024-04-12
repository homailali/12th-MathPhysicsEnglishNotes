package life.homail.notesapp.HomePage;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import life.homail.notesapp.English.EnglishMain;
import life.homail.notesapp.Maths.MathChaptersPage.MathChapterMain;
import life.homail.notesapp.Maths.MathExercisesPage.MathExMain;
import life.homail.notesapp.Physics.PhyChapters.PhyChMain;
import life.homail.notesapp.R;
public class HomeMain extends AppCompatActivity {
    // Fields


    private Button mathNotesBtn;
    private Button englishNotesBtn;
    private Button physicsNotesBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.home_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.initializeViews();
        this.setEventHandlers();
    }

    private void initializeViews(){
        this.mathNotesBtn=super.findViewById(R.id.mathNotesBtn);
        this.physicsNotesBtn=super.findViewById(R.id.physicsNotesBtn);
        this.englishNotesBtn=super.findViewById(R.id.englishNotesBtn);
    }

    private void setEventHandlers(){
        this.mathNotesBtn.setOnClickListener(e->this.changeIntent(MathChapterMain.class));
        this.physicsNotesBtn.setOnClickListener(e->this.changeIntent(PhyChMain.class));
        this.englishNotesBtn.setOnClickListener(e->this.changeIntent(EnglishMain.class));
    }



    private void changeIntent(Class<? extends AppCompatActivity> classToChangeTo){
        Intent intent = new Intent(this,classToChangeTo);
        super.startActivity(intent);
    }
}