package life.homail.notesapp.Physics.Part1;

import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class Part1PhyViews {
    private Part1PhyMain part1PhyMain;
    protected RecyclerView rcView;
    public Part1PhyViews(Part1PhyMain part1PhyMain) {
        this.part1PhyMain = part1PhyMain;
        this.initializeViews();
        this.fillPart1ModelArr();
    }
    private  void initializeViews(){
        this.rcView=this.part1PhyMain.findViewById(R.id.rcView);
    }


    private void fillPart1ModelArr(){
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 1 - Measurements"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 2 - Vectors and equilibrium"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 3 - Motion and force"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 4 - Work and energy"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 5 - Circular motion"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 6 - Fluid dynamics"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 7 - Oscillations"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 8 - Waves"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 9 - Physical optics"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 10 - Optical instruments"));
        this.part1PhyMain.part1ChPhyModelArr.add(new Part1ChPhyModel("Chapter 11 - Heat and thermodynamics"));
    }

}
