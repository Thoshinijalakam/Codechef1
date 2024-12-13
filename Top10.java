import java.util.*;
import java.lang.*;
import java.io.*;

class Top10
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int x=sc.nextInt();
	        if(x<=10)
	        System.out.println("yes");
	        else
	        System.out.println("no");
	    }

	}
}/*  
4
15
no
10
yes
1
yes
50
no*/