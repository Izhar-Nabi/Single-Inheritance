class A{
	void ShowA(){
	System.out.println("Show The Property of A");}
} // class a

class B extends A{
	void ShowB(){
System.out.println("Show The B Method");
	}
	public static void main(String args[]){
	A obj1= new A();
	obj1.ShowA();
	//obj1.ShowB();

// creating the obt of second class

	 B obj2 = new B();
	obj2.ShowA();
	obj2.ShowB();

		}// main method 
}// class B

//class