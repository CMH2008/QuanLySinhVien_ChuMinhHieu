package javaapplication29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] danhSach = {
            new Student("SV01", "Nguyen Van A", "01/01/2006"),
            new Student("SV02", "Tran Van B", "02/02/2006"),
            new Student("SV03", "Le Van C", "03/03/2006")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien can tim: ");
        String maCanTim = sc.nextLine();

        boolean timThay = false;

        for (Student sv : danhSach) {
            if (sv.maSV.equalsIgnoreCase(maCanTim)) {
                System.out.println("Tim thay sinh vien!");
                System.out.println("Ma SV: " + sv.maSV);
                System.out.println("Ho ten: " + sv.hoTen);
                System.out.println("Ngay sinh: " + sv.ngaySinh);
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sinh vien!");
        }

        sc.close();
    }
}
