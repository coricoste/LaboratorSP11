import java.util.Stack;

public class DocumentManager {

    public DocumentManager() {
        // TODO Auto-generated constructor stub

    }

    private static DocumentManager instance= null;
    private Book book = null;
    private Section section = null;
    private FirstObserver firstObserver = new FirstObserver();
    private SecondObserver secondObserver = new SecondObserver();
    private Stack<Command> history = new Stack<Command>();

    public static DocumentManager getInstance()
    {
        if (instance == null)
        {
            instance = new DocumentManager();
        }
        return instance;
    }

    public void setBook(Book set_book)
    {
        this.book = set_book;
    }

    public static Book getBook()
    {
        return instance.book;
    }

    public FirstObserver getFirstObserver() {
        return this.firstObserver;
    }

    public SecondObserver getSecondObserver() {
        return this.secondObserver;
    }

    public void setSection(Section new_section)
    {
        this.section = new_section;
    }

    public Section getSection()
    {
        return this.section;
    }

    public Command getHistory()
    {
        Command cmd = this.history.peek();
        this.history.pop();
        return cmd;
    }

    public void setHistory(Command history)
    {
        this.history.push(history);
    }
}