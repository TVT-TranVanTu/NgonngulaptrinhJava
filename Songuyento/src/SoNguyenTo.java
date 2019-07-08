import java.util.Scanner;

public class SoNguyenTo {

    public static boolean Nguyento(int n){
       if (n<2)
           return false;
       else
           for (int i=2;i<(n/2);i++){
               if(n%i==0)
                   return false;
           }
           return true;
   }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào số cần kiểm tra :");
        Scanner S = new Scanner(System.in);
        n=Integer.parseInt(S.nextLine());
        if(Nguyento(n)== true){
            System.out.println("Số "+n+" là số nguyên tố :");
        }
        else
            System.out.println(+n+" không phải số nguyên tố :");

    }
}
