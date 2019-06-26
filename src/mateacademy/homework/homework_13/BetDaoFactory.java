package mateacademy.homework.homework_13;

public class BetDaoFactory {
    private static BetDaoInterface instance;

    public static BetDaoInterface getInstance() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
