package life.homail.notesapp.English;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import life.homail.notesapp.R;

public class EnglishMain extends AppCompatActivity {

    private Button allEssaysBtn;
    private Button allIdiomsBtn;
    private Button mrChipsBtn;
    private Button modernProsAndHeroesBtn;


    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.english_main_xml);
        this.initializeViews();
        this.setEventHandlers();
    }


    private void initializeViews(){
        this.allEssaysBtn=super.findViewById(R.id.allEssaysBtn);
        this.allIdiomsBtn=super.findViewById(R.id.allIdiomsBtn);
        this.mrChipsBtn=super.findViewById(R.id.mrChipsBtn);
        this.modernProsAndHeroesBtn=super.findViewById(R.id.modernProseAndHeroesBtn);
    }

    private void setEventHandlers(){
        this.allEssaysBtn.setOnClickListener(e->this.changeIntent("essays"));
        this.allIdiomsBtn.setOnClickListener(e->this.changeIntent("idioms"));
        this.mrChipsBtn.setOnClickListener(e->this.changeIntent("mrChips"));
        this.modernProsAndHeroesBtn.setOnClickListener(e->this.changeIntent("modernProsAndHeroes"));
    }
    private void changeIntent(String thingToShow){
        Intent intent=new Intent(this,EnglishPdfViewer.class);
        intent.putExtra("whichThingToShow",thingToShow);
        super.startActivity(intent);
    }

}
