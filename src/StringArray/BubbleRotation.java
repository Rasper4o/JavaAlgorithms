package StringArray;

public class BubbleRotation {

    public static void rotate(int[] arr, int order)
    {
        if (arr == null || order < 0)
            throw new IllegalArgumentException("Illegal argument.");

        for (int i=0; i<order; i++)
        {
            for (int j = arr.length-1; j>0; j--)
            {
                int temp = arr[j];
                arr[j] = arr[--j];
                arr[--j] = temp;
            }
        }
    }

}
