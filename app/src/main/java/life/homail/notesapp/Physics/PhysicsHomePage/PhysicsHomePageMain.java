package life.homail.notesapp.Physics.PhysicsHomePage;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import life.homail.notesapp.R;
public class PhysicsHomePageMain extends AppCompatActivity{


    protected PhysicsHPViews physicsHPViews;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_hp_activity);
        this.atEndOfOnCreate();
    }


    private void atEndOfOnCreate(){
        this.physicsHPViews=new PhysicsHPViews(this);
    }

}
