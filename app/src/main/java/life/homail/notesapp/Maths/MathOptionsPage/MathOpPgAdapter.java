package life.homail.notesapp.Maths.MathOptionsPage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import life.homail.notesapp.Maths.MathExerciseViewerMain.MathExerciseViewerMain;
import life.homail.notesapp.Maths.MathExercisesPage.MathExMain;
import life.homail.notesapp.Maths.MathMcqsPage.MathMcqsPageMain;
import life.homail.notesapp.R;

public class MathOpPgAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private MathOptionPageMain mathOptionPageMain;
    public MathOpPgAdapter(MathOptionPageMain mathOptionPageMain) {
        this.mathOptionPageMain = mathOptionPageMain;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(this.mathOptionPageMain).inflate(R.layout.math_btn_row_design,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.button.setText(this.mathOptionPageMain.btnTextArr.get(position));
        holder.button.setOnClickListener(e->{
            this.btnClickHandler(position);
        });
    }
    @Override
    public int getItemCount() {
        return this.mathOptionPageMain.btnTextArr.size();
    }

    // Handling some events but better create a separate file
    private void btnClickHandler(int position){
        position+=1;
        switch (position){
            case 1->this.changeActivity(MathMcqsPageMain.class);
            case 2->this.changeActivity(MathExMain.class);
        }
    }
    private void changeActivity(Class<? extends AppCompatActivity> classToSwitchTo){
        Intent intent=new Intent(this.mathOptionPageMain,classToSwitchTo);
        intent.putExtra("chapterNo",this.mathOptionPageMain.chNoReceived);
        this.mathOptionPageMain.startActivity(intent);
    }

}
class MyViewHolder extends RecyclerView.ViewHolder{
    protected Button button;
    public MyViewHolder(View view){
        super(view);
        this.button=view.findViewById(R.id.button);
    }
}