package org.example;

public class BookModel {

    private String title;

    private String pages;

    private String author;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString()
    {
        return " Title " + title + " Pages " + pages + " Author " + author;
    }
}
