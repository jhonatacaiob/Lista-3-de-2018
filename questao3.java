import java.util.Scanner;

public class questao3 {

  public static void main(String[] args) {

    Scanner puxe = new Scanner(System.in);

    System.out.println("Digite 2 numeros para limitar as tabuadas");

    int n1,n2;

    do {

      System.out.print("Numero 1: ");

      n1 = puxe.nextInt();

      System.out.print("Numero 2: ");

      n2 = puxe.nextInt();

      if (n1>n2) {

        System.out.println("O numero 1 tem que ser menor que o numero 2");

      }

    }while (n1>n2);

    for (int i = 1; i < 10 ; i++ ) {

      for (int j = n1; j <= n2 ; j++) {

        int soma = i + j;

        int mult = i * j;

        System.out.print(j + " + "+ i + " = " + soma + " | ");

        System.out.println(j + " x " + i + " = " + mult);

      }
 
     System.out.println("----------------------------");

    }

    puxe.close();

  }

}
