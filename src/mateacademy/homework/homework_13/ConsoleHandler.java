package mateacademy.homework.homework_13;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static DaoInterface<Bet> betDao;

    @Inject
    private static DaoInterface<Customer> customerDao;

    public static void handle() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                Customer customer = new Customer(data[2], bet);
                betDao.add(bet);
                customerDao.add(customer);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("invalid data");
        }
    }
}
