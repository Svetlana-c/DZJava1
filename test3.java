import java.util.Random;

public class test3 {
    public static void main(String[] args){
        int x=new Random().nextInt(2000);
        int n = Integer.toBinaryString(x).length();
        int c = 0;
        for (int i = Short.MIN_VALUE; i < x; i++){
            if(i%n == 0) c++;
        }
        int [] m1 = new int[c];
        c = 0;
        for(int i = Short.MIN_VALUE; i < x; i++){
            if(i%n == 0) m1[c++] = i;
        }
    }
}