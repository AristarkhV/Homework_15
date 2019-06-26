package mateacademy.homework.homework_13;

import java.util.List;

@CustomerAnnotation
public class CustomerDaoImpl implements CustomerDaoInterface {

    @Override
    public void add(Customer customer) {
        Storage.CUSTOMERS.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return Storage.CUSTOMERS;
    }
}
