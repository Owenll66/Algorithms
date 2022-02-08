import java.util.Arrays;

public class MergeSort
{
   /*
    * INPUT: arr -- the array to merge
    *        firstIndex -- the first element index (usually 0 at the start)
    *        middleIndex -- the middle element index ((left + right) / 2)
    *        rightIndex -- the last element index (usually arr.lenth-1 at the end)
    */
    public static void merge(int arr[], int firstIndex, int middleIndex, int lastIndex) 
    { 
        int leftArrayLength = middleIndex - firstIndex + 1; 
        int rightArrayLength =  lastIndex - middleIndex; 

        // Copy the left half to arr L
        int[] L = Arrays.copyOfRange(arr, firstIndex, middleIndex + 1);

        // Copy the right half to arr R
        int[] R = Arrays.copyOfRange(arr, middleIndex + 1, lastIndex + 1); 

        
        for (int i = 0; i < rightArrayLength; i++) 
            R[i] = arr[middleIndex + 1+ i]; 

        int i = 0;
        int j = 0;
        int k = firstIndex;

        // Sort array from the smallest to the largest
        while (i < leftArrayLength && j < rightArrayLength) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            }

            k++; 
        } 
      
        // Add the remaining elements from arr L to the end
        while (i < leftArrayLength) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
      
        // Add the remaining elements from arr R to the end
        while (j < rightArrayLength) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }
    /*
    * INPUT: arr -- the array need to sort
    *        first -- the first element index (usually 0 at the start)
    *        last -- the last element index (usually arr.lenth-1 at the end)
    */
    static void mergeSort(int arr[], int firstIndex, int lastIndex) 
    { 
        if (firstIndex < lastIndex) 
        { 
            int middle = (firstIndex+lastIndex)/2; 
  
            mergeSort(arr, firstIndex, middle); 
            mergeSort(arr , middle+1, lastIndex); 
            merge(arr, firstIndex, middle, lastIndex); 
        } 
    }
    
    public static void main(String []args)
    {
        int[] test1 = {1, 3 ,8 ,9, 7, 5, 4, 2, 6};
        int[] test2 = {213, 4622378, 723298, 4654564, 1, 2, 3213,4343};

        // Test1
        System.out.print("Test1:\n");
        printArray(test1);
        System.out.println();
        mergeSort(test1, 0, test1.length - 1);
        System.out.print("Result after mergeSort:\n");
        printArray(test1);
        System.out.println("\n");

        // Test2
        System.out.print("Test2:\n");
        printArray(test2);
        System.out.println();
        mergeSort(test2, 0, test2.length - 1);
        System.out.print("Result after mergeSort:\n");
        printArray(test2);
    }

    private static void printArray(int[] arr)
    {
        System.out.print("[ ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("]");
    }
}
