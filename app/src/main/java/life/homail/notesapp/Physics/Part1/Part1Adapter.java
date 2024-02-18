package life.homail.notesapp.Physics.Part1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1Adapter extends RecyclerView.Adapter<MyViewHolder>{
    private Part1PhyMain part1PhyMain;
    public Part1Adapter(Part1PhyMain part1PhyMain) {
        this.part1PhyMain = part1PhyMain;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part1PhyMain).inflate(R.layout.phy_ch_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.chNoChTitleTv.setText(this.part1PhyMain.part1ChPhyModelArr.get(position).getChNameAndTitle());
        myViewHolder.chNoChTitleTv.setOnClickListener(e->{
            this.part1PhyMain.part1PhyRcHandler.part1PhyRCHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part1PhyMain.part1ChPhyModelArr.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{
    protected TextView chNoChTitleTv;
    public MyViewHolder(View view){
        super(view);
        this.chNoChTitleTv=view.findViewById(R.id.chNoChTitleTv);
    }
}