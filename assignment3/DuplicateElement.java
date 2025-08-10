package assignment3;

import java.util.Arrays;

public class DuplicateElement {
	public static void main(String[] args) {

		int[] arr = {1, 2, 2, 3, 4, 5, 5, 6, 7};
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				continue;
			} else {
				arr[count] = arr[i];
				count++;
			}
		}

		
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
