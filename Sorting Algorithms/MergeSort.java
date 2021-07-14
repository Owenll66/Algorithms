public class MergeSort
{
   /*
    *INPUT: arr -- the array to merge
    *       firstIndex -- the first element index (usually 0 at the start)
    *       middle -- the middle element index ((left + right) / 2)
    *       rightIndex -- the last element index (usually arr.lenth-1 at the end)
    */
    public static void merge(int arr[], int firstIndex, int middle, int lastIndex) 
    { 
        int leftArrayLength = middle - firstIndex + 1; 
        int rightArrayLength =  lastIndex - middle; 
      
        int[] L = new int[leftArrayLength]; 
        int[] R = new int[rightArrayLength]; 
        
        //copy the left half to arr L
        for (int i = 0; i < leftArrayLength; i++) 
            L[i] = arr[firstIndex + i];
       
        //copy the right half to arr R
        for (int i = 0; i < rightArrayLength; i++) 
            R[i] = arr[middle + 1+ i]; 
      
        int i = 0;
        int j = 0;
        int k = firstIndex;
        
        //sort array from the smallest to the largest
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
      
        //add the remaining elements from arr L to the end
        while (i < leftArrayLength) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
      
        //add the remaining elements from arr R to the end
        while (j < rightArrayLength) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }
    /*
    *INPUT: arr -- the array need to sort
    *       first -- the first element index (usually 0 at the start)
    *       last -- the last element index (usually arr.lenth-1 at the end)
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
        System.out.print("Test1:\n");
        for(int i = 0; i < test1.length; i++)
        {
          System.out.print(" "+test1[i]);
        }
        System.out.println();
        mergeSort(test1, 0, test1.length - 1);
        System.out.print("Result after mergeSort:\n");
        for(int i = 0; i < test1.length; i++)
        {
          System.out.print(" "+test1[i]);
        }
        System.out.println();
        System.out.println();
        //Test2
        System.out.print("Test2:\n");
        for(int i = 0; i < test2.length; i++)
        {
          System.out.print(" "+test2[i]);
        }
        System.out.println();
        mergeSort(test2, 0, test2.length - 1);
        System.out.print("Result after mergeSort:\n");
        for(int i = 0; i < test2.length; i++)
        {
          System.out.print(" "+test2[i]);
        }
    }
}
