
public class WardrobeProject {
	
	public static void main(String[] args) {
		
		Person ebube;
		
		try {
			ebube = new Person('M');
			
			ebube.buy(new Cloth());
			
			System.out.println("Hello there");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
