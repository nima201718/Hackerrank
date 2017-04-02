import java.util.Scanner;

public class Solut {
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int numberOfMax(int[] arr, int max) {
		int numOfOccur = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				numOfOccur++;
			}
		}
		return numOfOccur;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int max = findMax(height);
		System.out.println(numberOfMax(height, max));
	}
}