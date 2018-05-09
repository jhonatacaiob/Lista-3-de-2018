import java.util.Scanner;
public class questao1{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    int numero;
    int soma = 0;
    do {
      System.out.print("Digite um numero inteiro: ");
      numero = puxe.nextInt();
      if (numert < 0)
        System.out.println("NUmero Inválido");
    }while(numero < 0);
    for (int i = 1; i <= numero; i++) {
      soma += i;
    }
    System.out.println("Somatória: " + soma);
    puxe.close();
  }
}
