package Level1;

public class SnumDel {
	
	public int[] solution(int[] arr) {
		
		int min = 0;
		int minI = 0;
		int count = 0;
		
		if (arr.length == 1)
			count = 1;
		else
			count = (arr.length)-1;
		
		int[] answer = new int[count];
		
		if (arr.length == 1)
			answer[0] = -1;
		
		else {		
			for (int i=1;i<arr.length;i++) {
				if (arr[i] < arr[minI]){
					minI = i;	
					min = arr[i];
					}
				}
			for (int i=0;i<arr.length;i++) {
				if(arr[i] == min) {
					for (int j = i; j<(arr.length)-1;j++) {
						if(i != (arr.length)-1)
							answer[j] = arr[j+1];
					}
					break;
				}
				answer[i] = arr[i];
			}	
		}
		
		return answer;				
	}
}

	

