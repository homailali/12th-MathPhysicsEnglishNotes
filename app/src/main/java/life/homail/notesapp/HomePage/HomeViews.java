package life.homail.notesapp.HomePage;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import life.homail.notesapp.Maths.MathChaptersPage.MathChapterMain;
import life.homail.notesapp.Physics.PhyChapters.PhyChMain;
import life.homail.notesapp.R;

public class HomeViews {
    // Fields
    private HomeMain homeMain;
    private Button mathNotesBtn;
    private Button physicsNotesBtn;
    // Constructor
    public HomeViews(HomeMain homeMain) {
        this.homeMain = homeMain;
        this.thingsToDoAfterConstructorIsCalled();
    }
    // Methods

    private void thingsToDoAfterConstructorIsCalled(){
        this.initializeViews();
        this.setEventHandlers();
    }

    private void initializeViews(){
        this.mathNotesBtn=this.homeMain.findViewById(R.id.mathNotesBtn);
        this.physicsNotesBtn=this.homeMain.findViewById(R.id.physicsNotesBtn);
    }
    private void setEventHandlers(){
        this.mathNotesBtn.setOnClickListener(this::mathNotesBtnHandler);
        this.physicsNotesBtn.setOnClickListener(this::physicsNotesBtnHandler);
    }

    // Handling some events here but i prefer creating a separate file
    private void mathNotesBtnHandler(View view){
        Intent intent=new Intent(this.homeMain, MathChapterMain.class);
        this.homeMain.startActivity(intent);
    }
    private void physicsNotesBtnHandler(View view){
        Intent intent=new Intent(this.homeMain, PhyChMain.class);
        this.homeMain.startActivity(intent);
    }
}
