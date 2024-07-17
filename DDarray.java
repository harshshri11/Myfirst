import java.util.*;
 class DDarray{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the num of row and column");
int m = sc.nextInt();
int n = sc.nextInt();
int a[][] = new int [m][n];
int i,j;
System.out.println("enter the element");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j] = sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+ " ");
}
System.out.println();
}
int sum = 0;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
sum = sum + a[i][j];
}
}
System.out.println("sum of all elements = "+sum);
//row sum
int sumROW = 0;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
sumROW = sumROW+a[i][j];
}
System.out.println("sum of row is: "+sumROW);
sumROW = 0;
}
//column sum
int sumCLM = 0;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
sumCLM = sumCLM+a[i][j];
}
System.out.println("sum of column is: "+sumCLM);
sumCLM = 0;
}
// digonal sum
int sumDG = 0;
for(i=0;i<n;i++)
{
sumDG = sumDG+a[i][i];
}
System.out.println("sum of digonal is: "+sumDG);
sumDG = 0;
}
}