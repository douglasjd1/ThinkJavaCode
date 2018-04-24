public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] array = {1,5,9};
        double[] doubleArray = {10,15.0,20};
        String[] stringArray = new String[10];
        stringArray[0] = "Hi";
        stringArray[3] = "Hello";
        stringArray[9] = "Bye";
        printArray(array);
        printTotal(array);
        System.out.println("Array max is: " + arrayMax(array));
        System.out.println("Max index is: " + arrayMaxIndex(array));
        System.out.println("The average is: " + arrayAverage(doubleArray));
        printArray(stringArray);
    }

    private static void printArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
    }

    private static void printArray(String[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ ", ");
        }
        System.out.println();
    }

    private static void printTotal(int[] array)
    {
        int total = 0;
        for(int i=0;i<array.length;i++)
        {
            total+=array[i];
        }
        System.out.println("The total is: " + total);
    }

    private static int arrayMax(int[] array)
    {
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }

    private static int arrayMaxIndex(int[]array)
    {
        int index=0;
        int max=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
                index=i;
        }
        return index;
    }

    private static double arrayAverage(double[] array)
    {
        int total=0;
        double arrayLength = array.length;
        for(int i=0;i<array.length;i++)
        {
            total+=array[i];
        }
        return total/arrayLength;
    }


}
