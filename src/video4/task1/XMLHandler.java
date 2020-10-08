package video4.task1;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открыть в формате XML ");
    }

    @Override
    public void create() {
        System.out.println("Создать в формате XML ");
    }

    @Override
    public void change() {
        System.out.println("Изменить в формате XML ");
    }

    @Override
    public void save() {
        System.out.println("Сохранить в формате XML ");
    }
}
