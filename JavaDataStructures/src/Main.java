//import java.sql.Time;

public class Main {
    public static void main(String[] args)
    {
        /*System.out.println("Hello world!");
        int[] nums = {5,5,5,6,6,5,4,5,54};
        RemoveArrayEvenNumber removeArrayEvenNumber = new RemoveArrayEvenNumber();
        nums = removeArrayEvenNumber.removeEven(nums);*/

    /*    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        ReverAnArray reverAnArray = new ReverAnArray();
        reverAnArray.revertArray(nums);*/


      /*  int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 11, 12, 13, 14, 15, -16, 17, 18, 19, -20};
        FindMin findMin = new FindMin();
       int min = findMin.findMin(nums);
        System.out.print(min);*/

      /*  for(int i : nums)
        {
            System.out.print(i+"\t");
        }*/

        FindingSecondLargest findingSecondLargest = new FindingSecondLargest();
        int[] nums = {1,45,12,76,89,9,98,100,102,500,450};
        System.out.println(findingSecondLargest.findSecondLargestNumber(nums));

    }
}