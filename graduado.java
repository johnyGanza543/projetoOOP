public class Graduado extends Aluno {
    protected Double PrimeiroTeste, SegundoTeste;

    public Graduado (int NumAluno, String NomeAluno){
        super(NumAluno, NomeAluno);
        this.PrimeiroTeste = PrimeiroTeste;
        this.SegundoTeste = SegundoTeste;
    }

    public Double getPrimeiroTeste(){
        return PrimeiroTeste;
    }
    public void setPrimeiroTeste(Double PrimeiroTeste){
        this.PrimeiroTeste = PrimeiroTeste;
    }

    public Double getSegundoTeste(){
        return SegundoTeste;
    }
    public void setSegundoTeste(Double SegundoTeste){
        this.SegundoTeste = SegundoTeste;
    }

    @Override
    public String toString(){
        return // 
    }
}
