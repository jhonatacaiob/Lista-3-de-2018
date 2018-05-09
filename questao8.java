import java.util.Scanner;
public class questao8{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    double ValorTotalVista, ValorTotalPrazo;
    ValorTotalPrazo = ValorTotalVista = 0;
    double MenorCompra, MaiorCompra;
    MaiorCompra = 0;
    MenorCompra = 9999999;
    for(int i = 1; i <= 15; i++){
      System.out.print("Qual o tipo de transação?: ");
      char transação = puxe.next().charAt(0);
      System.out.print("Qual o valor da "+ transação + "° transação?: ");
      double valor = puxe.nextDouble();
      if (valor < MenorCompra)
        MenorCompra = valor;
      if (valor > MaiorCompra)
        MaiorCompra = valor;
      if (transação == 'v' || transação == 'V')
        ValorTotalVista += valor;
      else if (transação == 'p' || transação == 'P')
        ValorTotalPrazo += valor;
      else{
        System.out.println("Comando Inválido");
        i--;
      }
    }
    System.out.println("Total das compras a vista: " + ValorTotalVista);
    System.out.println("Total das compras a prazo: " + ValorTotalPrazo);
    System.out.println("Total de compras: " + (ValorTotalPrazo + ValorTotalVista));
    System.out.println("Valor da menor compra: " + MenorCompra);
    System.out.println("Valor da maior compra: " + MaiorCompra);
    puxe.close();
  }
}