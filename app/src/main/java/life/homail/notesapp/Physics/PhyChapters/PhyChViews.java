package life.homail.notesapp.Physics.PhyChapters;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class PhyChViews {
    private PhyChMain phyChMain;
    protected RecyclerView rcView;
    public PhyChViews(PhyChMain phyChMain) {
        this.phyChMain = phyChMain;
        this.initializeViews();
    }
    private void initializeViews(){
        this.rcView=this.phyChMain.findViewById(R.id.rcView);
        this.fillPart2ModelArr();
    }
    private void fillPart2ModelArr(){
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 12 - Electrostatics"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 13 - Current electricity"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 14 - Electromagnetism"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 15 - Electromagnetic induction"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 16 - Alternating current"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 17 - physics of solid"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 18 - Electronics"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 19 - Dawn of modern physics"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 20 - Atomic spectra"));
        this.phyChMain.phyChModelArr.add(new PhyChModel("Chapter 21 - Nuclear physics"));
    }
}