package life.homail.notesapp.MathPage;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import life.homail.notesapp.R;
import life.homail.notesapp.Part1Chapters.Part1Main;
import life.homail.notesapp.Part2Chapters.Part2Main;
public class MathViews {
    // Fields
    private MathMain mathMain;
    protected Button part1MathBtn;
    protected Button part2MathBtn;
    // Constructor
    public MathViews(MathMain mathMain) {
        this.mathMain = mathMain;
        this.thingsToDoWhenConstructorIsCreated();
    }
    // Methods
    private void thingsToDoWhenConstructorIsCreated(){
        this.initializeViews();
        this.setClickListener();
    }
    private void initializeViews(){
        this.part1MathBtn=this.mathMain.findViewById(R.id.part1MathBtn);
        this.part2MathBtn=this.mathMain.findViewById(R.id.part2MathBtn);
    }
    private void setClickListener(){
        this.part1MathBtn.setOnClickListener(this::part1MathBtnHandler);
        this.part2MathBtn.setOnClickListener(this::part2MathBtnHandler);
    }
    // Handling some events here but better create a separate file
    private void part1MathBtnHandler(View view){
        Intent intent=new Intent(this.mathMain, Part1Main.class);
        this.mathMain.startActivity(intent);
    }
    private void part2MathBtnHandler(View view){
        Intent intent=new Intent(this.mathMain, Part2Main.class);
        this.mathMain.startActivity(intent);
    }
}