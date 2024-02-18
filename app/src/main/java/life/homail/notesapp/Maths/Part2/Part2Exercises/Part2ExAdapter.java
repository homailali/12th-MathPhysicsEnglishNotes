package life.homail.notesapp.Maths.Part2.Part2Exercises;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part2ExAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Part2ExMain part2ExMain;
    public Part2ExAdapter(Part2ExMain part2ExMain) {
        this.part2ExMain = part2ExMain;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part2ExMain).inflate(R.layout.math_ex_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exNoTv.setText(this.part2ExMain.modelsArr.get(position).getExNo());
        holder.exNoTv.setOnClickListener(e->{
            this.part2ExMain.exRcItemHandler.exRcItemHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part2ExMain.modelsArr.size();
    }
}
class ViewHolder extends RecyclerView.ViewHolder{
    protected TextView exNoTv;
    public ViewHolder (View itemView){
        super(itemView);
        this.exNoTv=itemView.findViewById(R.id.exNoTv);
    }
}
