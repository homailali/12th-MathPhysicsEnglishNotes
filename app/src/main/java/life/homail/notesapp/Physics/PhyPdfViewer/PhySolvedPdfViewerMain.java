package life.homail.notesapp.Physics.PhyPdfViewer;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;

import life.homail.notesapp.R;
public class PhySolvedPdfViewerMain extends AppCompatActivity{
    private String chNoReceived;
    private PDFView pdfView;
    private boolean showChapterOrExerciseNotes;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_pdf_viewer);
        this.initializeViews();
        this.getIntentData();
        this.setPdf();
    }
    private void setPdf(){
        switch (this.chNoReceived){
            case "12"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-12.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-12.pdf");
            case "13"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-13.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-13.pdf");
            case "14"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-14.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-14.pdf");
            case "15"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-15.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-15.pdf");
            case "16"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-16.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-16.pdf");
            case "17"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-17.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-17.pdf");
            case "18"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-18.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-18.pdf");
            case "19"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-19.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-19.pdf");
            case "20"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-20.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-20.pdf");
            case "21"-> this.settingPdf(showChapterOrExerciseNotes? "PhysicsPdf/Chapters/2nd_Year_Phy_Notes_Ch-21.pdf" :"PhysicsPdf/SolvedExercise/2nd Year Phy SQs Ch-21.pdf");
        }
    }




    private void settingPdf(String assetPath){

        this.pdfView.fromAsset(assetPath).onRender((nbPages, pageWidth, pageHeight) -> pdfView.fitToWidth()).load();
    }
    private void getIntentData(){
        Intent intent=getIntent();
        this.chNoReceived=intent.getStringExtra("chapterNo");
        this.showChapterOrExerciseNotes=intent.getBooleanExtra("chapterOrExercise",false);
    }
    private void initializeViews(){
        this.pdfView=super.findViewById(R.id.pdfView);
    }
}
