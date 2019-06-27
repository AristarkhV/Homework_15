package mateacademy.homework.homework_13;

import java.util.List;

public interface CustomerDaoInterface {
    void add(Customer customer);

    List<Customer> getAll();
}
