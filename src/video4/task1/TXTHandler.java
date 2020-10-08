package video4.task1;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открыть  в формате TXT ");
    }

    @Override
    public void create() {
        System.out.println("Создать в формате TXT ");
    }

    @Override
    public void change() {
        System.out.println("Изменить в формате TXT ");
    }

    @Override
    public void save() {
        System.out.println("Сохранить в формате TXT ");
    }
}
