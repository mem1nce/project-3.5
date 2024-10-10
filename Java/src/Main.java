import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a,b;
        int total=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("Üs olacak sayıyı giriniz :");
        b = input.nextInt();

        int i = 1;
        while(i <= b){
            total *= a;
            i++;
        }
        System.out.println("Cevap : " + total);
    }
}

