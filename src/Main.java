import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Daire Alanı Hesaplama Aracı");

       double pi = 3.14,r,alan,a;

       Scanner imput =new Scanner(System.in);
       System.out.print("Dairenin yarı çapını giriniz : ");
       r =imput.nextDouble();
       System.out.print("Merkez açısını giriniz : ");
       a=imput.nextDouble();

       alan= (pi*r*r*a)/360;
       System.out.print("Dairen Diliminin Alanı : "+alan);
    }
}