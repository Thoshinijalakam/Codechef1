import java.util.*;
import java.lang.*;
import java.io.*;

class Battery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    if(n>=80)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}

	}
}
/* 4 
97
42
80
10
yes
no
yes
no */