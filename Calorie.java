import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int calories=y*z;
		if(calories>x){
		    System.out.println(-1);
		}else{
		    System.out.println(x-calories);
		}
	}
}