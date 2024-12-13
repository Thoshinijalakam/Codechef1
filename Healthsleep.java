import java.util.*;
import java.lang.*;
import java.io.*;

class Healthsleep
{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc=new Scanner(System.in);
	    int H=sc.nextInt();
	    if(H<8)
	    {
	        System.out.println("Less");
	        
	    }else if(H==8){
	        System.out.println("Perfect");
	    }else if(H>8){
	        System.out.println("More");
	    }
	    
	}
}
/* 2
Less*/