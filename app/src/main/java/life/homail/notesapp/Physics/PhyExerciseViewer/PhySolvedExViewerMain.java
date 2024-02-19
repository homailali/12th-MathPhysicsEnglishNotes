package life.homail.notesapp.Physics.PhyExerciseViewer;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import life.homail.notesapp.R;
public class PhySolvedExViewerMain extends AppCompatActivity{
    private String chNoReceived;
    private PDFView pdfView;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.phy_solved_ex_viewer);
        this.initializeViews();
        this.getChNoReceived();
        this.setPdfBasedOnChapter();
        this.onConfigurationChanged(getResources().getConfiguration());
    }
    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation==Configuration.ORIENTATION_PORTRAIT){
            this.pdfView.resetZoom();
        } else if (configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
            this.pdfView.resetZoom();
            this.pdfView.zoomTo(this.pdfView.getZoom()+1f);
        }
    }
    private void setPdfBasedOnChapter(){
        switch (this.chNoReceived){
            case "12"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (12).pdf");
            case "13"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (13).pdf");
            case "14"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (14).pdf");
            case "15"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (15).pdf");
            case "16"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (16).pdf");
            case "17"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (17).pdf");
            case "18"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (18).pdf");
            case "19"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (19).pdf");
            case "20"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (20).pdf");
            case "21"-> this.settingPdf("PhysicsPdf/SolvedExercise/phy_solved_exercise (21).pdf");
        }
    }
    private void settingPdf(String assetPath){

        this.pdfView.fromAsset(assetPath).load();
    }
    private void getChNoReceived(){
        Intent intent=getIntent();
        this.chNoReceived=intent.getStringExtra("chapterNo");
    }
    private void initializeViews(){
        this.pdfView=super.findViewById(R.id.pdfView);
    }
}
