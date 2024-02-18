package life.homail.notesapp.Maths.Part1.Part1Chapters;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1Views {
    // Fields
    private Part1Main part1Main;
    protected RecyclerView rcView;
    // Methods
    public Part1Views(Part1Main part1Main) {
        this.part1Main = part1Main;
        this.initializeViews();
    }
    private void initializeViews(){

        this.rcView=this.part1Main.findViewById(R.id.rcView);
    }
    protected void addDataToModelArr(){
        this.part1Main.modelArr.add(new Model("Chapter 1 - Number Systems"));
        this.part1Main.modelArr.add(new Model("Chapter 2 - Sets, Functions & Groups"));
        this.part1Main.modelArr.add(new Model("Chapter 3 - Matrices & Determinants"));
        this.part1Main.modelArr.add(new Model("Chapter 4 - Quadratic Equation"));
        this.part1Main.modelArr.add(new Model("Chapter 5 - Partial Fractions"));
        this.part1Main.modelArr.add(new Model("Chapter 6 - Sequence & series"));
        this.part1Main.modelArr.add(new Model("Chapter 7 - Permutation,Combination & Probability"));
        this.part1Main.modelArr.add(new Model("Chapter 8 - Mathematical induction & binomial theorem"));
        this.part1Main.modelArr.add(new Model("Chapter 9 - Fundamentals of trigonometry"));
        this.part1Main.modelArr.add(new Model("Chapter 10 - Trigonometric identities"));
        this.part1Main.modelArr.add(new Model("Chapter 11 - Trigonometric functions & their graphs"));
        this.part1Main.modelArr.add(new Model("Chapter 12 - Application of trigonometry"));
        this.part1Main.modelArr.add(new Model("Chapter 13 - Inverse trigonometric functions"));
        this.part1Main.modelArr.add(new Model("Chapter 14 - Solutions of trigonometric equations"));
    }
}