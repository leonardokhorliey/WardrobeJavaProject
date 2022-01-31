import java.util.ArrayList;
import java.util.Arrays;

public class Person {
	
	char gender;
	Wardrobe wardrobe = new Wardrobe();
	
	public Person(char gender) throws Exception {
		if (gender != 'M' && gender != 'F') {
			throw new Exception("Gender must be specified as M or F.");
		} else {
			this.gender = gender;
		}
	}
	
	public void wear(Cloth cloth) {
		ArrayList<Cloth> clothes = wardrobe.getClothes();
		clothes.remove(clothes.indexOf(cloth));
		cloth.setClean(false);
		ArrayList<Cloth> laundry_basket1 = wardrobe.getLaundry_basket1();
		laundry_basket1.add(cloth);
		wardrobe.setLaundry_basket1(laundry_basket1);
	}
	
	public void wash(Cloth cloth) {
		ArrayList<Cloth> laundry_basket1 = wardrobe.getLaundry_basket1();
		laundry_basket1.remove(laundry_basket1.indexOf(cloth));
		cloth.setClean(true);
		ArrayList<Cloth> laundry_basket2 = wardrobe.getLaundry_basket2();
		laundry_basket2.add(cloth);
		wardrobe.setLaundry_basket2(laundry_basket2);
	}
	
	public void iron(Cloth cloth) {
		
	}
	
	public void hang(Cloth cloth) throws Exception {
		if (cloth.getClean()) {
			ArrayList<Cloth> laundry_basket2 = wardrobe.getLaundry_basket2();
			laundry_basket2.remove(laundry_basket2.indexOf(cloth));
			ArrayList<Cloth> clothes = wardrobe.getClothes();
			clothes.add(cloth);
			wardrobe.setClothes(clothes);
		} else {
			throw new Exception("We don't do that here, dirty " + (gender == 'M' ? "boy" : "girl"));
		}
		
	}
	
	public void buy(Cloth cloth) {
		ArrayList<Cloth> clothes = wardrobe.getClothes();
		clothes.add(cloth);
		wardrobe.setClothes(clothes);
	}
	
	public void burn(Cloth cloth) {
		ArrayList<Cloth> laundry_basket1 = wardrobe.getLaundry_basket1();
		ArrayList<Cloth> laundry_basket2 = wardrobe.getLaundry_basket2();
		ArrayList<Cloth> clothes = wardrobe.getClothes();
		
		
		if (Arrays.asList(laundry_basket1).contains(cloth)) {
			laundry_basket1.remove(laundry_basket1.indexOf(cloth));
			wardrobe.setLaundry_basket1(laundry_basket1);
		} else if (Arrays.asList(laundry_basket2).contains(cloth)) {
			laundry_basket2.remove(laundry_basket1.indexOf(cloth));
			wardrobe.setLaundry_basket2(laundry_basket2);
		} else {
			clothes.remove(clothes.indexOf(cloth));
			wardrobe.setClothes(clothes);
		}
	}
	
	public void burn(Cloth[] args) {
		for (Cloth cloth: args) {
			burn(cloth);
		}
	}

}
