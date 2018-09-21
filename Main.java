package datastructure;
import Example.SinglyLinkedList;

public class Employee
{
	public static void main(String[] args)
	{
		SinglyLinkedList<String> Employee =
			new SinglyLinkedList<String>();
		
		Employee.addlast("Bernz");
		Employee.addlast("Pobadora");
		Employee.addlast("Mollare");
		
		System.out.println("Size :"+ Employee.size())
	}
}
