package video4.task1;

public class Main {
    public static void main(String[] args) {
        DOCHandler docHandler = new DOCHandler();
        docHandler.open();
        docHandler.create();
        docHandler.change();
        docHandler.save();

        TXTHandler txtHandler = new TXTHandler();
        txtHandler.open();
        txtHandler.create();
        txtHandler.change();
        txtHandler.save();

        XMLHandler xmlHandler = new XMLHandler();
        xmlHandler.open();
        xmlHandler.create();
        xmlHandler.change();
        xmlHandler.save();
    }
}