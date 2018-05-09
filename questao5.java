import java.util.Scanner;
public class questao5{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um numero inteiro positivo: ");
    int n = puxe.nextInt();
    int e1 = 0;
    int e2 = 1;
    System.out.print(e1);
    System.out.print(" " + e2);
    for (int i = 1 ; i < n-1; i++) {
      int e3 = e1 + e2;
      System.out.print(" " + e3);
      e1 = e2;
      e2 = e3;
    }
    puxe.close();
  }
}
