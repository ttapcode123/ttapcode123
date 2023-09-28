import java.util.Scanner;

public class InHoTen {

    public static void main(String[] args) {
        // Khai báo biến để lưu họ tên
        String ho;
        String ten;

        // Nhập họ tên
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ: ");
        ho = scanner.nextLine();
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();

        // In họ tên đầy đủ
        System.out.println("Họ tên đầy đủ: " + ho + " " + ten);
    }
}
