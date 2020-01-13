import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main {

    public String Author;
    public String Book;
    public String Chapter;
    public String subChapter;
    public int Paragraph;
    public String Image;
    public String Table;

    public Main(String A, String B, String C, String sC, int P, String I, String T)
    {
        this.Author = A;
        this.Book = B;
        this.Chapter = C;
        this.subChapter = sC;
        this.Image = I;
        this.Table = T;
    }

    public static void main(String [] args) throws Exception
    {

        Section cap1 = new Section("Capitolul 1");
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(new Paragraph("Another One"));
        cap1.add(new Paragraph("Another Two"));
        cap1.add(new Paragraph("Another Three"));
        DocumentManager.getInstance().setSection(cap1);
        System.out.println("Book Content: ");
        DocumentManager.getInstance().getSection().print();

        new DeleteCommand().execute();
        System.out.println("Book Content after the first delete: ");
        DocumentManager.getInstance().getSection().print();
        new DeleteCommand().execute();
        System.out.println("Book Content after the second delete: ");
        DocumentManager.getInstance().getSection().print();

        Command undoCommand = new UndoCommand();
        undoCommand.execute();
        System.out.println("Book Content after first undo: ");
        DocumentManager.getInstance().getSection().print();
        undoCommand.execute();
        System.out.println("Book Content after second undo: ");
        DocumentManager.getInstance().getSection().print();
    }

    public String getAuthor()
    {
        return Author;
    }

    public void setAuthor(String author)
    {
        Author = author;
    }

    public String getBook()
    {
        return Book;
    }

    public void setBook(String book)
    {
        Book = book;
    }

    public int getParagraph()
    {
        return Paragraph;
    }

    public void setParagraph(int paragraph)
    {
        Paragraph = paragraph;
    }

    public String getImage()
    {
        return Image;
    }

    public void setImage(String image)
    {
        Image = image;
    }

    public String getTable()
    {
        return Table;
    }

    public void setTable(String table)
    {
        Table = table;
    }


}