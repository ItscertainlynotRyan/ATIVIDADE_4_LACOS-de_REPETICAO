import java.util.Scanner;

public class Atividade_2_Contagem_Regressiva {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número  para fazer uma contagem regressiva até zero: ");
        int num = entrada.nextInt();

        while (num >= 0) {
            System.out.println(num);
            num--;
        }
    }
}