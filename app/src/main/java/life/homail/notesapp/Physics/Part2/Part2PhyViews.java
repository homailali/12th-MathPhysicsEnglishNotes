package life.homail.notesapp.Physics.Part2;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part2PhyViews {
    private Part2PhyMain part2PhyMain;
    protected RecyclerView rcView;
    public Part2PhyViews(Part2PhyMain part2PhyMain) {
        this.part2PhyMain = part2PhyMain;
        this.initializeViews();
    }
    private void initializeViews(){
        this.rcView=this.part2PhyMain.findViewById(R.id.rcView);
        this.fillPart2ModelArr();
    }
    private void fillPart2ModelArr(){
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 12 - Electrostatics"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 13 - Current electricity"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 14 - Electromagnetism"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 15 - Electromagnetic induction"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 16 - Alternating current"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 17 - physics of solid"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 18 - Electronics"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 19 - Dawn of modern physics"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 20 - Atomic spectra"));
        this.part2PhyMain.part2ChPhyModelArr.add(new Part2ChPhyModel("Chapter 21 - Nuclear physics"));
    }
}