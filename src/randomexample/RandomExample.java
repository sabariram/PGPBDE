package randomexample;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random generator = new Random();
		generator.setSeed(12);
		int i = generator.nextInt(12);
		System.out.println(i);
		i = generator.nextInt(20);
		
		

	}

}
