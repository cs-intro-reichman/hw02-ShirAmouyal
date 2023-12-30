import java.util.Random;

public class OneOfEach {

    public static void main(String[] args) {
        
        boolean girl=false;
        boolean boy=false;
        int count=0;
        while(!girl|| !boy)
        {
         double child=Math.random();
         count++;
        if(child<0.5) //boy
        {
            
            boy=true;
        }
        else //girl
        {
           
           girl=true;
        }
        }
         System.out.println("You made it... and you now have "+count+" children.");
        
            
    }
}