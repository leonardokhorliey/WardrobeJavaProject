import java.util.ArrayList;

public class Wardrobe {

	Cloth cloth1 = new Cloth();
	Cloth cloth2 = new Cloth();
	Cloth cloth3 = new Cloth();
	Cloth cloth4 = new Cloth();
	Cloth cloth5 = new Cloth();
	Cloth cloth6 = new Cloth();
	Cloth cloth7 = new Cloth();
	
	private ArrayList<Cloth> clothes = new ArrayList<Cloth>();
	private ArrayList<Cloth> laundry_basket1 = new ArrayList<Cloth>();
	private ArrayList<Cloth> laundry_basket2 = new ArrayList<Cloth>();
	
	public Wardrobe() {
		clothes.add(cloth1);
		clothes.add(cloth2);
		clothes.add(cloth3);
		clothes.add(cloth4);
		clothes.add(cloth5);
		clothes.add(cloth6);
		clothes.add(cloth7);
	}
	
	
	
	
	public ArrayList<Cloth> getClothes() {
		return clothes;
	}




	public void setClothes(ArrayList<Cloth> clothes) {
		this.clothes = clothes;
	}




	public ArrayList<Cloth> getLaundry_basket1() {
		return laundry_basket1;
	}




	public void setLaundry_basket1(ArrayList<Cloth> laundry_basket1) {
		this.laundry_basket1 = laundry_basket1;
	}




	public ArrayList<Cloth> getLaundry_basket2() {
		return laundry_basket2;
	}




	public void setLaundry_basket2(ArrayList<Cloth> laundry_basket2) {
		this.laundry_basket2 = laundry_basket2;
	}


}
