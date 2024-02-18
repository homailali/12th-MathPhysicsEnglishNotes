package life.homail.notesapp.Maths.MathChaptersPage;
import life.homail.notesapp.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MathChAdapter extends RecyclerView.Adapter<ViewHolder>{
    private MathChapterMain MathChapterMain;
    public MathChAdapter(MathChapterMain MathChapterMain) {
        this.MathChapterMain = MathChapterMain;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.MathChapterMain).inflate(R.layout.math_ch_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.chNoChTitleBtn.setText(this.MathChapterMain.MathChModelArr.get(position).getChaptersName());
        holder.chNoChTitleBtn.setOnClickListener(e->{
            this.MathChapterMain.MathChRcHandler.rcHolderMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.MathChapterMain.MathChModelArr.size();
    }
}
class ViewHolder extends RecyclerView.ViewHolder{
    protected Button chNoChTitleBtn;
    public ViewHolder (View itemView){
        super(itemView);
        this.chNoChTitleBtn=itemView.findViewById(R.id.chNoChTitleBtn);
    }
}