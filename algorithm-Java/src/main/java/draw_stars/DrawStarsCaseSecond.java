package draw_stars;

/*
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

public class DrawStarsCaseSecond {
	public void solution(int X) {
		for (int i = 0; i < X; i++) {
			if (i == X-1) {
				for (int c = 0; c < X*2-1; c++) {
					System.out.print("*");
				}
				return;
			}
			for (int j = 0; j < X - (i+1); j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int u = 0; u < i; u++) {
				System.out.print(" ");
				if (u == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
