package mateacademy.homework.homework_13;

public class CustomerDaoFactory {
    private static DaoInterface<Customer> instance;

    public static DaoInterface<Customer> getInstance() {
        if (instance == null) {
            instance = new CustomerDaoImpl();
        }
        return instance;
    }
}
