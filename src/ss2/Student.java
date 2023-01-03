package ss2;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    int age = 18;

    // Hàm kởi tạo là hàm tự động chạy khi ta đối tượng
    public Student(){
        System.out.println("xin chao");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        name = sc.nextLine();
        System.out.println("nhap emaill");
        email = sc.nextLine();
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void learn(){
        System.out.println("Learning...");
    }
}