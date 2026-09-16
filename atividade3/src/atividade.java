import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int numero1;
  int numero2;

        System.out.println("DIGITE UM NUMERO:");
        numero1 = scanner.nextInt();

        System.out.println("DIGITE MAIS UM NUMERO:");
        numero2 = scanner.nextInt();

        if(numero1 > numero2) {
            System.out.println("Numero 1 é maior!");
        }else if(numero2 > numero1){
            System.out.println("Numero 2 é maior!");
        }else{
            System.out.println("Numeros são iguais");
        }

// teste push 2 teste testando push #2
scanner.close();
    }

}
