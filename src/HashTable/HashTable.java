package HashTable;


public class HashTable {
    LinkedList[] indexes = new LinkedList[10];

    public int hashCode(int data) {
        return data%10;
    }

    public void insert(int data) {
        int index = hashCode(data);

        if (indexes[index] == null) {
            indexes[index] = new LinkedList();
        }
        indexes[index].insert(data);
    }

    public Node search(int data) {
        int index = hashCode(data);

        return indexes[index].search(data);
    }

    public void delete(int data) {
        int index = hashCode(data);

        indexes[index].delete(data);
    }
}
