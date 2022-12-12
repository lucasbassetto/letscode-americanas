import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        System.out.println("Informe o estado: ");
        String estado = sc.next();

        System.out.println("Informe o pais: ");
        String pais = sc.next();

        String dados = String.format("Nome: %s, Idade: %s, Estado: %s, Pais: %s", nome, idade, estado, pais);

        System.out.println(dados);
    }
}