package life.homail.notesapp.Physics.PhyChapters;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import life.homail.notesapp.R;
public class PhyChMain extends AppCompatActivity{
    protected PhyChViews phyChViews;
    private PhyChDialogClass physicsChDialog;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_ch_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.phyChViews =new PhyChViews(this);
        this.physicsChDialog=new PhyChDialogClass(this);
    }

    public PhyChDialogClass getPhyChDialogClass() {
        return physicsChDialog;
    }

    public void setPhyChDialogClass(PhyChDialogClass physicsChDialog) {
        this.physicsChDialog = physicsChDialog;
    }
}