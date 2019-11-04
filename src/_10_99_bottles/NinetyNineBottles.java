package _10_99_bottles;

public class NinetyNineBottles {
	public static void main(String[] args) {
		int bottlesOfBeer = 99;
		while (bottlesOfBeer != 0) {
			System.out.println(bottlesOfBeer + " bottles of beer on the wall, " + bottlesOfBeer + " bottles of beer.");
			bottlesOfBeer -=1;
			System.out.println("You take one down, pass it around, " + bottlesOfBeer + " bottles of beer on the wall.");
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
				"Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}
