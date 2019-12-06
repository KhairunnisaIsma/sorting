/*
 Kelas ini menampilkan proses Bubble Sort yg lebih singkat
 daripada kelas Bubble Sort biasa (Tanpa menampilkan iterasi yg tidak perlu)   
 */

package sorting;
public class BubbleSortFast {
    
    public void bubbleSortFast(int arr[]){ 
        // variables declaration
        int iteration = 1;
        int n = arr.length;
        // Print the unsorted array
        System.out.print("The unsorted array: " + '\n');
        printArray(arr);
        // Start the sorting process
        for (int i = 0; i < n-1; i++){ 
            for (int j = 0; j < n-i-1; j++){ 
                if (arr[j] > arr[j+1]){
                    // Print the number of the iteration
                    System.out.print("Iteration " + iteration + " ");
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    // Print the action
                    System.out.print("(Swapped " + arr[j+1] + " and " + arr[j] + ")");
                    // Print the array
                    System.out.println("");
                    for (int a = 0; a < n; ++a){ 
                        System.out.print(arr[a] + " ");
                    } 
                    System.out.println('\n');
                    // Iteration goes on
                    iteration++;
                } 
            }
        }
        // Print the sorted array
        System.out.print("The sorted array: " + '\n');
        printArray(arr);
    }
    // Method for print array
     public void printArray(int[] array){
	    for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
            } 
	    System.out.println('\n');
	}
}
