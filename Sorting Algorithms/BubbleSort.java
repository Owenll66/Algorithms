public class BubbleSort
{
    static void bubbleSort(int[] input)
    {
		int temp = 0;
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input.length-i-1; j++)
			{
				if(input[j] > input[j+1])
				{
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
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
		for(int i = 0; i < test1.length; i++)
		{
			System.out.print(" "+test1[i]);
		}
		System.out.println();
		bubbleSort(test1);
		System.out.print("Result after bubbleSort:\n");
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
		bubbleSort(test2);
		System.out.print("Result after bubbleSort:\n");
		for(int i = 0; i < test2.length; i++)
		{
			System.out.print(" "+test2[i]);
		}
		System.out.println();
    }
}
