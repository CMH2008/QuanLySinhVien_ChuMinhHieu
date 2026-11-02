package javaapplication29;

public class Student {
    String maSV;
    String hoTen; // Da giai quyet conflict
    String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }
}