package life.homail.notesapp.Physics.Part2;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import life.homail.notesapp.R;
public class Part2PhyMain extends AppCompatActivity{
    protected Part2Adapter part2Adapter;
    protected Part2PhyViews part2PhyViews;
    protected ArrayList<Part2ChPhyModel> part2ChPhyModelArr=new ArrayList<>();
    protected Part2PhyRcHandler part2PhyRcHandler=new Part2PhyRcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_part2_ch_activity);
        this.changeStatusBarColor();
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.part2PhyViews=new Part2PhyViews(this);
        this.part2Adapter=new Part2Adapter(this);
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.part2PhyViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part2PhyViews.rcView.setAdapter(this.part2Adapter);
    }
    private void changeStatusBarColor(){
        Window window=getWindow();
        window.setStatusBarColor(Color.BLACK);
    }
}
