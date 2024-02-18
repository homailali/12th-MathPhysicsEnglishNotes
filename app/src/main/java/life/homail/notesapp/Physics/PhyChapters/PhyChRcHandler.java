package life.homail.notesapp.Physics.PhyChapters;

import android.content.Intent;

import life.homail.notesapp.Physics.PhyOptions.PhyOptionsMain;

public class PhyChRcHandler {
    private PhyChMain phyChMain;
    public PhyChRcHandler(PhyChMain phyChMain) {
        this.phyChMain = phyChMain;
    }



    protected void part2PhyRcHandlerMain(int position){
        Intent intent=new Intent(this.phyChMain, PhyOptionsMain.class);
        intent.putExtra("chapterNo",String.valueOf(position+12));
        this.phyChMain.startActivity(intent);
    }
}
