/**
 * 
 */
/**
 * @author dearbhlacollins
 *
 */

package char_to_unicode_pkg;

import java.util.Scanner;

public class unicode_conversion {

	public static void main(String[] args)

	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter string1: ");
		String testi = scan.nextLine();
		char[] ascii1 = testi.toCharArray();

		System.out.println("Please enter string2: ");
		String testi2 = scan.nextLine();
		char[] ascii2 = testi2.toCharArray();
		scan.close();

		int sum = 0;
		for (int value : ascii2) {
			sum += value;
		}
		System.out.println("string2 value:" + (sum));
		int suma = 0;
		for (int valuea : ascii1) {
			suma += valuea;
		}
		System.out.println("string1 value:" + (suma));

		int ttl = (sum - suma);

		System.out.println(("|(string1-string2)| = ") + (Math.abs(ttl)));

	}

}