import java.util.Scanner;

public class Main {
    public static void letrasMaiusculas() {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        int contador = 0;
        if (!palavra.equals("FIM")) {
            for (int i = 0; i < palavra.length(); i++) {
                if (Character.isUpperCase(palavra.charAt(i))) {
                    contador++;
                }
            }
            letrasMaiusculas();
        } else {
            return;
        }
        System.out.println(contador);
    }

    public static void main(String[] args) {
        letrasMaiusculas();
    }
}