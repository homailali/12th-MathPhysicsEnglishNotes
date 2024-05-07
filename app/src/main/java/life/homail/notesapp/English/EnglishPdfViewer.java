package life.homail.notesapp.English;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;
import life.homail.notesapp.R;
public class EnglishPdfViewer extends AppCompatActivity {
    private String whichThingToShow;
    private PDFView englishPdfView;
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.english_pdf_viewer);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.getIntentData();
        this.englishPdfView=super.findViewById(R.id.englishPdfView);
        this.setPdfs();
    }
    private void getIntentData(){
        Intent intent=getIntent();
        whichThingToShow=intent.getStringExtra("whichThingToShow");
    }
    private void setPdfs(){
        this.englishPdfView.fromAsset(
                whichThingToShow.equalsIgnoreCase("essays")?"EnglishPdfs/Essays.pdf":
                whichThingToShow.equalsIgnoreCase("idioms")?"EnglishPdfs/Idioms.pdf":
                whichThingToShow.equalsIgnoreCase("mrChips")?"EnglishPdfs/MrChips.pdf":
                "EnglishPdfs/ModernProseAndHeroes.pdf"
        ).onRender((nbPages, pageWidth, pageHeight) -> this.englishPdfView.fitToWidth()).load();
    }
}