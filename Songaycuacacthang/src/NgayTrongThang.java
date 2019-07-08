import java.util.Scanner;

public class NgayTrongThang {
    public static void main(String[] args) {

        int Mouth;
        Scanner S = new Scanner(System.in);
        System.out.println("Tháng muốn tìm :");
        Mouth= Integer.parseInt(S.nextLine());

        switch (Mouth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+Mouth+"có 31 ngày :");
                break;

            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày :");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+Mouth+"có 30 ngày :");
                break;
                default:
                    System.out.println("Tháng bạn nhập không hợp lệ xin kiểm tra lại :");
                    break;


        }
    }
}
