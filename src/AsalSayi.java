public class AsalSayi {
    public static void main(String[] args) {
        int i,asal=0,j;
        for (i=2;i<101;i++){
            asal=0;
            for (j=2;j<i;j++){
                if (i%j==0)
                    asal+=1;
            }
            if (asal==0)
                System.out.print(i+" ");
        }
    }
}

