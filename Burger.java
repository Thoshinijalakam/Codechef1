

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		    int p = sc.nextInt();
		    int b = sc.nextInt();
		    System.out.println(Math.min(p,b));
		    t--;
		}
	}
}