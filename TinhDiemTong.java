import java.util.Scanner;

public class TinhDiemTong {

    public static void main(String[] args) {
        // Khai báo biến để lưu điểm
        float diemGiữaKì;
        float diemCuốiKì;
        float diemThànhPhần;

        // Nhập điểm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm giữa kì: ");
        diemGiữaKì = scanner.nextFloat();
        System.out.print("Nhập điểm cuối kì: ");
        diemCuốiKì = scanner.nextFloat();
        System.out.print("Nhập điểm thành phần: ");
        diemThànhPhần = scanner.nextFloat();

        // Tính điểm tổng
        float diemTong = (diemGiữaKì * 2 + diemCuốiKì + diemThànhPhần) / 3;

        // In điểm tổng
        System.out.printf("Điểm tổng: %.2f\n", diemTong);
    }
}

