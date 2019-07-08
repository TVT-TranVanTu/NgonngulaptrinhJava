import java.util.Scanner;

public class GiaTriLonNhat {

    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);

        System.out.println("Nhập vào tối đa 20 phần tử :");
        n = S.nextInt();
        while (n<=0 || n>20){
            System.out.println("Lựa chọn không hợp lệ mời nhập lại :");
            n= S.nextInt();
        }
        Double []Taisan = new Double[n];
        for (int i=0;i<n;i++){
            System.out.println("Nhập vào giá trị tài sản của người thứ :"+i);
            Taisan[i]=S.nextDouble();
        }
        System.out.println("Mảng liệt kê tài sản :");
        for (int i=0;i<n;i++){
            System.out.println(+Taisan[i]);
        }

        double max=Taisan[0];
        for(int i=1;i<n;i++){
            if(max<Taisan[i]){
                max=Taisan[i];
            }
        }
        System.out.println("Tài sản nhiều nhất là :"+max);


    }
}
