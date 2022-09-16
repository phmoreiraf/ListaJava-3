import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            String palavra = scan.nextLine();
            if (!palavra.equals("FIM")) {
                int contador = 0;
                for (int i = 0; i < palavra.length(); i++) {
                    if (Character.isUpperCase(palavra.charAt(i))) {
                        contador++;
                    }
                }
                System.out.println(contador);
            } else {
                break;
            }
        } while (true);
    }
}