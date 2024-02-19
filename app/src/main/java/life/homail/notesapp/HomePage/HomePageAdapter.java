package life.homail.notesapp.HomePage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class HomePageAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private HomeMain homeMain;
    public HomePageAdapter(HomeMain homeMain) {
        this.homeMain = homeMain;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.homeMain).inflate(R.layout.btn_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.button.setText(this.homeMain.btnTitles.get(position).getBtnTitle());
        holder.button.setOnClickListener(e->{
            this.homeMain.homeBtnEventHandler.btnEventHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.homeMain.btnTitles.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
    protected Button button;
    public MyViewHolder(View view){
        super(view);
        this.button=view.findViewById(R.id.button);
    }
}