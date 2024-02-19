package life.homail.notesapp.HomePage;

import android.content.Intent;
import android.view.View;

import life.homail.notesapp.Maths.MathChaptersPage.MathChapterMain;
import life.homail.notesapp.Physics.PhyChapters.PhyChMain;

public class HomeBtnEventHandler {
    // Fields
    private HomeMain homeMain;

    // Constructor
    public HomeBtnEventHandler(HomeMain homeMain) {
        this.homeMain = homeMain;

    }
    // Methods
    protected void btnEventHandlerMain(int position){
        position+=1;
        if (position==1){
            Intent intent=new Intent(this.homeMain, MathChapterMain.class);
            this.homeMain.startActivity(intent);
        } else if (position==2){
            Intent intent=new Intent(this.homeMain, PhyChMain.class);
            this.homeMain.startActivity(intent);
        }
    }
}