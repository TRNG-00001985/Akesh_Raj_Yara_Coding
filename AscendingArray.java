class AscendingArray{
 	public static void main(String[] args){
  		int arr[] = {12,43,13,45,32,23};
		int temp = 0;
		for(int i = 0; i<arr.length; i++){
 			for(int j = i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
 				}
			}
		}
		for(int i = 0; i<arr.length; i++){
		System.out.print(arr[i]+ " ");
 		}
	}
}