import java.util.Scanner;

public class Atividade_4_Validação_de_Entrada {
    public static void main(String[] args) {

        int id;
        Scanner idade = new Scanner(System.in);
        do {
            System.out.println("Insira a sua idade:");
            id = idade.nextInt();
            if (id <= 0) {
                System.out.println("Insira uma idade válida!");
            }
        } while (id <= 0);

    }
}