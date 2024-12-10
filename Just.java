import java.util.*;
import java.lang.*;
import java.io.*;

class Just
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    if(x>24)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}

	}
}
/* 4
30
yes
23
no
60
yes
24 
no */

		
