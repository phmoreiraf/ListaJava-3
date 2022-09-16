import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a palavra");
        String palavra = scan.nextLine();
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isUpperCase(palavra.charAt(i))) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}