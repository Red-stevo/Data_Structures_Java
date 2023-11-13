public class FindMin {
    public int findMin(int[] Array)
    {
        int minValue = Array[0];
        int start=1;
        while(start < Array.length)
        {
            if(Array[start] < minValue)
            {
                minValue = Array[start];
            }
            ++start;
        }
        return minValue;
    }
}
