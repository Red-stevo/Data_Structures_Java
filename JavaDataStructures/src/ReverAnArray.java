public class ReverAnArray {

    public int[] revertArray(int[] Array)
    {
        int end = Array.length-1;
        int start =0;
        int temp;
        if(end == 0)
        {
            return Array;
        }

        while(start < end)
        {
            //revert the array by swapping.
            temp = Array[end];
            Array[end] = Array[start];
            Array[start] = temp;
            ++start;
            --end;
        }
        return Array;
    }
}
