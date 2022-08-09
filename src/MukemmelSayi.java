import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int say,bol,top=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        say=sc.nextInt();
        for(int i=1;i<=say;i++) {
            if (say % i == 0) {
                top += i;
                  if(top==say)
                    System.out.print( "Mukemmel sayidir");

            }

        }

        System.out.print( "Mukemmel sayi degil");

    }



}

