package mateacademy.homework.homework_13;

import java.util.List;

@CustomerAnnotation
public class CustomerDaoImpl implements DaoInterface<Customer> {

    @Override
    public void add(Customer customer) {
        Storage.customers.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return Storage.customers;
    }
}
