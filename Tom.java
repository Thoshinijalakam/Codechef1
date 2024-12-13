import java.util.*;
import java.lang.*;
import java.io.*;

class Tom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(y>x)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}

	}
}
/* 4 
2 3
4 1
1 1
yes
no
no*/