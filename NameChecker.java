import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NameChecker {
    public static void main(String[] args) {
        // Khởi tạo danh sách tên
        List<String> danhSachTen = new ArrayList<>();
        danhSachTen.add("John");
        danhSachTen.add("Alice");
        danhSachTen.add("Bob");
        danhSachTen.add("Eve");

        // Nhập họ tên từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        // Kiểm tra xem tên có trong danh sách hay không
        if (danhSachTen.contains(hoTen)) {
            System.out.println("Tên '" + hoTen + "' có trong danh sách.");
        } else {
            System.out.println("Tên '" + hoTen + "' không có trong danh sách.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
