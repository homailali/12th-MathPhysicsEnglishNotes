package life.homail.notesapp.Physics.PhyChapters;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import life.homail.notesapp.R;
public class PhyChMain extends AppCompatActivity{
    protected PhyChAdapter phyChAdapter;
    protected PhyChViews phyChViews;
    protected ArrayList<PhyChModel> phyChModelArr =new ArrayList<>();
    protected PhyChRcHandler phyChRcHandler =new PhyChRcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_ch_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.phyChViews =new PhyChViews(this);
        this.phyChAdapter =new PhyChAdapter(this);
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.phyChViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.phyChViews.rcView.setAdapter(this.phyChAdapter);
    }
}
