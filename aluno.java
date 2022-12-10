public class Aluno {
    protected int NumAluno;
    protected String NomeAluno;

    public Aluno(int NumAluno, String NomeAluno){
        this.NumAluno = NumAluno;
        this.NomeAluno = NomeAluno;
    }


    public int getNumAluno(){
        return NumAluno;
    }
    public void setNumAluno(int NumAluno){
        this.NumAluno = NumAluno;
    }

    public String getNomeAluno(){
        return NomeAluno;
    }
    public void setNomeAluno(String NomeAluno){
        this.NomeAluno = NomeAluno;
    }

    @Override
    public String toString(){
        return "" +NumAluno+ "  " +NomeAluno;
    }
}
