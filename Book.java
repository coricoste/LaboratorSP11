import java.util.ArrayList;
import java.util.List;

public class Book implements Element {

    private Author author;
    private String name;

    private List<Author> authorList = new ArrayList<Author>() ;
    private List<Element> content = new ArrayList<Element>();

    public Book()
    {

    }
    public Book(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Book" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addAuthor(Author author)
    {
        authorList.add(author);
    }

    public void print()
    {
        for (Author a : authorList)
        {
            a.print();
        }

        for (Element e : content)
        {
            e.print();
        }
    }
    public void addContent(Element e)
    {
        // TODO Auto-generated method stub
        content.add(e);
    }

    public void accept(Visitor visitor)
    {
        for (Element element : content)
        {
            element.accept(visitor);
        }
        visitor.visit(this);
    }

    @Override
    public void add(Element element) {
        this.content.add(element);
    }

    @Override
    public void remove(Element element) {
        this.content.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return this.content.get(index);
    }

    public Book copy()
    {
        return new Book(this.name);
    }
}
