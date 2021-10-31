import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
        int total;
        int x, x1, x2;



        System.out.println();
        System.out.println("Soma de  3 valores inteiros");
        System.out.println();
        System.out.print("Digite o primeiro valor: ");
        x = scanner.nextInt();
        System.out.println();
        System.out.print("Digite o segundo valor: ");
        x1 = scanner.nextInt();
        System.out.println();
        System.out.print("Digite o terceiro valor: ");
        x2 = scanner.nextInt(); 

        total = x + x1 + x2;

        System.out.println();  
        System.out.println("A soma dos tres valores é: "+ total);
        System.out.println();

        scanner.close();
       
    
    }
}
