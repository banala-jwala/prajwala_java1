class swap
{
public static void main(String args[])
{
int a=6,b=5;
System.out.println("print before swapping:");
System.out.println("a=" +a);
System.out.println("b=" +b);
System.out.println("print before swapping:a=" +a+ ",b=" +b);
 

 int c=a;         //c=6 
a=b;           //a=5
b=c;          //b=6
System.out.println("after swapping:");
System.out.println("a =" +a);
System.out.println("b =" +b);

}
}