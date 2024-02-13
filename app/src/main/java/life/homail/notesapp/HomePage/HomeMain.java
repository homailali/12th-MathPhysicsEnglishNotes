package life.homail.notesapp.HomePage;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import life.homail.notesapp.R;

public class HomeMain extends AppCompatActivity {
    // Fields
    private HomeViews homeViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.home_activity);
        this.initializeHomeViewsObj();

    }
    private void initializeHomeViewsObj(){
        this.homeViews=new HomeViews(this);
    }
}