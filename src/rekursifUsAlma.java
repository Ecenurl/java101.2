import java.util.Scanner;

public class rekursifUsAlma {
    static int sonuc=1;
    static int us (int x, int y) {
        if(x==0) {
            return 1;
        }
        sonuc*=y;
        us(x-1,y);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,y ;
        System.out.println("Tabandaki sayiyi giriniz: ");
        y = sc.nextInt();
        System.out.println("Us olacak sayiyi giriniz : ");
        x= sc.nextInt();

        System.out.println( "sonuc:"  + us(x,y));
    }
}
