public class RemoveArrayEvenNumber {
    public int[] removeEven(int[] array) {
        int start = 0, end = array.length - 1;
        if(array.length == 0)
        {
            return array;
        }
        while ((array[end]) % 2 == 0 && end > start) {
            end--;
        }

        while ((array[start]) % 2 != 0 && start < end) {
            start++;
        }

        while (start < end) {
            while ((array[start]) % 2 != 0 && start < end) {
                start++;
            }
            while ((array[end]) % 2 == 0 && end > start) {
                end--;
            }
            if ((array[start]) % 2 == 0 && end > start) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                end--;
            }
        }
        if (array[end] % 2 != 0) {
            start = end + 1;
        }
        else
        {
            start = end;
        }
        while(start < array.length)
        {
            array[start] = 0;
            start++;
        }
        return array;
    }
}
