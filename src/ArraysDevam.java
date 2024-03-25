
public class ArraysDevam {

	public static void main(String[] args) {
		int[][] ikiBoyutlu = new int[3][10];
		ikiBoyutlu[2][7] = 38;
		ikiBoyutlu[0][0] = 54;
		ikiBoyutlu[2][5] = 31;

		for (int i = 0; i < ikiBoyutlu.length; i++) {
			for (int j = 0; j < ikiBoyutlu[0].length; j++) {
				System.out.println(ikiBoyutlu[i][j]);
			}
		}
	}

}
