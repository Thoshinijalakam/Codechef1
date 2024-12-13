import java.util.*;
import java.lang.*;
import java.io.*;

class Candy
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	    int n=sc.nextInt();
	    if(n%3==0)
	    System.out.println("yes");
	    else
	    System.out.println("no");
	}
	}
}
/* 4
3
4
2
6

yes
no
no
yes*/