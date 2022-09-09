import java.util.Scanner;

public class exerc18 {
    public static void main(String[] args) {
        // 18) Faca um programa q pergunte ao usuário o número de alunos a ser lido. O
        // tamanho dos vetores
        // será o número informado pelo usuário. Armazene em um vetor o nome do aluna,
        // em outro
        // vetor as notas Prova1 destes alunos; num outro vetor, armazene as notas
        // Prova2 destes alunos.
        // Ambas notas, Prova1 e Prova2, são informadas pelo usuário. Calcule a média
        // aritmética destes
        // alunos e armazene num quarto vetor. Ao final, mostre o nome do aluno, a nota
        // da prova 1, a
        // nota da prova 2 e a média, para todos do vetor.
        Scanner entrada = new Scanner(System.in);
        int numeroDeAlunosTuarmaA=0;
        System.out.print("digite a quantidades de aluno da turma: ");
        numeroDeAlunosTuarmaA = entrada.nextInt();
        entrada.nextLine();

        String[] nomeAluno = new String[numeroDeAlunosTuarmaA];
        double[] notaProva1 = new double[numeroDeAlunosTuarmaA];
        double[] notaProva2 = new double[numeroDeAlunosTuarmaA];
        double[] mediaAritimetica = new double[numeroDeAlunosTuarmaA];

        for (int i = 0; i < mediaAritimetica.length; i++) {
            System.out.println("Digite o nome do Aluno(a): ");
            nomeAluno[i] = entrada.nextLine();

            System.out.println("Digite a nota da primeria prova do "+ nomeAluno[i]+": ");
            notaProva1[i] = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("Digite a nota da segunda prova do "+ nomeAluno[i]+": ");
            notaProva2[i] = entrada.nextDouble();
            entrada.nextLine();

            mediaAritimetica[i] = (notaProva1[i]+notaProva2[i])/2;
        }
        for (int i = 0; i < mediaAritimetica.length; i++) {
            System.out.println("Nome: "+ nomeAluno[i] + "\nnota Prova 1: " + notaProva1[i] +"\nnota prova 2: "+notaProva2[i] ); 
            System.out.println("media aritimetica: " + mediaAritimetica[i]);
            System.out.println("---------------------");
        }

        
    }
}
