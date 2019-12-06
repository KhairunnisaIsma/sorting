package sorting;
import java.util.Scanner;
public class Sorting {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input the length of the array
        System.out.println("Please enter the length of the array:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        // input the elements
        for(int i = 0; i < arr.length; i++){
            String remaining = String.valueOf(length-i);
            System.out.println("Please enter the element" + "(" + remaining +  " remaining" + "):");
            arr[i] = scan.nextInt();
        }
        printArray(arr);
        
        int menu;
        do{
            System.out.println("Menu Sorting");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Bubble Sort Fast");
            System.out.println("3. Insertion Sort");
            menu = scan.nextInt();
            switch(menu){
                case 1:
                    System.out.println("-----Bubble Sort-----");
                    BubbleSort bubble = new BubbleSort();
                    bubble.bubbleSort(arr);
                    menu = 0;
                    break;
                case 2:
                    System.out.println("-----Bubble Sort Fast-----");
                    BubbleSortFast bubbleFast = new BubbleSortFast();
                    bubbleFast.bubbleSortFast(arr);
                    menu = 0;
                    break;
                case 3:
                    System.out.println("-----Insertion Sort-----");
                    InsertionSort insertion = new InsertionSort();
                    insertion.insertionSort(arr);
                    menu = 0;
                    break;
                default:
                    System.out.println("Error");    
            }
        } while(menu != 0);
    }
    // Method for print array
     public static void printArray(int[] array){
	    for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
            } 
	    System.out.println('\n');
	}
}