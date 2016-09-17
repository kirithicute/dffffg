import java.io.*;
import java.util.Scanner;
public class count_alpha_number
{
public static void main(String ar[])throws Exception
{
int n=0,aa=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
String p=new String();//string
p=sc.next();
char c[]=p.toCharArray();
for(int i=0;i<c.length;i++)
{
if(c[i]-'0'>=0&&c[i]-'0'<=9)
n++;
if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
aa++;
}
System.out.println("Number of numerical is"+n);
System.out.println("Number of Character is:"+aa);
}
}
