import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ngay, thang, nam;
        String gach="/";
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap form dang ki hoc : ");
        System.out.println("Ho va ten");
        String name=sc.nextLine();
        System.out.println("Ngay/thang/nam sinh : ");
        System.out.print(ngay=sc.nextInt());
        System.out.print(gach);
        System.out.print(thang=sc.nextInt());
        System.out.print(gach);
        System.out.print(nam=sc.nextInt());
        System.out.println("Nhap mon hoc : ");
        String mon_Hoc=sc.nextLine();
        System.out.println("Nhap email : ");
        String email=sc.nextLine();
    }
}