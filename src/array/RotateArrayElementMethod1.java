package array;

import java.util.Scanner;

public class RotateArrayElementMethod1 {

	
	public int[] rotateArray(int[] arr, int d){
        int[] temp = new int[d];
       for(int i=0; i<d; i++){
        temp[i]= arr[i];
       }
       
       for(int j =0; j<arr.length-d; j++){
           arr[j]=arr[j+d];
       }
        
        for(int k = 0, a = arr.length-d ; k<d & a<arr.length; k++, a++){
            
                arr[a]= temp[k]; 
        }
        return arr;
    }
    public void printArray(int[] arr1 ){
        for(int n : arr1){
            System.out.print(" "+ n);
        }
    }
	
	
	public static void main(String[] args) {
			
	    int tc, N, D;
	    RotateArrayElementMethod1 gfg = new RotateArrayElementMethod1();
        Scanner scan = new Scanner(System.in);
        tc = scan.nextInt();
        for(int i = 0; i<tc; i++){
          N =scan.nextInt();
          D = scan.nextInt();
        int[] array = new int[N];
        for(int j= 0; j< array.length; j++){
            array[j]=scan.nextInt();
        }
        gfg.rotateArray(array, D);
        gfg.printArray(array);
        System.out.println();
        }
	}

}
