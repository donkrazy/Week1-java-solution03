package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "금액:" );
		int price = scanner.nextInt();
		
		final int[] PRICE_UNIT = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		for( int i = 0; i < PRICE_UNIT.length; i++ ) {
			int count = price / PRICE_UNIT[ i ];
			price -= count*PRICE_UNIT[ i ];
			System.out.println( PRICE_UNIT[i] + "원 권:" + count + "개");
		}
		
		scanner.close();
	}
}

