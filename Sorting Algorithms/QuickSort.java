public class QuickSort{
    /*
    * INPUT: arr[] -- the arr that need to sort
    *        firstIndex -- the index of the first element (usually 0 at the start)
    *        lastIndex -- the index of the last element (usually equals arr.length - 1)
    */
    public static void quickSort(int arr[],int firstIndex,int lastIndex)
    {
        if (firstIndex < lastIndex)
        {
            int pivotIndex = partition(arr, firstIndex, lastIndex);

            quickSort(arr, firstIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, lastIndex); 
        }
    }

    // Great partition explanation https://www.youtube.com/watch?v=MZaf_9IZCrc
    public static int partition(int arr[], int firstIndex, int lastIndex) 
    {
        int pivot = arr[lastIndex];
        int i = firstIndex-1;

        // Move the element smaller than pivot to the left side, arr[0]-arr[i]
        // are smaller than the pivot
        for (int j=firstIndex; j<lastIndex; j++) 
        { 

            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        } 

        // Switch the pivot to the right position
        int temp = arr[i+1];
        arr[i+1] = arr[lastIndex];
        arr[lastIndex] = temp;

        return i+1;
    }
    public static void main(String []args)
    {
        int[] test1 = {1, 3 ,8 ,9, 7, 5, 4, 2, 6};
        int[] test2 = {123, 4678, 798, 4654564, 145, 623, 33};
        System.out.print("Test1:\n");
        for(int i = 0; i < test1.length; i++)
        {
          System.out.print(" "+test1[i]);
        }
        System.out.println();
        quickSort(test1, 0, test1.length - 1);
        System.out.print("Result after quickSort:\n");
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
        quickSort(test2, 0, test2.length - 1);
        System.out.print("Result after quickSort:\n");

        for(int i = 0; i < test2.length; i++)
        {
          System.out.print(" "+test2[i]);
        }
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
