package mateacademy.homework.homework_13;

public class BetDaoFactory {
    private static DaoInterface<Bet> instance;

    public static DaoInterface<Bet> getInstance() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
