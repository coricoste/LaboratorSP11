public class DeleteCommand implements Command {

    private Memento memento = new Memento();

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub

        Section sec = DocumentManager.getInstance().getSection();
        this.memento.setState(sec);
        Element e = sec.getLastElement();
        if (e != null)
        {
            sec.remove(e);
        }
        DocumentManager.getInstance().setHistory(this);
    }

    @Override
    public void unexecute() {
        // TODO Auto-generated method stub
        DocumentManager.getInstance().setSection((Section)this.memento.getState());
    }
}