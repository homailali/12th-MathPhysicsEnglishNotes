package life.homail.notesapp.Maths.MathChaptersPage;

import android.content.Intent;

import life.homail.notesapp.Maths.MathOptionsPage.MathOptionPageMain;

public class MathChRcHandler {
    private MathChapterMain MathChapterMain;
    public MathChRcHandler(MathChapterMain MathChapterMain){
        this.MathChapterMain = MathChapterMain;
    }
    protected void rcHolderMain(int position){
        Intent intent=new Intent(this.MathChapterMain, MathOptionPageMain.class);
        intent.putExtra("chapterNo",String.valueOf(position+1));
        this.MathChapterMain.startActivity(intent);
    }
}