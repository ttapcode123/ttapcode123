import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();
        
        // Thực hiện các phép tính
        double tong = soThuNhat + soThuHai;
        double hieu = soThuNhat - soThuHai;
        double tich = soThuNhat * soThuHai;
        
        // Kiểm tra nếu số thứ hai là 0 trước khi thực hiện phép chia
        double thuong = 0;
        if (soThuHai != 0) {
            thuong = soThuNhat / soThuHai;
        } else {
            System.out.println("Không thể chia cho 0.");
        }
        
        // In kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        
        if (soThuHai != 0) {
            System.out.println("Thương: " + thuong);
        }
        
        // Đóng Scanner
        scanner.close();
    }
}
