import java.util.Scanner;

public class heapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin: (+, -, *, /)");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Hata: Sıfıra bölme işlemi yapılamaz!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + result);
    }
}
