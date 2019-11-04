package com.company;

public class Book {

    private String bookTitle;
    private String authorName;
    private String description;
    private double price;
    private boolean myBoolean;

    public Book(){}

    public Book(String authorName, String bookTitle, String description){

        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.description = description;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public void getDisplayText(){
        System.out.println(authorName + ", " + bookTitle + ", " + description);
    }
}
//Create a project in IntelliJ called BookApplication.
//
//Create a Book class that allows for Book title, author, description, price and isInStock variables
//
//The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method called getDisplayText() which prints the author, title and description.
//
//
//
//The application shall also contain getters and setters for each private member variable.
//
//Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.
//
//
//
//Publish your solution to GitHub and submit your GitHub url as the assignment.