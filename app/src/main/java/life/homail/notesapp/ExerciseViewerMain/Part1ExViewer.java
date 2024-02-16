package life.homail.notesapp.ExerciseViewerMain;

public class Part1ExViewer {
    private ExerciseViewerMain exerciseViewerMain;
    public Part1ExViewer(ExerciseViewerMain exerciseViewerMain) {
        this.exerciseViewerMain = exerciseViewerMain;
    }

    protected void part1ExViewerMain(){
        switch (this.exerciseViewerMain.chapterNo){
            case "1"->{
                switch (this.exerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Part1Math/Ch1/ex_1_1.pdf");
                    case "2"-> this.setPdf("MathPdfs/Part1Math/Ch1/ex_1_2.pdf");
                    case "3"-> this.setPdf("MathPdfs/Part1Math/Ch1/ex_1_3.pdf");
                }
            }
            case "2"->{
                switch (this.exerciseViewerMain.exerciseNo){
                    case "1"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (1).pdf");
                    case "2"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (2).pdf");
                    case "3"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (3).pdf");
                    case "4"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (4).pdf");
                    case "5"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (5).pdf");
                    case "6"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (6).pdf");
                    case "7"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (7).pdf");
                    case "8"-> this.setPdf("MathPdfs/Part1Math/Ch2/ex_2 (8).pdf");
                }
            }
        }
    }

    private void setPdf(String assetPath){
        this.exerciseViewerMain.exViewerViews.pdfView.fromAsset(assetPath).load();
    }
}
