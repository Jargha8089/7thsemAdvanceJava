
public class rectangle {
	int length,breadth;
	
	void getParameters(int lenght, int breadth) {
		//"this" says it is the variable of current class
		this.length = length;
		this.breadth = breadth;
	}
	
	int getArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		rectangle rec1=new rectangle();
		//initiallizing instances variable
		rec1.length= 5;
		rec1.breadth= 2;
		System.out.println(rec1.getArea());
		//using method
		rectangle rec2 = new rectangle();
		
		rec2.getParameters(8,9);
		System.out.println(rec2.getArea());
	}

}
