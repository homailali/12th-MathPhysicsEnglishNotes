package life.homail.notesapp.Physics.PhyOptions;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.Physics.PhyExerciseViewer.PhySolvedExViewerMain;
import life.homail.notesapp.R;
public class PhyOpAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private PhyOptionsMain phyOptionsMain;
    public PhyOpAdapter(PhyOptionsMain phyOptionsMain) {
        this.phyOptionsMain = phyOptionsMain;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.phyOptionsMain).inflate(R.layout.phy_btn_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.button.setText(this.phyOptionsMain.btnTextsArr.get(position));
        holder.button.setOnClickListener(e->{
            Intent intent=new Intent(this.phyOptionsMain, PhySolvedExViewerMain.class);
            intent.putExtra("chapterNo",this.phyOptionsMain.chNoReceived);
            this.phyOptionsMain.startActivity(intent);
        });
    }
    @Override
    public int getItemCount() {
        return this.phyOptionsMain.btnTextsArr.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
    protected Button button;
    public MyViewHolder (View view){
        super(view);
        this.button=view.findViewById(R.id.button);
    }
}