import java.util.Scanner;
public class questao9{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    double TotalCompras = 0;
    while (true) {
      System.out.print("Digite o codigo do produto: ");
      int codigo = puxe.nextInt();
      System.out.print("Digite quantos produtos foram comprados: ");
      int quantidade = puxe.nextInt();
      if (codigo == 1)
        TotalCompras += 0.5;
      else if (codigo == 2)
        TotalCompras += 1;
      else if(codigo == 3)
        TotalCompras += 4;
      else if(codigo == 5)
        TotalCompras += 7;
      else if(codigo == 9)
        TotalCompras += 8;
      else if(codigo == 0)
        break;
      else
        System.out.println("Codigo Inválido");
    }
    System.out.println("Total de compras: " + TotalCompras);
    puxe.close();
  }
}
