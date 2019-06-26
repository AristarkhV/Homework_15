package mateacademy.homework.homework_13;

public class Main {

    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Если хотите сделать ставку, введите \n" +
                "сумму, риск и имя через пробел (Для завершения работы введите 0):");
        ConsoleHandler.handle();
        CustomerDaoInterface customerDao = new CustomerDaoImpl();
        System.out.println(customerDao.getAll());
    }
}
