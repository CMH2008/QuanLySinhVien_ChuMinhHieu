package javaapplication29;

public class Main {
    public static void main(String[] args) {
        Student sv = new Student("SV01", "Nguyen Van A", "01/01/2006");

        System.out.println("THONG TIN SINH VIEN");
        System.out.println("Ma SV: " + sv.maSV);
        System.out.println("Ho ten: " + sv.hoTen);
        System.out.println("Ngay sinh: " + sv.ngaySinh);
    }
}
