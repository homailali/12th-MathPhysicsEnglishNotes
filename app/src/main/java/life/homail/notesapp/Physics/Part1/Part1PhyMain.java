package life.homail.notesapp.Physics.Part1;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import life.homail.notesapp.R;

public class Part1PhyMain extends AppCompatActivity{
    protected Part1Adapter part1Adapter;
    protected Part1PhyViews part1PhyViews;
    protected ArrayList<Part1ChPhyModel> part1ChPhyModelArr=new ArrayList<>();
    protected Part1PhyRcHandler part1PhyRcHandler=new Part1PhyRcHandler(this);
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_part1_ch_activity);
        this.changeStatusBarColor();
        this.atEndOfOnCreate();
    }


    private void atEndOfOnCreate(){
        this.part1PhyViews=new Part1PhyViews(this);
        this.part1Adapter=new Part1Adapter(this);
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.part1PhyViews.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.part1PhyViews.rcView.setAdapter(this.part1Adapter);
    }
    private void changeStatusBarColor(){
        Window window=getWindow();
        window.setStatusBarColor(Color.BLACK);
    }
}
