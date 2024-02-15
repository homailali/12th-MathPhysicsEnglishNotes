package life.homail.notesapp.ExerciseViewerMain;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class ExViewerAdapter extends RecyclerView.Adapter<ViewHolder>{
    private ExerciseViewerMain exerciseViewerMain;
    public ExViewerAdapter(ExerciseViewerMain exerciseViewerMain) {
        this.exerciseViewerMain = exerciseViewerMain;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.exerciseViewerMain).inflate(R.layout.ex_viewer_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exImageView.setImageResource(this.exerciseViewerMain.exViewerModelArr.get(position).getImg());
    }
    @Override
    public int getItemCount() {
        return this.exerciseViewerMain.exViewerModelArr.size();
    }
}
class ViewHolder extends RecyclerView.ViewHolder{
    protected ImageView exImageView;
    public ViewHolder(View view){
        super(view);
        this.exImageView=view.findViewById(R.id.exImageView);
    }
}