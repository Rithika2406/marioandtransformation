

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int x=sc.nextInt();
		    int val = x%3;
		    if(val==0){
		        System.out.println("NORMAL");
		    }else if(val==1){
		        System.out.println("HUGE");
		    }else{
		        System.out.println("SMALL");
		    }
		    
		    t--;
		}
	}
}