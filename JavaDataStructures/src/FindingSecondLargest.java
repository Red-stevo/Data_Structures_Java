public class FindingSecondLargest {
    public  int  findSecondLargestNumber( int[] Array)
    {
        //applying bubble sort algorithm .
        for(int i =0;i<2;i++)
            for (int j = i+1;j<Array.length;j++)
            {
                if(Array[j] > Array[i])
                {
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }

            }
        return Array[1];
    }
}
