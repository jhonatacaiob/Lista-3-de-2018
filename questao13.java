import java.util.Scanner;

public class questao13{

  public static void main(String[] args) {

    Scanner puxe = new Scanner(System.in);

    System.out.print("Digite um número: ");

    int numero = puxe.nextInt();

    for (int i = 1; i <= numero ; i++) {

      for (int j = 0; j < i; j++){

         System.out.print("*");

      }System.out.print("\n");

    }for (int i = numero; i >= 1 ; i-- ) {

      for (int j = 0; j < i; j++){

	       System.out.print("*");

      }System.out.print("\n");

    }for (int i = numero ; i >= 0 ; i--) {//10 9 8 7 6 5 4 3 2 1 0

      int k = numero - i;//0 1 2 3 4 5 6 7 8 9 10

      for (int j = 0; j < k ; j++ ) {//0 1 2 3 4 5 6 7 8 9 10

        System.out.print(" ");

      }for (int l = i; l > 0 ;i-- ) { // 10 9 8 7 6 5 4 3 2 1 0

        System.out.print("*");

      }System.out.print("\n");

    }for (int i = 0; i <= numero ; i++ ) {// 0 1 2 3 4 5 6 7 8 9 10

      int k = numero - i;// 10 9 8 7 6 5 4 3 2 1

      for(int j = numero ; j >= k ; j-- ){// 10 9 8 7 6 5 4 3 2 1 0

        System.out.print(" ");

      }for (int l = 0 ; l < i ; l++ ) {

        System.out.print("*"); //0 1 2 3 4 5 6 7 8 9 10
      }System.out.print("\n");
    }
    puxe.close();
  }
}
