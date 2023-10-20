import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Alanını bulmak istediğiniz dik üçgenin 1. kenar uzunluğunu yazınız:");
        int a= input.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz: ");
        int b=input.nextInt();
        System.out.println("3. kenar uzunlluğunu giriniz: ");
        int c= input.nextInt();

        int u=(a+b+c)/2;

        double d=u*(u-a)*(u-b)*(u-c);

        System.out.println(Math.sqrt(d));
    }
}
