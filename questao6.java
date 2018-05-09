import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner puxe = new Scanner(System.in);

    while(true){

      System.out.println("# Menu de operações #\n+ para somar;\n– para subtrair\n* para multiplicar;\n/ para dividir");

      System.out.print("Digite a operação que você deseja realizar: ");

      char operação = puxe.next().charAt(0);

      if (operação == 's' || operação == 'S'){

        System.out.println("Programa Encerrado");

        break;

      }else{

        System.out.print("Digite o primeiro número: ");

        double n1 = puxe.nextDouble();

        System.out.print("Digite o segundo número: ");

        double n2 = puxe.nextDouble();

        double result = 0;

        if (operação == '+')

          result = n1 + n2;

        else if (operação == '-')

          result = n1 - n2;

        else if (operação == '*')

          result = n1 * n2;

        else if (operação == '/')

          result = n1 / n2;

        else{

          System.out.println("ERRO");

          continue;}

        System.out.println((n1 + " " + operação + " " + n2) + " = " + result);

    puxe.close();

   }

  }

 }

}
