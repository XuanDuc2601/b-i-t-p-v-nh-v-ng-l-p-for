import java.util.Scanner;

public class su_dung_While {
    public static void main(String[] args) {
        int sum=0;
        int div=1;
        Scanner sc=new Scanner(System.in);
        while(int i>0){
            div=div*i;
            i--;
        }
        System.out.println("tich cac so tu 1 den n: "+div);
        while(int i>=0&&i%2==0){
            sum=sum+i;
        }
        System.out.println("tong cac so chan tu 1 den n: "+sum);
    }
}
