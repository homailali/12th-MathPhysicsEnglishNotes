package life.homail.notesapp.Part2Chapters;
import life.homail.notesapp.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class Part2Adapter extends RecyclerView.Adapter<ViewHolder>{
    private Part2Main part2Main;
    public Part2Adapter(Part2Main part2Main) {
        this.part2Main = part2Main;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part2Main).inflate(R.layout.chapter_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.chNoChTitleTv.setText(this.part2Main.modelArr.get(position).getChaptersName());
        holder.chNoChTitleTv.setOnClickListener(e->{
            this.part2Main.rcHandler.rcHolderMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part2Main.modelArr.size();
    }
}
class ViewHolder extends RecyclerView.ViewHolder{
    protected TextView chNoChTitleTv;
    public ViewHolder (View itemView){
        super(itemView);
        this.chNoChTitleTv=itemView.findViewById(R.id.chNoChTitleTv);
    }
}