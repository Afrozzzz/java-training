public class twoDArrays {
 
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
 
		for (int[] i : arr) {
			for (int num : i)
				System.out.println(num);
		}

int[][][] arr3d = {
        {
         {1,2,3,4},
         {5,6,7,8},
         {1,3,5,7} 			                  
        } ,
        {
          {1,2,3,4},
          {5,6,7,8},
          {1,3,5,7}
        }
      };
 
 
for (int i=0; i<arr3d.length; i++) { // layers
	for(int j=0; j < arr3d[i].length ; j++) {
		for(int k=0; k <arr3d[i][j].length ; k++) {
			System.out.print(arr3d[i][j][k]+ " ");
		}
		System.out.println();
	}
	System.out.println();
}
 
for(int[][] row : arr3d) {
	for(int[] num : row ) {
		for(int ans:num) {
			System.out.print(ans);
		}
		System.out.println();
	}
	System.out.println();
}
 
	}
 
}