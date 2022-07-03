import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class books {

    book theBooks[] = new book[50];
    Map<String,String> mp=new TreeMap<String,String>();
    public static int count;
    Scanner input = new Scanner(System.in);

    public int compareBookObjects(book b1, book b2)
    {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }
        if (b1.sNo == b2.sNo) {
            System.out.println("Book of this Serial No Already Exists.");
            return 0;
        }
        return 1;
    }
    public void addBook(book b)
    {
        for (int i = 0; i < count; i++)
        {
            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;
        }
        if (count < 50)
        {
            theBooks[count] = b;
            count++;
        }
        else {
            System.out.println("No Space to Add More Books.");
        }
    }

    public void searchByAuthorName()
    {
        System.out.println("\tSEARCH BY AUTHOR'S NAME");
        input.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\t\tName\t\t\t\t\tAuthor" );
        for (int i = 0; i < count; i++)
        {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {
                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t"
                        + theBooks[i].authorName + "\t\t");
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }
    public void searchByCategory(){
        System.out.println("\t\tSEARCH BY CATEGORY:");
        input.nextLine();
        System.out.println("Enter Category:");
        String category = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\t\t\tAuthor\t\tCategory");
        for (int i = 0; i < count; i++)
        {
            if (category.equalsIgnoreCase(theBooks[i].category)) {
                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t"
                        + theBooks[i].authorName + "\t\t" + theBooks[i].category + "\t\t");
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + category + " Found.");

    }
    public void searchByTitle(){
        System.out.println("\t\tSEARCH BY TITLE:");
        input.nextLine();
        System.out.println("Enter Title:");
        String title = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\t\t\tAuthor\t\tCategory");
        for (int i = 0; i < count; i++)
        {
            if (title.equalsIgnoreCase(theBooks[i].title)) {
                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t"
                        + theBooks[i].authorName + "\t\t" + theBooks[i].category + "\t\t");
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + title + " Found.");

    }

    public void showAllBooks()
    {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tCategory");

        for (int i = 0; i < count; i++) {
            System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + theBooks[i].category);


        }

    }
    public int sortbyauthor(){
        for (int i = 0; i < count; i++) {
            mp.put(theBooks[i].authorName, theBooks[i].bookName);
        }

        System.out.println("the book sorted by author name:");
        System.out.println(mp);

        return 0;

    }public int sortbycategories(){
        for (int i = 0; i < count; i++) {
            mp.put(theBooks[i].category, theBooks[i].bookName);
        }

        System.out.println("the book sorted by author name:");
        System.out.println(mp);

        return 0;

    }
    public void dispMenu()
    {
        System.out.println("\nPress 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Search a Book.");
        System.out.println("Press 3 to Show All Books.");
        System.out.println("Press 4 to Sort All Books by author name:");
        System.out.println("Press 5 to Sort All Books by Category:");
    }
    public int isAvailable(int sNo)
    {

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println("Book is Unavailable");
                return -1;
            }
        }
        System.out.println("No Book of Serial Number " + " Available in Library.");
        return -1;
    }
}
