package thisprograms;

//this can be used to invoke current class method. 

public class Test_This_2 {
	int a;

	public void work2() {
		System.out.println("Method called using this keyword");
	}

	public void work() {
		this.work2();// even if we take off this stmt, compiler will add this stmt.
		System.out.println("Method called using object");
	}

	public static void main(String args[]) {
		Test_This_2 obj = new Test_This_2();
		obj.work();
	}

}
