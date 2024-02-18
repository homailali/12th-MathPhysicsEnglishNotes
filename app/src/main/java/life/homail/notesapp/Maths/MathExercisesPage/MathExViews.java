package life.homail.notesapp.Maths.MathExercisesPage;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class MathExViews {
    private MathExMain mathExMain;
    protected RecyclerView rcView;
    public MathExViews(MathExMain mathExMain){
        this.mathExMain = mathExMain;
        this.initializeViews();
        this.fillArrayList();
    }
    private void initializeViews(){
        this.rcView=this.mathExMain.findViewById(R.id.rcView);
    }


    private void fillArrayList(){
        if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("1")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#1.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#1.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#1.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#1.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#1.5"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("2")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.5"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.6"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.7"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.8"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.9"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#2.10"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("3")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.5"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.6"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.7"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#3.8"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("4")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#4.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#4.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#4.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#4.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#4.5"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("5")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#5.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#5.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#5.3"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("6")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.5"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.6"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.7"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.8"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#6.9"));
        } else if (this.mathExMain.chapterNoReceived.equalsIgnoreCase("7")){
            this.mathExMain.modelsArr.add(new MathExModel("Ex#7.1"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#7.2"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#7.3"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#7.4"));
            this.mathExMain.modelsArr.add(new MathExModel("Ex#7.5"));
        }
    }
}