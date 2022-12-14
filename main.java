package Projeto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scMenu = new Scanner(System.in)) {
            Mestrado MestradoLista[] = new Mestrado[3];
            MestradoLista[0] = new Mestrado(13405, "Rui Fonte");
            MestradoLista[1] = new Mestrado(13589, "Tiago Gomes");
            MestradoLista[2] = new Mestrado(13732, "Joana Santos");

            Graduado GraduadoLista[] = new Graduado[3];
            GraduadoLista[0] = new Graduado(14653, "Diogo Sousa", 12.3, 13.5);
            GraduadoLista[1] = new Graduado(13248, "Edgar Martins", 17.0, 13.8);
            GraduadoLista[2] = new Graduado(13674, "José Carlos", 12.0, 12.7);

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
                        System.out.print("\n\n------------------------------------------");
                        System.out.print("\nNotas dos alunos de Programação 2022/2023");
                        System.out.print("\nProfa. Valéria Pequeno");
                        System.out.print("\n------------------------------------------\n");
                        PrintGraduadoLista(GraduadoLista);
                        System.out.print("------------------------------------------\n");

                        int count = 0;
                        count = GraduadoLista.length;
                        System.out.print("Total de alunos: " + count);
                        System.out.print("\tMédia da turma: \n");

                        break;

                    case 2:
                        //Adicionar um novo aluno (graduado/mestrado)
                        Scanner scTipo = new Scanner(System.in);
                        int Tipo = 0;
                        //System.out.print("\033[H\033[2J");  
                        //System.out.flush();  
                        
                        MenuOpcao = 0;
                        Scanner scAdicionaNum = new Scanner(System.in);
                        System.out.print("Nº do aluno? ");
                        int NumAluno = scAdicionaNum.nextInt();

                        Scanner scAdicionaNom = new Scanner(System.in);
                        System.out.print("Nome do aluno? ");
                        String NomeAluno = scAdicionaNom.nextLine();
                        //System.out.print("\033[H\033[2J");  
                        //System.out.flush();   

                        boolean TipoCorreto = false;
                        while (!TipoCorreto){
                            System.out.println("\n[1] Graduado\n[2] Mestrado");
                            if (scTipo.hasNextInt()){
                                Tipo = scTipo.nextInt();
                                if (Tipo == 1 || Tipo == 2)
                                     TipoCorreto = true;
                                else {
                                    System.out.println();
                                    System.out.println("Valor inserido inválido");
                                }
                            }
                        }

                        //Graduado
                        if (Tipo == 1){
                            GraduadoLista = AddGraduadoLista(GraduadoLista);
                            Double PrimeiroTeste = 0.0;
                            Double SegundoTeste = 0.0;

                            Scanner scTestes = new Scanner(System.in);
                            System.out.print("Nota do 1º teste? ");
                            PrimeiroTeste = scTestes.nextDouble();

                            System.out.print("Nota do 2º teste? ");
                            SegundoTeste = scTestes.nextDouble();

                            GraduadoLista[0] = new Graduado(NumAluno, NomeAluno, PrimeiroTeste, SegundoTeste);
                        }
                        
                        break;

                    case 3:
                        exit = 3;
                        break;
                }
            } while (exit != 3);
        }
    }

    //Calcular o total de alunos (graduados)
    //int count = GraduadoLista.length;
  

    //Print da lista de graduado/mestrado
    public static void PrintGraduadoLista(Graduado Graduado[]) {
        for (int i = 0; i < Graduado.length; i++) {
            System.out.println(Graduado[i].toString());
        }
    
    }

    //Adicionar um novo graduado
    static Graduado[] AddGraduadoLista(Graduado GraduadoEntrada[]) {
        Graduado Graduado[] = new Graduado[GraduadoEntrada.length + 1];
        for (int i = 0; i < GraduadoEntrada.length; i++) {
            Graduado[i + 1] = GraduadoEntrada[i];
        }
        return Graduado;
    }
}
