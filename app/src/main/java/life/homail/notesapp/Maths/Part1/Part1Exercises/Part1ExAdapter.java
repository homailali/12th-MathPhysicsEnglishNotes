package life.homail.notesapp.Maths.Part1.Part1Exercises;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1ExAdapter extends RecyclerView.Adapter<Part1ExAdapter.ViewHolder>{
    private Part1ExMain part1ExMain;
    public Part1ExAdapter(Part1ExMain part1ExMain) {
        this.part1ExMain = part1ExMain;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part1ExMain).inflate(R.layout.math_ex_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exNo.setText(this.part1ExMain.modelArr.get(position).getExNo());
        holder.exNo.setOnClickListener(e->{
            this.part1ExMain.part1RcHandler.part1RcHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part1ExMain.modelArr.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView exNo;
        public ViewHolder (View itemView){
            super(itemView);
            this.exNo=itemView.findViewById(R.id.exNoTv);
        }
    }
}
