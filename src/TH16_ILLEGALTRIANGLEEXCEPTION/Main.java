package TH16_ILLEGALTRIANGLEEXCEPTION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle();
        } catch (Exception e) {
            System.out.println("Lỗi rồi bạn eiii "+e.getMessage());
        }

    }

    private static void Triangle() {
        System.out.println("Nhập vào 3 cạnh của 1 tam giác: ");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào cạnh b: ");
        b = sc.nextInt();
        System.out.println("Nhập vào cạnh c: ");
        c = sc.nextInt();
        if (a>0 && b>0 && c>0) {
            if (c+a>b && c+b >a && a+b >c) {
                System.out.println("Đây là hình tam giác");
            } else {
                System.out.println("Đây không phải là tam giác");
            }
        }

    }
}
