package ss2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int x = 10;
        Student s1 = new Student();
        s1.age++;
        s1.eat();
        Student s2 = new Student();
        s2.eat();

        Student s3 = new Student();

        System.out.println("s1 "+s1.name);
        System.out.println("s2 "+s2.name);
        System.out.println("s3 "+s3.name);


        // viet hot gril
        HotGril NgocTrinh = new HotGril();
        HotGril XoaiNon = new HotGril();

        System.out.println("NgocTrinh "+s1.name);
        System.out.println("XoaiNon "+s1.name);



        int[] arrNums = new int[10]; // mang 10 so nguyen tu 0 --> 9
        arrNums[0] = 12;
        arrNums[1] = 9;

        for(int i=0; i<10; i++){
            arrNums[i] = i;
        }

        ArrayList<String> strs = new ArrayList<>();
        strs.add("Hello");
        strs.add("world");
        strs.add("every body");

        System.out.println(strs.get(0));
        System.out.println(strs.get(1));
        System.out.println(strs.get(2));

        for (int i = 0; i<strs.size(); i++){
            System.out.println(strs.get(i));
        }

        ArrayList<Student> sts = new ArrayList<>(); // mang cac sinh vien
        sts.add(s1);
        sts.add(s2);
        sts.add(s3);

        sts.add(new Student());


    }
}