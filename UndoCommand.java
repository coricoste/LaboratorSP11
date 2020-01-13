class UndoCommand implements Command {

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        DocumentManager.getInstance().getHistory().unexecute();
    }

    @Override
    public void unexecute() {
        // TODO Auto-generated method stub

    }

}
