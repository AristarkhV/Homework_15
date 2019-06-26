package mateacademy.homework.homework_13;

import java.util.List;

public interface DaoInterface<T> {
    void add(T t);

    List<T> getAll();
}
