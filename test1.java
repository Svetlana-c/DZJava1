import java.util.Random;
public class test1 {
    public static void main(String[] args){
        int min = 0;
        int max = 2000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);
    }
    }