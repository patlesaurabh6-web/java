//mini project 

import java.util.*;
class Book
{
    int id;
    String name;
    Scanner sc;
    Page[]pages;//inner class object array
    //inner class defination
    class Page
    {
        int[] lines;
        Page (int numlines)
        {
            lines=new int [numlines];
        }
        void setLines()
        {
            for(int i=0;i<lines.length;i++)
            {
                System.out.println("Enter the num of words for lines "+(i+1));
                lines[i]=sc.nextInt();
            }
        }
        int getLines()
        {
            return lines.length;
        }
    }
    //outer class contructor
    Book(int id,String name,int numpages)
    {
        this.id=id;
        this.name=name;
        sc=new Scanner(System.in);
        pages=new Page[numpages];
        for(int i=0;i<pages.length;i++)
        {
            System.out.println("Enter the num oof lines for Page "+(i+1));
            int nlines=sc.nextInt();
            pages[i]=new Page(nlines);
            pages[i].setLines();
        }
    }
    public int getNumofWords()
    {
        int numofwords=0;
        for(int i=0;i<pages.length;i++)
        {
            for(int j=0;j<pages[i].getLines();j++)
            {
                numofwords+=pages[i].lines[j];
            }
        }
        return numofwords;
    }
}
public class BookStatic
{
    public static void main(String[] args) 
    {
        Book b=new Book(1, "OOPM BOOK", 3);
        int nowords=b.getNumofWords();
        System.out.println("Total words = "+nowords);    
    }
}