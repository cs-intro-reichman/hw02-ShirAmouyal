public class DamkaBoard {

    public static void main(String[] args) {
        
        int N=Integer.parseInt(args[0]);
        
        for(int i=1;i<=N;i++)
        {
          for(int b=1;b<=N;b++)
          {
           if (i%2==0)
           {
            System.out.print(" *");
           }
           else
           {
            System.out.print("* ");
           }
          }
          System.out.println();
        }
    }
}