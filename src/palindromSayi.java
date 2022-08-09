public class palindromSayi {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {

            System.out.println("=============");
            System.out.println("sayi-> "+temp);

            lastNumber = temp % 10;
            System.out.println("son basamak "+lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("yeni sayi "+ reverseNumber);

            temp /= 10;
        }
         if (number==reverseNumber) {
             System.out.print("palindrom");
            return true;

        }
         else {

             System.out.print("palindrom degil");
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrom(8971);

    }
}
