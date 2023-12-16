import java.util.*;

public class ArrayListPrac {

    //practice on array list

    public void arrayListPrac()
    {
        ArrayList arrayList = new ArrayList();
        {
            arrayList.add(34);
            arrayList.add("my name is steve");

            for (int i = 0; i < 2; i++)
            {
                System.out.println(arrayList.get(i));
            }
        }
    }
}