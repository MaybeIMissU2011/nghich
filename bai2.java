import java.util.Scanner;


public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("n phai lon hon 0");
        }else{
            double tong = 1.0;
            for(int i = 0;i<n;i++){
                tong = 1+ 1.0/i ;
            }
            System.out.printf("Tong e la: %.2f\n", tong);
        }
    }
}
