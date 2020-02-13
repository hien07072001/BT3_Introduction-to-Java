import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien usd can doi");
        usd = scanner.nextInt();

        double chuyendoi = usd * 23000;
        System.out.println("" + chuyendoi);


    }
}
