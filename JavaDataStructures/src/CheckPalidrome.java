import java.util.Arrays;

public class CheckPalidrome {
    public Boolean isItAPalidrome(int number) {

        //convert the number to a character array.
        Integer num = (Integer)number;
        String str = num.toString();
        char strArray[] = str.toCharArray();

        int j = strArray.length;
        //reverse the array;
        char[] reversedStrArray = new char[strArray.length];
        for(int i = 0; i < strArray.length; i ++)
        {
            reversedStrArray[i] = strArray[j-1];

            j--;
        }

        //convert back to numbers


        String fNumber = (Arrays.toString(strArray));
        String sNumber = (Arrays.toString(reversedStrArray));

       if(fNumber.equals(sNumber))
       {
           return true;
       }
       return false;
    }
}
