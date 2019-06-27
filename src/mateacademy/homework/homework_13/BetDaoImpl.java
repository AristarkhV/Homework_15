package mateacademy.homework.homework_13;

import java.util.List;

@Dao
public class BetDaoImpl implements BetDaoInterface {
    @Override
    public void add(Bet bet) {

        Storage.BETS.add(bet);
    }

    @Override
    public List<Bet> getAll() {

        return Storage.BETS;
    }
}
