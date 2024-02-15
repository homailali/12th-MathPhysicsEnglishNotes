package life.homail.notesapp.ExerciseViewerMain;

import life.homail.notesapp.R;

public class Part2ExViewer {
    private ExerciseViewerMain exerciseViewerMain;
    public Part2ExViewer(ExerciseViewerMain exerciseViewerMain) {
        this.exerciseViewerMain = exerciseViewerMain;
    }
    protected void part2ExViewerMain(){
        switch (this.exerciseViewerMain.chapterNo){
            case "1"-> {
                switch (this.exerciseViewerMain.exerciseNo){
                    case "1"-> this.ch1Ex1Handler();

                }
            }
        }
    }

    private void ch1Ex1Handler(){
//        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_1));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_2));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_3));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_4));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_5));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_6));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_7));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_8));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_9));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_10));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_11));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_12));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_13));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_14));
        this.exerciseViewerMain.exViewerModelArr.add(new ExViewerModel(R.drawable.ex1_1_15));
    }

}