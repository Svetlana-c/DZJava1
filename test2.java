

import java.util.Random;

public class test2 {
    public static void main(String[] args){
        int x = new Random().nextInt(0, 2000);
        System.out.println(x);
        int n = Integer.toBinaryString(x).length();
        System.out.println(n);
     }
    }

