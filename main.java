import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scMenu = new Scanner(System.in);
        String LerFicheiro = "alunos.txt";

        BufferedReader br = new BufferedReader(new FileReader(LerFicheiro));
        
        Graduado GraduadoLista[] = new Graduado[10];
        Mestrado MestradoLista[] = new Mestrado[10];

        int exit = 0;
        do {
            System.out.println("\n## Menu (Escolha uma opcao) ##");
            System.out.println("\n[1] Ver lista de alunos");
            System.out.println("[2] Adicionar um novo aluno");
            System.out.println("[3] Sair");
            int MenuOpcao = scMenu.nextInt();

            switch (MenuOpcao){
                case 1:
                    //Ver a lista dos alunos
                    break;

                case 2:
                    //Adicionar um novo aluno (graduado/mestrado)
                    Scanner scAdiciona = new Scanner(System.in);
                    System.out.print("Nº do aluno? ");
                    int NumAluno = scAdiciona.nextInt();


                    break;
                case 3:
                    exit = 3;
                    break;
            }
        } while (exit != 3);
    }

    //Print da lista de graduado/mestrado
    public static void printGraduadoLista(Graduado Graduado[]){
        for (int i = 0; i < Graduado.length; i++) {
            System.out.println(Graduado[i].toString());
        }
    }
    public static void printMestradoLista(Mestrado Mestrado[]){
        for (int i = 0; i < Mestrado.length; i++) {
            System.out.println(Mestrado[i].toString());
        }
    }

    //Adicionar um novo graduado/mestrado
    static Graduado[] NovaLinhaGraduado(Graduado NovoGraduado[]) { 
        Graduado Graduado[] = new Graduado[NovoGraduado.length + 1];
        for (int i = 0; i < NovoGraduado.length; i++) {
            Graduado[i + 1] = NovoGraduado[i];
        }
        return Graduado;
    }
    static Mestrado[] NovaLinhaMestrado(Mestrado NovoMestrado[]) { 
        Mestrado Mestrado[] = new Mestrado[NovoMestrado.length + 1];
        for (int i = 0; i < NovoMestrado.length; i++) {
            Mestrado[i + 1] = NovoMestrado[i];
        }
        return Mestrado;
    }

    //Função para calcular a média do novo aluno
    public class MediaNovoAluno {
        public static void main(String[] args) {
            Double SomaTestes = 0.0;
            Double Media = 0.0;

            SomaTestes = PrimeiroTeste + SegundoTeste;
            Media = SomaTestes / 2;


        }
    }
}
