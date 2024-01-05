public class Reverse {
	public static void main (String[] args){
		
    String str=args[0];
    String reverse="";
    char middle;
    int leng=str.length();
    if(leng%2==0)
    {
	// bad indentation 
    middle= str.charAt(leng/2-1); 
    }
    else
    {
	 // bad indentation 
    middle= str.charAt(leng/2); 
    }  
    for (int i=leng-1; i>=0;i--)
    {
	// bad indentation 
     reverse+=str.charAt(i);
    }
    System.out.println(reverse);
    System.out.println("The middle character is "+middle);
// bad indentation of brackets	
	}
}
