package testset1;

//Create 2 method in a class and get the 2 float values from main method and print the sum values into the method.

public class SumMult
{
public static void sum1(float a,float b)
{
float c=a+b;
System.out.println("Sum of float numbers: "+c);
}

public static void mult1(float a,float b)
{
float c=a*b;
System.out.println("Product of float numbers: "+c);
}

public static void main(String args[])
{
SumMult.sum1(1.3f,2.1f);
SumMult.mult1(1.3f,2.1f);
}
}
