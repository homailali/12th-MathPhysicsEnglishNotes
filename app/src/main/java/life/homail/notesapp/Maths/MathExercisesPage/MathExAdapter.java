package life.homail.notesapp.Maths.MathExercisesPage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import life.homail.notesapp.R;
public class MathExAdapter extends RecyclerView.Adapter<ViewHolder> {
    private MathExMain mathExMain;
    public MathExAdapter(MathExMain mathExMain) {
        this.mathExMain = mathExMain;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.mathExMain).inflate(R.layout.math_ex_row_design,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exNoBtn.setText(this.mathExMain.modelsArr.get(position).getExNo());
        holder.exNoBtn.setOnClickListener(e->{
            this.mathExMain.mathExRcHandler.exRcItemHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.mathExMain.modelsArr.size();
    }
}
class ViewHolder extends RecyclerView.ViewHolder{
    protected TextView exNoBtn;
    public ViewHolder (View itemView){
        super(itemView);
        this.exNoBtn=itemView.findViewById(R.id.exNoBtn);
    }
}
