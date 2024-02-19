package life.homail.notesapp.HomePage;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import life.homail.notesapp.R;
public class HomeMain extends AppCompatActivity {
    // Fields
    protected RecyclerView rcView;
    protected HomePageAdapter homePageAdapter;
    protected HomeBtnEventHandler homeBtnEventHandler;
    protected ArrayList<HomeModel> btnTitles=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.home_activity);
        this.atEndOfOnCreate();
    }
    private void atEndOfOnCreate(){
        this.addBtnTitles();
        this.initializeBtnEventHandler();
        this.homePageAdapter=new HomePageAdapter(this);
        this.rcViewSettings();
    }
    private void rcViewSettings(){
        this.rcView=super.findViewById(R.id.rcView);
        this.rcView.setLayoutManager(new LinearLayoutManager(this));
        this.rcView.setAdapter(this.homePageAdapter);
    }
    private void initializeBtnEventHandler(){
        this.homeBtnEventHandler =new HomeBtnEventHandler(this);
    }
    private void addBtnTitles(){
        this.btnTitles.add(new HomeModel("Math notes"));
        this.btnTitles.add(new HomeModel("Physics notes"));
    }
}