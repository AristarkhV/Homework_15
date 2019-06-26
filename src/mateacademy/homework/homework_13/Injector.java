package mateacademy.homework.homework_13;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoImplClass = BetDaoImpl.class;
        Class<CustomerDaoImpl> customerDaoClass = CustomerDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();

        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                if (field.getName().equals("betDao")) {
                    field.set(null, BetDaoFactory.getInstance());
                }
                if (field.getName().equals("customerDao")) {
                    field.set(null, CustomerDaoFactory.getInstance());
                }
            }
        }
    }
}
