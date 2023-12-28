package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInJava {

    List<BookModel> bookModelList = new ArrayList<>();



    public BookModel createBookModel(String namea, String nameb, String namec)
    {
        BookModel bookModel = new BookModel();

        bookModel.setAuthor(namea);
        bookModel.setTitle(nameb);
        bookModel.setPages(namec);

        return bookModel;
    }

    public List<BookModel> setArrayList()
    {
        bookModelList.add(createBookModel("Stephen", "The House", "200pgs"));
        bookModelList.add(createBookModel("Vincent", "Am the one", "300pgs"));
        bookModelList.add(createBookModel("Kinuthia", "The Best Man", "400pgs"));

        return bookModelList;
    }

    public void printList()
    {
        List<BookModel> bookModels = setArrayList();

        for(BookModel bookModel : bookModels)
        {
            System.out.println(bookModel);
        }
    }



   /* public void setBookModel()
    {
        BookModel bookModel = new BookModel();

        bookModel.setTitle(" Heey I Am The One ");
        bookModel.setPages(" 200pgs ");
        bookModel.setAuthor("Steve");

        bookModelList.add(bookModel);

        BookModel bookModel1 = new BookModel();

        bookModel1.setTitle(" Heey ");
        bookModel1.setPages(" 100pgs ");
        bookModel1.setAuthor("Stephen");

        bookModelList.add(bookModel1);


        for(int i = 0;i < 2;i++)
        {
            System.out.println(bookModelList.get(i).getTitle());
        }


        for(BookModel bookModel1 : bookModelList)
        {
            System.out.println(bookModel1);
        }

    }

    public void printBooks()
    {
        setBookModel();

        for(Object bookModel1 : bookModelList)
        {
            System.out.println(bookModel1);
        }

        System.out.println(bookModelList.get(1)+ " we are done.....");
        System.out.println(bookModelList.get(0)+ " we are done.....");
        System.out.println(bookModelList.get(2)+ " we are done.....");
    }

    List<Integer> intList = new ArrayList<>();

    public void intArrayList()
    {


        int num;

        num=6;
        intList.add(num);
        num=7;
        intList.add(num);
        num=8;
        intList.add(num);
        num=9;
        intList.add(num);
        num=10;
        intList.add(num);

        for(int list : intList)
        {
            System.out.println(list);
        }

    }


    public void listArray()
    {

        List<int[]> listArray = new ArrayList<>();

        int[] num = {3,5,6,8,9};
        listArray.add(num);
        num = new int[]{13, 23, 54, 67};

        listArray.add(num);

        for (int[] i : listArray)
        {
            System.out.println(i);
        }
    }*/


}


