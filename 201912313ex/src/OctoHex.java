import java.util.*;
class OctoHex
{
	 char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	 int b;
	 String hex="";
	 String hexadecimal(int n)
	 {   
   	 if(n != 0)
    	 {
		b=n%16;
		hex= a[b] + hex;
	               n= n/16;
		 hexadecimal(n);  
	}
        	return hex;
}    
 
    public static void main(String arg[])
    {
        OctoHex var=new OctoHex();
        int oct, deci=0, i=0, t;
        Scanner scanner = new Scanner(System.in);		
        System.out.println("8���� ������ �Է��Ͻÿ� : ");
        oct = scanner.nextInt();				
        while(oct != 0)
        {
            deci =deci + (oct%10) *(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }		     
        String hex=var.hexadecimal(deci); 
        System.out.println("16������ �ٲﰪ�� :"+hex);   
    }
  
}