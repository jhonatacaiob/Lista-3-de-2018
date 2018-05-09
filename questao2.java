import java.util.Scanner;
public class questao2 {
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    int numero, quantidade, soma;

    soma = quantidade = 0;
    do {
      System.out.print("Digite um numero (0 para sair): ");
      numero = puxe.nextInt();
      if (numero > 0){
        soma += numero;
        quantidade++;
      }
    }while (numero != 0);
    System.out.println("Quantidade de numeros positivos: " + quantidade);
    System.out.println("Soma dos numeros positivos: " + soma);
    System.out.println("Média dos numeros positivos: " + (soma/quantidade));
    puxe.close();
  }
}
