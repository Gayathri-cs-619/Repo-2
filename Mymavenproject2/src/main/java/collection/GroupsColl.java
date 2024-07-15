package collection;

import java.util.ArrayList;
import java.util.List;

public class GroupsColl {
	
	public static void display()//non generic arraylist
	{
		ArrayList a1 = new ArrayList();//created a1 collection
		a1.add(10);
		a1.add(1.45);
		a1.add('h');
		a1.add("Gayathri");
		a1.add(1.55f);
		System.out.println(a1);
		//System.out.println(a1.getFirst());
	}
	
	public static void generic()//generic arraylist
	{
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(4);
		a2.add(-901);
		a2.add(1231);
		//a2.add("Gayathri");//type error
		System.out.println(a2);
		
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Ggg");
		a3.add("Gayathri");
		System.out.println(a3);
	}
	
	public static void listexample()//list is ordered collection, insertion order maintained
	//, allows duplicate object, can add null values
	
	//index based. get method is there, we can access based on  index.
	{
		List<String> a4=new ArrayList();
		a4.add("Glory");
		a4.add("Minnu");
		a4.add(null);
		a4.add("Glory");
		a4.add(null);
		a4.add("");
		System.out.println(a4);
		System.out.println(a4.get(0));
	}
	
	public static void setexample()//ordered collection, insertion order not maintained
	// duplicate objects not allowed, only one null value allowed
	//index based. but get method is not there.
	{
		//HW-add here
	}
	
	public static void work1()
	{
		List<Integer> a5=new ArrayList();
		a5.add(11);
		a5.add(12);
		a5.add(13);
		a5.add(14);
		a5.add(15);
		System.out.println("collection 1 contents at first :"+a5);
		a5.remove(1);
		System.out.println("collection 1 contents after a removal :"+a5);
		System.out.println("Collection size is :"+a5.size());
		
		
		List<Integer> a6=new ArrayList();
		System.out.println("New collection contents at first :"+a6);
		a6.addAll(a5);//to add entire collection to another collection
		System.out.println("New collection contents after copy:"+a6);
		
		System.out.println("Print a specific object :"+a5.get(1));
		
		a5.removeAll(a5);//to remove all objects from a collection
		System.out.println("Collection 1 contents after remove all:"+a5);
		
		boolean v=a6.contains(78);//to check if an object is already in list
		System.out.println("Is the object already present? "+v);
	}
	
	//HW - TRY work1 WITH ARRAYLIST

	public static void main(String[] args) {
		
		//GroupsColl.display();//can add as instance classes also
		//GroupsColl.generic();
		//GroupsColl.listexample();
		GroupsColl.work1();
	}

}
