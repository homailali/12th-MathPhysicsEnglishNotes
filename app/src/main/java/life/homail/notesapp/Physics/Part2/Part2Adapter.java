package life.homail.notesapp.Physics.Part2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class Part2Adapter extends RecyclerView.Adapter<MyViewHolder>{

    private Part2PhyMain part2PhyMain;
    public Part2Adapter(Part2PhyMain part2PhyMain) {
        this.part2PhyMain = part2PhyMain;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.part2PhyMain).inflate(R.layout.phy_ch_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.chNoChTitleTv.setText(this.part2PhyMain.part2ChPhyModelArr.get(position).getChNameAndTitle());
        myViewHolder.chNoChTitleTv.setOnClickListener(e->{
            this.part2PhyMain.part2PhyRcHandler.part2PhyRcHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.part2PhyMain.part2ChPhyModelArr.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    protected TextView chNoChTitleTv;
    public MyViewHolder(View view){
        super(view);
        this.chNoChTitleTv=view.findViewById(R.id.chNoChTitleTv);
    }
}