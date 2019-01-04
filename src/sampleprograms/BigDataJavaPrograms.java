/**This package contains sample classes from BDE course
 * 
 */
/**
 * @author sabariram
 *
 */
package sampleprograms;

import java.util.Random;

class RandomExample{
	public static void main(String args []) {
		Random generator = new Random();
		System.out.println(generator.nextInt(345));
		System.out.println(generator.nextInt(34677));
		System.out.println(generator.nextInt(567));
	}
}
