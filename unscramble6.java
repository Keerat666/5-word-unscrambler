import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class unscramble6
{
static boolean  check(int r, int k)
{
	int temp=r;
	int counter=0;

		for(int q=1;q<=6;q++)
		{   temp=r;	
 		abc:
		while(temp>0)
			{
		int dg=temp%10;
		if(q==dg)
				{
					counter++;
					break abc;
				}
			temp=temp/10;
			}
		}
			if(counter==6)
			return true;
			else
			return false;
}


public static void main(String args[]) throws FileNotFoundException

{
int A[]=new int[720];
int c=0;
for(int n=100000;n<=999999;n++)
{
	if(check(n,6))
	{
	
	A[c]=n;
	c++;
	}

}

Scanner ab=new Scanner (System.in);
String s=ab.next();
File text=new File("C:/Users/gurke/Desktop/New Text Document (3).txt");

String a="";
String ans="";
String lans="";
char B[]=new char[6];
for(int p=0;p<6;p++)
B[p]=s.charAt(p);
String per="";
int counter=0;
abc:
for(int l=1;l<720;l++)
{
int temp=A[l];
while(temp>0)
{
int dg=temp%10;
per+=B[dg-1];
temp=temp/10;
}
Scanner scnr=new Scanner(text);
while(scnr.hasNext())
{

if(per.equals(a))
{
ans=a;
if(ans.equals(lans)==false)
System.out.println(ans);
lans=ans;
counter++;
}

a=scnr.next();
}

per="";
}

if(counter==0)
System.out.println("Match not found");
}
}








