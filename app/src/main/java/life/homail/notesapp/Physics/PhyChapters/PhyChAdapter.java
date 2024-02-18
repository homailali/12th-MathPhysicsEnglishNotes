package life.homail.notesapp.Physics.PhyChapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.R;

public class PhyChAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private PhyChMain phyChMain;
    public PhyChAdapter(PhyChMain phyChMain) {
        this.phyChMain = phyChMain;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.phyChMain).inflate(R.layout.phy_ch_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.chNoChTitleBtn.setText(this.phyChMain.phyChModelArr.get(position).getChNameAndTitle());
        myViewHolder.chNoChTitleBtn.setOnClickListener(e->{
            this.phyChMain.phyChRcHandler.part2PhyRcHandlerMain(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.phyChMain.phyChModelArr.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    protected TextView chNoChTitleBtn;
    public MyViewHolder(View view){
        super(view);
        this.chNoChTitleBtn=view.findViewById(R.id.chNoChTitleBtn);
    }
}