package life.homail.notesapp.Part1Chapters;

public class Model {
    private String chNoChTitleTv;
    protected Model(String chNoChTitleTv){
        this.chNoChTitleTv=chNoChTitleTv;
    }
    public String getChNoChTitleTv() {
        return chNoChTitleTv;
    }
    public void setChNoChTitleTv(String chNoChTitleTv) {
        this.chNoChTitleTv = chNoChTitleTv;
    }
}
