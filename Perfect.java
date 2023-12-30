public class perfect {

    public static void main(String[] args) {
        
     int N=Integer.parseInt(args[0]);
     String str=N+" is a perfect number since "+N+" = "+1;
     int sum=1;
     for(int i=2;i<N;i++)
     {
       if(N%i==0)
       {
        str+=" + "+i;
        sum+=i;
       }
     }
     if(sum==N)
     {
        System.out.println(str);

     }
     else
     {
       System.out.println(N+" is not a perfect number");
     }

    }
}