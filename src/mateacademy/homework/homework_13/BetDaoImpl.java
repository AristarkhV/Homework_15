package mateacademy.homework.homework_13;

import java.util.List;

@Dao
public class BetDaoImpl implements DaoInterface<Bet> {
    @Override
    public void add(Bet bet) {

        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {

        return Storage.bets;
    }
}
