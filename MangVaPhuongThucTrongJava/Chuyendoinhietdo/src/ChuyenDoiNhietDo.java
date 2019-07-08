import java.util.Scanner;

public class ChuyenDoiNhietDo {

    public static Double CelsiusToFahrenheit(Double Celsius){
        double Fahrenheit=(9.0 / 5) * Celsius + 32;
        return Fahrenheit;
    }

    public static Double FahrenheitToCelsius(Double Fahrenheit ){
        double Celsius=(5 / 9.0) * Fahrenheit - 32;
        return Celsius;
    }

    public static void main(String[] args) {

        System.out.println("Chuyển đổi nhiệt độ :");
        Scanner S = new Scanner(System.in);
        System.out.println("Nhập vào lựa chọn :");
        System.out.println("1:Celsius To Fahrenheit");
        System.out.println("2:Fahrenheit To Celsius");
        int Luachon;
        Luachon = S.nextInt();
        if(Luachon ==1){
            System.out.println("Nhập vào Celsius :");
            double Celsius;
            Celsius=S.nextDouble();
            System.out.println("Fahrenheit :"+CelsiusToFahrenheit(Celsius));
        }
        else if(Luachon==2){
            System.out.println("Nhập vào Fahrenheit :");
            double  Fahrenheit;
            Fahrenheit=S.nextDouble();
            System.out.println("Celsius :"+FahrenheitToCelsius(Fahrenheit));
        }
        else{
            System.out.println("Lựa chọn không hợp lệ xin kiểm tra lại :");
        }


    }
}
