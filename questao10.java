import java.util.Scanner;
public class questao10{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int N = puxe.nextInt();
    int marcador = 1;
    int numero = 2;
    do {
      int primo = 0;
      for (int i = 1; i <= numero; i++) {
        int resto = numero % i;
        if (resto == 0) {
          primo++;
        }
      }
      if (primo == 2){
        System.out.print(numero + ", ");
        marcador++;
      }
      numero++;
    } while (marcador <= N);
    puxe.close();
  }
}
