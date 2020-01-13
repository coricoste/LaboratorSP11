public class Memento {

    private Element state;

    public Memento() {

    }
    public 	void setState(Element e) {
        this.state = e.copy();

    }
    public Element getState()
    {
        return this.state;
    }
}