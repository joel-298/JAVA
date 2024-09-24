package array_2D;
import java.util.Scanner;
public class ARRAY_2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt() ;
		int [][] arr = new int[row][column] ;
		
		for(int i= 0 ; i < row ; i++) {
			for(int j = 0 ; j < column ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		// spiral matrix ;
		int top = 0, bottom = row-1 , left = 0, right = column-1;
		int direction = 0 ;
		while(top <= bottom && left <= right) {
			if(direction == 0) {   // left to right
				for(int i = left ; i <= right ; i++) {
					System.out.print(arr[top][i]+" ");
				}
				direction++;
				top++ ;
			}
			else if(direction == 1) { // top to bottom
				for(int i = top ; i <= bottom ; i++) {
					System.out.print(arr[i][right]+" ");
				}
				direction++;
				right--;
			}
			else if(direction == 2) { // right to left
				for(int i = right ; i >= left ; i--) {
					System.out.print(arr[bottom][i]+" ");
				}
				direction++;
				bottom--;
			}
			else {					  //bottom to top
				for(int i = bottom ; i >= top ; i--) {
					System.out.print(arr[i][left]+" ");
				}
				direction = 0 ;
				left++;
			}
		}
	}

}
