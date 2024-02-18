package life.homail.notesapp.Maths.MathHomePage;
import android.os.Bundle;
import life.homail.notesapp.R;
import androidx.appcompat.app.AppCompatActivity;
public class MathMain extends AppCompatActivity {
    // Fields
    protected MathViews mathViews;
    // Methods
    @Override
    public void onCreate(Bundle getCodeFromParent){
        super.onCreate(getCodeFromParent);
        super.setContentView(R.layout.math_hp_activity);
        this.initializeMathViewsObj();
    }
    private void initializeMathViewsObj(){
        this.mathViews=new MathViews(this);
    }
}