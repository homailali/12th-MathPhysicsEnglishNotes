package life.homail.notesapp.Part2Chapters;

import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class Part2Views {
    private Part2Main part2Main;
    protected RecyclerView rcView;
    public Part2Views(Part2Main part2Main) {
        this.part2Main = part2Main;
        this.initializeViews();
        this.fillModelArr();
    }
    private void initializeViews(){
        this.rcView=this.part2Main.findViewById(R.id.rcView);
    }

    private void fillModelArr(){
        this.part2Main.modelArr.add(new Model("Chapter 1 - Functions & limits"));
        this.part2Main.modelArr.add(new Model("Chapter 2 - Differentiation"));
        this.part2Main.modelArr.add(new Model("Chapter 3 - Integration"));
        this.part2Main.modelArr.add(new Model("Chapter 4 - Intro to analytical geometry"));
        this.part2Main.modelArr.add(new Model("Chapter 5 - Linear inequalities & linear programming"));
        this.part2Main.modelArr.add(new Model("Chapter 6 - Conic Sections"));
        this.part2Main.modelArr.add(new Model("Chapter 7 - Vectors"));
    }
}
