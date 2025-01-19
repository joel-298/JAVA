// HASHTABLE OPEN ADDRESSING




class HashTableOpenAddressing {
    private Entry[] table;
    private int size;

    static class Entry {
        int key;
        String value;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTableOpenAddressing(int size) {
        this.size = size;
        table = new Entry[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, String value) {
        int index = hash(key);
        while (table[index] != null && table[index].key != key) {
            index = (index + 1) % size;
        }
        table[index] = new Entry(key, value);
    }

    public String get(int key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + 1) % size;
        }
        return null;
    }

    public void putQuadratic(int key, String value) {
        int index = hash(key);
        int i = 1;
        while (table[index] != null && table[index].key != key) {
            index = (index + i * i) % size;  // Quadratic probing
            i++;
        }
        table[index] = new Entry(key, value);
    }
    public void putDoubleHash(int key, String value) {
        int index = hash(key);
        int stepSize = hash2(key);  // Second hash function
        int i = 1;
        while (table[index] != null && table[index].key != key) {
            index = (index + i * stepSize) % size;  // Double hashing
            i++;
        }
        table[index] = new Entry(key, value);
    }

    private int hash2(int key) {
        return 7 - (key % 7);  // Example of a second hash function (using a prime number)
    }


    public static void main(String[] args) {
        HashTableOpenAddressing hashTable = new HashTableOpenAddressing(10);
        hashTable.put(123, "Locker 1");
        hashTable.put(133, "Locker 2");
        hashTable.put(456, "Locker 3");

        System.out.println("Value for key 123: " + hashTable.get(123));
        System.out.println("Value for key 133: " + hashTable.get(133));
        System.out.println("Value for key 456: " + hashTable.get(456));
    }
}