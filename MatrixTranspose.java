public class MatrixTranspose{
   public static void main(String[] args){
 	int a[][] = {{1,2,3},{4,5,6},{7,8,9}};	
	int b[][] = new int[3][3];
	System.out.println("Before Transpose of Matrix : ");
	for(int i = 0; i<a.length; i++){
	 	for(int j = 0; j<a.length; j++){
			System.out.print(a[i][j] + " ");
		}
	  System.out.println();
 	}
	System.out.println("After Transpose of Matrix : ");
	for(int i = 0; i<a.length; i++){
	 	for(int j = 0; j<a.length; j++){
			b[i][j] = a[j][i];
			System.out.print(b[i][j] + " ");
		}
	  System.out.println();

 	}
	
  }	
}