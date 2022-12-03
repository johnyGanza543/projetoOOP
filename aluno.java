public class Aluno {
    protected int numAluno;
    protected String nomeAluno;

    public Aluno(int numAluno, String nomeAluno){
        this.numAluno = numAluno;
        this.nomeAluno = nomeAluno;
    }


    public int getnumAluno(){
        return numAluno;
    }
    public void setnumAluno(){
        this numAluno = numAluno;
    }

    public String getnomeAluno(){
        return nomeAluno;
    }
    public String setnomeAluno(){
        this.nomeAluno = nomeAluno;
    }

    @Override
    public String toString(){
        //return//
    }
}

