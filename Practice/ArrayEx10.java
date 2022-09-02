
public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for(int i=0; i< numArr.length-1; i++) {	// 총 10개 숫자에서 2개씩 묶어서 비교하면 배열의 길이-1 만큼 비교동작을 수행하므로 length-1 만큼 반복한다.
			boolean changed = false;	// 자리바꿈 체크용 플래그
			
			for(int j=0; j< numArr.length-1-i; j++) {	// 인덱스 기준 0~8:1~9 비교를 해서 정렬한 뒤에, 다음 반복문에서는 1~8:2~9 비교 후 스왑... 8:9 비교 진행한다. 다음 반복부터 맨 뒤의 숫자는 제일 큰 것으로 정렬되었으므로 i가 늘어남에 따라서 제외된다.  
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;		// 자리바꿈이 한 번이라도 발생하면 플래그를 true로
				}
			}
		}

	}

}
