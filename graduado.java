package Projeto2;

public class Graduado extends Aluno {
    public Graduado(int NumAluno, String NomeAluno, double PrimeiroTeste, double SegundoTeste) {
        super(NumAluno, NomeAluno);
        this.PrimeiroTeste = PrimeiroTeste;
        this.SegundoTeste = SegundoTeste;
    }
    
    protected Double PrimeiroTeste, SegundoTeste;

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
        return "" +super.toString()+ " " +((PrimeiroTeste+SegundoTeste)/2.0);
        
    }
}
