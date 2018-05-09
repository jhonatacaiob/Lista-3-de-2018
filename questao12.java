import java.util.Scanner;
public class questao12{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite a altura do triângulo: ");
    int altura = puxe.nextInt();
    System.out.print("Digite a largura do triângulo: ");
    int largura = puxe.nextInt();
    for (int i = 0; i < largura ; i++ ) {
      System.out.print("*");
    }System.out.print("\n");
    for (int j = 0; j < (altura-2) ; j++ ) {
      System.out.print("*");
      for (int l = 0;l < (largura - 2) ;l++ ) {
        System.out.print(" ");
      }
      System.out.print("*");
     System.out.print("\n");
    }for (int i = 0; i < largura ; i++ ) {
      System.out.print("*");
    }
    puxe.close();
  }
}
