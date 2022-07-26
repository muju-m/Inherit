package inheritance;

class GrandFather
{
	public void printGrandFather()
	 {
	   System.out.println("GrandFather's class");
	 }
}
 
class Father extends GrandFather
{
	public void printFather()
	 {
	   System.out.println("Father class has inherited GrandFather class");
	 }
}
 
class Son extends Father
{
	public Son()
	 {
	   System.out.println("Inside the Son Class");
	 }
 
	public void printSon()
	 {
	   System.out.println("Son class has inherited Father class");
	 }
}

 
class Daughter extends Father
{
	public Daughter()
	 {
	   System.out.println("Inside the Daughter Class");
	 }
 
	public void printDaughter()
	 {
	   System.out.println("Son class has inherited Father class");
	 }
}


public class hybridInheritance {
	public static void main(String[]args)
	 {
	   Son obj = new Son();
	   obj.printSon();  
	   obj.printFather(); 
	   obj.printGrandFather();  
	 
	   Daughter obj2 = new Daughter();
	   obj2.printDaughter();
	   obj2.printFather(); 
	   obj2.printGrandFather();  
	 
	 
	 }
}
