package life.homail.notesapp.Maths.MathExerciseViewerMain;
public class MathViewExercises {
    private MathExerciseViewerMain mathExerciseViewerMain;
    public MathViewExercises(MathExerciseViewerMain mathExerciseViewerMain) {
        this.mathExerciseViewerMain = mathExerciseViewerMain;
    }
    protected void part2ExViewerMain(){
        switch (this.mathExerciseViewerMain.chapterNo){
            case "1"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch1/ex_1_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch1/ex_1_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch1/ex_1_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch1/ex_1_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch1/ex_1_5.pdf");
                }
            }
            case "2"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_5.pdf");
                    case "6"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_6.pdf");
                    case "7"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_7.pdf");
                    case "8"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_8.pdf");
                    case "9"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_9.pdf");
                    case "10"-> this.setPdf("MathPdfs/Exercises/Ch2/ex_2_10.pdf");
                }
            }
            case "3"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_5.pdf");
                    case "6"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_6.pdf");
                    case "7"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_7.pdf");
                    case "8"-> this.setPdf("MathPdfs/Exercises/Ch3/ex_3_8.pdf");
                }
            }
            case "4"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch4/ex_4_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch4/ex_4_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch4/ex_4_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch4/ex_4_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch4/ex_4_5.pdf");
                }
            }
            case "5"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch5/ex_5_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch5/ex_5_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch5/ex_5_3.pdf");
                }
            }
            case "6"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_5.pdf");
                    case "6"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_6.pdf");
                    case "7"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_7.pdf");
                    case "8"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_8.pdf");
                    case "9"-> this.setPdf("MathPdfs/Exercises/Ch6/ex_6_9.pdf");
                }
            }
            case "7"->{
                switch (this.mathExerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Exercises/Ch7/ex_7_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Exercises/Ch7/ex_7_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Exercises/Ch7/ex_7_3.pdf");
                    case "4"-> this.setPdf("MathPdfs/Exercises/Ch7/ex_7_4.pdf");
                    case "5"-> this.setPdf("MathPdfs/Exercises/Ch7/ex_7_5.pdf");
                }
            }
        }
    }
    private void setPdf(String assetPath){
        this.mathExerciseViewerMain.mathExViewerViews.pdfView.fromAsset(assetPath).load();
    }
}