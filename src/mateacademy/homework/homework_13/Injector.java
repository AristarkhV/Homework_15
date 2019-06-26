package mateacademy.homework.homework_13;

import java.lang.reflect.Field;

public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoInterface> betDaoImplClass = BetDaoInterface.class;
        Class<CustomerDaoInterface> customerDaoClass = CustomerDaoInterface.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();

        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                if (field.getType().equals(betDaoImplClass)) {
                    field.set(null, BetDaoFactory.getInstance());
                }
                if (field.getType().equals(customerDaoClass)) {
                    field.set(null, CustomerDaoFactory.getInstance());
                }
            }
        }
    }
}
