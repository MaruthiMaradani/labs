import java.util.*;
import java.math.*;
class 12-RSA-algorithm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int p,q,n,z,d=0,e,i;
System.out.println("enter the number to be encrypted and decrypted");
int msg=sc.nextInt();
double c;
BigInteger msgback;
System.out.println("enter 1st prime number");
p=sc.nextInt();
System.out.println("enter 2nd prime number");
q=sc.nextInt();
n=p*q;
z=(p-1)*(q-1);
System.out.println("the value of z="+z);
for(e=2;e<z;e++)
{
if(gcd(e,z)==1)
{
break;
}
}
System.out.println("the value of c="+e);
for(i=0;i<=9;i++)
{
int x=1+(i*2);
if(x%e==0)
{
d=x/e;
break;
}
}
System.out.println("the value of d="+d);
c=((Math.pow(msg,e))%n);
System.out.println("encrypted message is:");
System.out.println(c);
BigInteger N=BigInteger.valueOf(n);
BigInteger C=BigDecimal.valueOf(c).toBigInteger();
msgback=(C.pow(d).mod(N));
System.out.println("decrypted message is:");
System.out.println(msgback);
}
static int gcd(int e,int z)
{
if(e==0)
return z;
else
return gcd(z%e,e);
}
}