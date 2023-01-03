package ss2;

import java.util.Scanner;

public class HotGril {
    String name;
    String birthday;
    String address;
    // hafm khởi tạo
    public HotGril() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        birthday = sc.nextLine();
        System.out.println("address");
        address = sc.nextLine();
    }


    public void playgame(){
        System.out.println("Playing game...");
    }
    public void sweephouse(){
        System.out.println("Sweeping House...");
    }
    public void washdishes(){
        System.out.println("Washing dishes...");
    }

}