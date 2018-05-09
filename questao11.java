import java.util.Scanner;
public class questao11{
  public static void main(String[] args) {
    Scanner puxe = new Scanner(System.in);
    System.out.print("Digite uma palavra: ");
    String puxada = puxe.nextLine();
    int tamanho1 = puxada.length();
    String Palavra = "";
    String PalavraInvertida = "";
    for (int i = 0; i < tamanho1 ; i++ ) {
      String teste = puxada.charAt(i);
      if (teste == ' '){
        continue;
      }else {
        Palavra += teste;
      }
    }
    int tamanho2 = Palavra.length();
    for (int i = (tamanho2 - 1); i >= 0 ; i-- ) {
      PalavraInvertida += palavra.charAt(i);
    }
    if (PalavraInvertida.equalsIgnoreCase(Palavra)) {
      System.out.println("É palíndromo");
    }else {
      System.out.println("Não é palíndromo");
    }
    puxe.close();
  }
}
