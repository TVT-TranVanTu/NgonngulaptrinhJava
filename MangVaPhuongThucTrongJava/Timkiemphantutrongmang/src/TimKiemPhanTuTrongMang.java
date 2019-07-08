import java.util.Scanner;

public class TimKiemPhanTuTrongMang {

    public static Boolean Sosanh(String a,String b){
        if(a.equals(b)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String []Students = {"Trần Văn Tú","Đặng Thanh Trung","Trần Quang Văn","Trần Văn Tuấn","Trần Thị Xuân Hoa"};

        System.out.println("Nhập vào sinh viên bạn muốn tìm :");
        Scanner S = new Scanner(System.in);

         String Student;
         boolean Check= false;
         Student= S.nextLine();
         for(int i=0;i<Students.length;i++){
             if(Sosanh(Student,Students[i])==true){
                 System.out.println("Tìm thấy sinh viên trong danh sách :");
                 System.out.println("Sinh viên tìm thấy ở vị trí thứ :"+i);
                 Check=true;
             }


         }
         if(Check==false){

             System.out.println("Không tìm thấy Sinh viên trong danh sách :");
         }

    }
}
