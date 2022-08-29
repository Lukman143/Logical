package com.sk;

public class Logical3 {
	public static void main(String[] args) {

		int[] a = { 3, 1, 4, 2, 5 };

		int i = 0;

		int temp;

		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i-1; j++) {

				if (a[j] <a[j + 1])

				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}
}
