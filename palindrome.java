class palindrome
{
public static void main(String args[])
{
int sum=0,r;
int n=232;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(n==sum)
System.out.println("palindrome number");
else

System.out.println("not palindrome number");
}
}