import java.util.Random;

public class OneOfEachStats {

    public static void main(String[] args) {
        
        int N=Integer.parseInt(args[0]);
        int count2=0;
        int count3=0;
        int count4=0;
        int countAllChild=0;
        double average;
        int seed=Integer.parseInt(args[1]);
        Random rnd=new Random(seed);

        for(int i=0;i<N;i++)
        {
            boolean girl=false;
            boolean boy=false;
            
            int count=0;
            while(!girl||!boy)
            {
             double child=rnd.nextDouble();
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

            countAllChild+=count;
            if(count==3){count3++;}
            else if(count>=4){count4++;}
            else {count2++;}

        }
        average= (double)countAllChild/N;
        System.out.println("Average: "+average+" to get at least one of each gender.");
        System.out.println("Number of families with 2 children: "+count2);
        System.out.println("Number of families with 3 children: "+count3);
        System.out.println("Number of families with 4 or more children: "+count4);
        if(count2>count3&&count2>count4)
        {  
         
         System.out.println("The most common number of children is 2");
        
        
        }
        else if(count3>count2 && count3>count4)
        {
         System.out.println("The most common number of children is 3");
        }
        else 
        {
         System.out.println("The most common number of children is 4 or more.");
        }
    }
}