import java.util.Arrays;

public class FirstArray {
	public static void main(String[] args) {
		int[] arr = {21,34,78,65,12,34,89,99,45};
		for(int i = 0 ; i < arr.length -1; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/arr.length);
	}
}
