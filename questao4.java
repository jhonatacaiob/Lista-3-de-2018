import java.util.Scanner;
public class questao4{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    int numero;
    do {
      System.out.print("Digite o um numero inteiro positivo: ");
      int numero = puxe.nextInt();
    }while(numero<0);
    int mult = 1;
    for (int i = numero; i > 0 ; i-- ) {
      mult *= i;
    }
    System.out.println("O fatorial do numero " + numero + " é " + mult);
    puxe.close();
  }
}
