package programmerschool.lv1;

import java.util.*;

//k번째 수
//배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//2에서 나온 배열의 3번째 숫자는 5입니다.
//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
//commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 
//return 하도록 solution 함수를 작성해주세요.
public class kthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int n = 0; n < commands.length; n++) {
			int i = commands[n][0] - 1;
			int j = commands[n][1];
			int k = commands[n][2] - 1;

			int[] temp = Arrays.copyOfRange(array, i, j);
			Arrays.sort(temp);
			//선택정렬
//			selectionSort(temp);
			//삽입정렬
//		    insertionSort(temp);
			//버블정렬
//			bubbleSort(temp);
			answer[n] = temp[k];

		}
		return answer;
	}
	//선택 정렬
	private void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1; i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	//삽입 정렬
	 private void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	 //버블 정렬
	 private void bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }


	public static void main(String args[]) {
		kthNumber kn = new kthNumber();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };

        int[] result = kn.solution(array, commands);
        System.out.println(Arrays.toString(result));
	}
}