public class Main {


   static FindThemissingNumber findThemissingNumber;
    public  static singlyLinkList createNode( int data)
    {
        singlyLinkList node = new singlyLinkList(data);
        return  node;
    }


  /*  public static void main(String[] args) {
        singlyLinkList head = new singlyLinkList();
        singlyLinkList temp = new singlyLinkList();

        int i = 0;
        while (i < 5) {
            singlyLinkList node = createNode(30);
            if (i == 0) {
                temp = head = node;
            } else {
                temp.next = node;
                temp = node;
            }
            i++;
        }
        temp = head;
        do {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        } while (temp.next != null);

    }*/

    public static void main(String[] args) {
        findThemissingNumber = new FindThemissingNumber();
        int[] array = {1,2,3,4,6,5,7,8,9,10,11,12,13,14,15,16,17,18,19,21};
        System.out.println(findThemissingNumber.findMissingNumber(array));
    }
}