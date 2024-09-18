package programmerschool.lv2;
import java.util.*;
//뒤에 있는 큰 수 찾기
//정수로 이루어진 배열 numbers가 있습니다. 
//배열 의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수를 뒷 큰수라고 합니다.
//정수 배열 numbers가 매개변수로 주어질 때, 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 return 하도록 
//solution 함수를 완성해주세요. 단, 뒷 큰수가 존재하지 않는 원소는 -1을 담습니다.
public class FindABigNumber {
	public int[] solution(int[] numbers) {
		
		Stack<Integer> indexStack = new Stack<>();
		int[] result = new int[numbers.length];

		// 첫 번째 숫자의 인덱스를 스택에 저장
		indexStack.push(0);

		// 두 번째 숫자부터 탐색 시작
		for (int i = 1; i < numbers.length; i++) {
			// 스택이 비어있지 않고, 스택의 맨 위 숫자보다 현재 숫자가 크면
			// 스택에 있는 인덱스에 해당하는 숫자의 "뒤에 있는 큰 수"는 현재 숫자
			while (!indexStack.isEmpty() && numbers[indexStack.peek()] < numbers[i]) {
				// 해당 인덱스의 결과 값을 현재 숫자로 설정하고 스택에서 제거
				result[indexStack.pop()] = numbers[i];
			}
			// 현재 인덱스를 스택에 저장
			indexStack.push(i);
		}

		// 스택에 남은 인덱스는 "뒤에 있는 큰 수"가 없는 경우이므로 -1로 설정
		while (!indexStack.isEmpty()) {
			result[indexStack.pop()] = -1;
		}

		return result;
	}
}
