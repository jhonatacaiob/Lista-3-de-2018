import java.util.Scanner;
public class questao7{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    int faixa1, faixa2, faixa3, faixa4, faixa5;
    faixa1 = faixa2 = faixa3 = faixa4 = faixa5 = 0;
    for (int i = 0;i <= 15 ;i++ ) {
      System.out.print("Digite a idade da ");
      System.out.print(i + "° pessoa: ");
      int idade = puxe.nextInt();
      if (idade <= 15)
        faixa1++;
      else if (idade <= 30)
        faixa2++;
      else if (idade <= 45)
        faixa3++;
      else if (idade <= 60)
        faixa4++;
      else
        faixa5++;
    }
    System.out.println("Há " + faixa1 + " pessoas na 1° faixa etária");

    System.out.println("Há" + faixa2 + " pessoas na 2° faixa etária");

    System.out.println("Há " + faixa3 + " pessoas na 3° faixa etária");

    System.out.println("Há " + faixa4 + " pessoas na 4° faixa etária");

    System.out.println("Há " + faixa5 + " pessoas na 5° faixa etária");
    puxe.close();
    }
}
