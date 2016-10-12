package com.study.bubblesort;

import java.util.Random;

public class BubbleMain {
	//난수 생성  Random random 이용
	public void makeRandomNumb(int n) {
		int a[] = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = random.nextInt(100);
			System.out.print(a[i]);
			System.out.print(" ");

		}
		System.out.println("");

	}

	// 버블 소트 시행 문
	public void sort(int[] target) {

		int target_Length = target.length;
		for (int i = target_Length; i > 0; i--) {
			for (int l = 1; l < i; l++) {
				if (target[l] < target[l - 1]) {
					int temp = target[l - 1];
					target[l - 1] = target[l];
					target[l] = temp;
				}

			}
		}
		for (int a : target) {
			System.out.print(a);
			System.out.print(" ");
		}

	}
}