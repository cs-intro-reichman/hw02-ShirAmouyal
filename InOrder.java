import java.util.Random;

public class InOrder {

    public static void main(String[] args) {
        Random random=new Random();
        int rnd1=random.nextInt(10);
        System.out.println(rnd1); 
        boolean ok=true;
        while (ok) 
        {
            int rnd2=random.nextInt(10);
            if(rnd2>rnd1)
            {
             System.out.println(rnd2);
             rnd1=rnd2;
            
            }
            else
            {
             ok=false;
            }
        }
    }
}