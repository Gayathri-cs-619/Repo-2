package thisprograms;
//this can be used to refer current class instance variable. 
public class Test_This_1
{
int a;
public Test_This_1(int a)
{
this.a=a;
}
public void work()
{
System.out.println("The number is: "+a);
}

public static void main(String args[])
{
Test_This_1 obj=new Test_This_1(1);
obj.work();
}

}