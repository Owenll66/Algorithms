public class BubbleSort
{
    static void bubbleSort(int[] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] test1 = {9,5,8,7,2,3,4,1,6};
        int[] test2 = {123,4564,12,8456,87,2318,5};

        //Test1
        System.out.print("Test1:\n");
        printArray(test1);
        System.out.println();

        bubbleSort(test1);
        System.out.print("Result after bubbleSort:\n");
        printArray(test1);
        System.out.println("\n");

        //Test2
        System.out.print("Test2:\n");
        printArray(test2);

        System.out.println();
        bubbleSort(test2);
        System.out.print("Result after bubbleSort:\n");
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
