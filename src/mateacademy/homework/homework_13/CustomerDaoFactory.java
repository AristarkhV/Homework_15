package mateacademy.homework.homework_13;

public class CustomerDaoFactory {
    private static CustomerDaoInterface instance;

    public static CustomerDaoInterface getInstance() {
        if (instance == null) {
            instance = new CustomerDaoImpl();
        }
        return instance;
    }
}
