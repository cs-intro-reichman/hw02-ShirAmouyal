public class Reverse {
	public static void main (String[] args){
		
    String str=args[0];
    String reverse="";
    char middle;
    int leng=str.length();
    if(leng%2==0)
    {
    middle= str.charAt(leng/2-1); 
    }
    else
    {
    middle= str.charAt(leng/2); 
    }  
    for (int i=leng-1; i>=0;i--)
    {
     reverse+=str.charAt(i);
    }
    System.out.println(reverse);
    System.out.println("The middle character is "+middle);
	}
}