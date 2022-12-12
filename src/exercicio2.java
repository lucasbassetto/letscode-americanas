/* Escreva um programa, em java, que solicite a hora, os minutos
e imprima essa a hora, formatada, em 3 timezones diferentes.

Ex.:
informe a hora: 20
informe os minutos: 30
Saída:

quantidade adicionar: 1

Brasil:       20h30min
Mexico (dst): 17h30min
Londres:      23h30m
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas");
        int hora = sc.nextInt();

        System.out.println("Digite os minutos");
        int minuto = sc.nextInt();

        System.out.println("Quantidade a adicionar");
        int add = sc.nextInt();

        int horaBrasil = (hora + add) % 24;
        int horaMexico = ((hora - 3 + add) + 24) % 24;
        int horaLondres = (hora + 3 + add) % 24;

        System.out.printf("Brasil: %d:%02d\n", horaBrasil, minuto);
        System.out.printf("Mexico: %d:%d\n", horaMexico, minuto);
        System.out.printf("Londres: %d:%d\n", horaLondres, minuto);
    }
}