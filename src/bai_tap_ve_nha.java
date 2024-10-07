import java.util.Scanner;

public class bai_tap_ve_nha {
    public static void main(String[] args) {
        int sum=0;
        int div=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            div=div*i;
        }
        System.out.println("tich cac so tu 1 den n: "+div);
        for(int i=0;i<=n;i++){
            if (i%n==0){
                sum=sum+i;
            }
        }
    }
}
