package storage;

import java.util.ArrayList;

public interface ReadWriteFile<T> {
    void setOrders(ArrayList<T> list);
    ArrayList<T> getOrders();
}
