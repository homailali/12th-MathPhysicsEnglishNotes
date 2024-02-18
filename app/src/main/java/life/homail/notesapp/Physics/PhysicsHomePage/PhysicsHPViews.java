package life.homail.notesapp.Physics.PhysicsHomePage;
import life.homail.notesapp.R;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import life.homail.notesapp.Physics.Part1.Part1PhyMain;
import life.homail.notesapp.Physics.Part2.Part2PhyMain;
public class PhysicsHPViews{
    private Button part1PhysicsBtn;
    private Button part2PhysicsBtn;
    private PhysicsHomePageMain physicsHomePageMain;
    public PhysicsHPViews(PhysicsHomePageMain physicsHomePageMain) {
        this.physicsHomePageMain = physicsHomePageMain;
        this.initializeViews();
        this.setEventHandlers();
    }


    private void initializeViews(){
        this.part1PhysicsBtn=this.physicsHomePageMain.findViewById(R.id.part1PhysicsBtn);
        this.part2PhysicsBtn=this.physicsHomePageMain.findViewById(R.id.part2PhysicsBtn);
    }
    private void setEventHandlers(){
        this.part1PhysicsBtn.setOnClickListener(this::part1PhyBtnHandler);
        this.part2PhysicsBtn.setOnClickListener(this::part2PhyBtnHandler);
    }

    // Handling some events Here
    private void part1PhyBtnHandler(View view){
        Intent intent=new Intent(this.physicsHomePageMain, Part1PhyMain.class);
        this.physicsHomePageMain.startActivity(intent);
    }
    private void part2PhyBtnHandler(View view){
        Intent intent=new Intent(this.physicsHomePageMain, Part2PhyMain.class);
        this.physicsHomePageMain.startActivity(intent);
    }

}
