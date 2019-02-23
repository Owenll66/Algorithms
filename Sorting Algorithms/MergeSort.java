public class MergeSort
{
    public static void merge(int arr[], int left, int middle, int right) 
    { 
        int i, j, k; 
        int n1 = middle - left + 1; 
        int n2 =  right - middle; 
      
        int[] L = new int[n1]; 
        int[] R = new int[n2]; 
        
        //copy the left half to arr L
        for (i = 0; i < n1; i++) 
            L[i] = arr[left + i]; 
        //copy the right half to arr R
        for (j = 0; j < n2; j++) 
            R[j] = arr[middle + 1+ j]; 
      
        i = 0;
        j = 0;
        k = left;
        
        //sort array from the smallest to the largest
        while (i < n1 && j < n2) 
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
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
      
        //add the remaining elements from arr R to the end
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }
    static void mergeSort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            int middle = (left+right)/2; 
  
            mergeSort(arr, left, middle); 
            mergeSort(arr , middle+1, right); 
            merge(arr, left, middle, right); 
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
