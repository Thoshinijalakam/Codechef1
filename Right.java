import java.util.*;
import java.lang.*;
import java.io.*;

class Right
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int x=sc.nextInt();
	        if(n<=x)
	        System.out.println("yes");
	        else
	        System.out.println("no");
	    }

	}
}/* 4 
2 5
4 3
6 6
10 9
yes
no
yes
no */