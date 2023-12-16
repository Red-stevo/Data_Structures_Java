import java.lang.reflect.Array;

public class FindThemissingNumber {

    public int findMissingNumber(int[] array)
    {
        int numberFound;
        int length = array.length + 1;

        double sum = ((length + (length*length)) * 0.5);
        double numberSum = 0;

        for(int i : array)
        {
            numberSum = numberSum + i;
        }

        numberFound = (int)sum - (int)numberSum;

        return numberFound;
    }
}
