package life.homail.notesapp.Physics.PhyChapters;
import android.widget.Button;

import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class PhyChViews {
    private PhyChMain phyChMain;
    private Button ch12Btn;
    private Button ch13Btn;
    private Button ch14Btn;
    private Button ch15Btn;
    private Button ch16Btn;
    private Button ch17Btn;
    private Button ch18Btn;
    private Button ch19Btn;
    private Button ch20Btn;
    private Button ch21Btn;
    public PhyChViews(PhyChMain phyChMain) {
        this.phyChMain = phyChMain;
        this.initializeViews();
        this.setEventHandlers();
    }
    private void initializeViews(){
        this.ch12Btn=this.phyChMain.findViewById(R.id.ch12Btn);
        this.ch13Btn=this.phyChMain.findViewById(R.id.ch13Btn);
        this.ch14Btn=this.phyChMain.findViewById(R.id.ch14Btn);
        this.ch15Btn=this.phyChMain.findViewById(R.id.ch15Btn);
        this.ch16Btn=this.phyChMain.findViewById(R.id.ch16Btn);
        this.ch17Btn=this.phyChMain.findViewById(R.id.ch17Btn);
        this.ch18Btn=this.phyChMain.findViewById(R.id.ch18Btn);
        this.ch19Btn=this.phyChMain.findViewById(R.id.ch19Btn);
        this.ch20Btn=this.phyChMain.findViewById(R.id.ch20Btn);
        this.ch21Btn=this.phyChMain.findViewById(R.id.ch21Btn);
    }
    private void setEventHandlers(){
        this.ch12Btn.setOnClickListener(e-> this.changeIntent("12"));
        this.ch13Btn.setOnClickListener(e-> this.changeIntent("13"));
        this.ch14Btn.setOnClickListener(e-> this.changeIntent("14"));
        this.ch15Btn.setOnClickListener(e-> this.changeIntent("15"));
        this.ch16Btn.setOnClickListener(e-> this.changeIntent("16"));
        this.ch17Btn.setOnClickListener(e-> this.changeIntent("17"));
        this.ch18Btn.setOnClickListener(e-> this.changeIntent("18"));
        this.ch19Btn.setOnClickListener(e-> this.changeIntent("19"));
        this.ch20Btn.setOnClickListener(e-> this.changeIntent("20"));
        this.ch21Btn.setOnClickListener(e-> this.changeIntent("21"));
    }
    private void changeIntent(String chNo){
        this.phyChMain.getPhyChDialogClass().getPhyChDialog(chNo).show();
    }
}