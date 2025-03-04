import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        // tao hinh tron c ban kinh 5 co san
        Circle c1 = new Circle();

        // tao hinh tron c ban kinh tu nhap
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();
        Circle c2 = new Circle(r);

        // In thong tin cac hinh tron
        System.out.println("Thong tin hinh tron mac dinh:");
        c1.thongtinhinhtron();
        System.out.println("Thong tin hinh tron nhap vao:");
        c2.thongtinhinhtron();
    }
}