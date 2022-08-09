import java.util.Scanner;

public class GirilenSayiyaKadarCiftBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, k=0;
        double total = 0;

        System.out.print("Lutfen Bir Sayi Giriniz: ");
        num = input.nextInt();

        for(int i=0; i <= num ; num--){
            if ( num %3 == 0 && num %4 == 0){
                total += num;
                k++;
            }
        }
        System.out.println(total/k);

    }

}
