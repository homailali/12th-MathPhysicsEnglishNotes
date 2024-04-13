package life.homail.notesapp.Physics.PhyChapters;

import android.app.Dialog;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import life.homail.notesapp.Physics.PhyPdfViewer.PhySolvedPdfViewerMain;
import life.homail.notesapp.R;

public class PhyChDialogClass {
    private String chNoReceived;
    private Dialog phyChDialog;
    private PhyChMain phyChMain;
    private Button chapterNotesBtn;
    private Button exerciseNotesBtn;
    private TextView physicsChapterNoTv;
    protected PhyChDialogClass(PhyChMain phyChMain){
        this.phyChMain=phyChMain;
        this.setUpDialog();
    }

    private void setUpDialog(){
        this.phyChDialog=new Dialog(this.phyChMain);
        this.phyChDialog.setContentView(R.layout.phy_ch_dialog);
        this.initializeViews();
        this.setEventHandlers();
    }
    private void initializeViews(){
        this.chapterNotesBtn=this.phyChDialog.findViewById(R.id.chNotesBtn);
        this.exerciseNotesBtn=this.phyChDialog.findViewById(R.id.exerciseNotesBtn);
        this.physicsChapterNoTv=this.phyChDialog.findViewById(R.id.physicsChapterNoTv);
    }
    private void setEventHandlers(){
        this.chapterNotesBtn.setOnClickListener(e-> this.changeIntent(true));
        this.exerciseNotesBtn.setOnClickListener(e-> this.changeIntent(false));
    }

    private void changeIntent(boolean boolToPass){
        Intent intent=new Intent(this.phyChMain, PhySolvedPdfViewerMain.class);
        intent.putExtra("chapterNo",this.chNoReceived);
        intent.putExtra("chapterOrExercise",boolToPass);
        this.phyChMain.startActivity(intent);
        this.phyChDialog.dismiss();
    }






    public Dialog getPhyChDialog(String chNo) {
        this.chNoReceived=chNo;
        this.physicsChapterNoTv.setText("Chapter "+chNo);
        return phyChDialog;
    }

    public void setPhyChDialog(Dialog phyChDialog) {
        this.phyChDialog = phyChDialog;
    }


    public Button getChapterNotesBtn() {
        return chapterNotesBtn;
    }

    public void setChapterNotesBtn(Button chapterNotesBtn) {
        this.chapterNotesBtn = chapterNotesBtn;
    }

    public Button getExerciseNotesBtn() {
        return exerciseNotesBtn;
    }

    public void setExerciseNotesBtn(Button exerciseNotesBtn) {
        this.exerciseNotesBtn = exerciseNotesBtn;
    }
}