package life.homail.notesapp.Maths.Part1.Part1Chapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class Part1Adapter extends RecyclerView.Adapter<Part1Adapter.ViewHolder>{
    private Part1Main part1Main;
    public Part1Adapter(Part1Main part1Main) {
        this.part1Main = part1Main;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part1Main).inflate(R.layout.math_chapter_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.chNoChTitleTv.setText(this.part1Main.modelArr.get(position).getChNoChTitleTv());
        holder.chNoChTitleTv.setOnClickListener(e->{
            this.part1Main.rcViewClickHandler.onClickMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part1Main.modelArr.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView chNoChTitleTv;
        public ViewHolder (View itemView){
            super(itemView);
            this.chNoChTitleTv=itemView.findViewById(R.id.chNoChTitleTv);
        }
    }
}