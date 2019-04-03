public interface OrderedList{
    int size();
    String toString();
    void add(int value);
    int get(int index);
    int set(int value, int index);
    int remove(int index);
}