

public class Sort
{
    public static void main(String[] args)
    {
        int[] num = {12,35,3,7,9,56};
        int[] newNum = bubbleSort(num);
        for(int i=0;i<newNum.length;i++)
            System.out.println(newNum[i]);
    }
    public static int[] bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0;i<size-1;i++)
        {
            for(int j =0;j<size-i-1;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
    public static int[] InsertSort(int[] numbers)
    {
        int temp = 0;
        for(int i=0;i<numbers.length;i++)
        {
            temp = numbers[i];
            for(int j=i+1;j>0 && numbers[j-1]>temp;j--)
            {

            }
        }

    }
}
