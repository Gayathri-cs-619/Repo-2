package aggregation;

public class Author {
	
	String name;
	String place;
	int age;
	Book b;
	
Author(String name,String place,int age,Book b)
{
	this.name=name;
	this.place=place;
	this.age=age;
	this.b=b;
}

public void display()
{
	System.out.println("Author Details: "+"Name: "+name+", Place: "+place+", Age: "+age);
	System.out.println("Book Details: "+"Book Name: "+b.bookname+", Book Price: "+b.bookprice+", Category: "+b.category);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1=new Book("ABC",500,"Travelogue");
		Author obj=new Author("MT","Kerala",70,obj1);
		obj.display();
	}

}
