package lesson13;

public class KeyStorage<T> {
    private T key;

    public KeyStorage(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyStorage{" +
                "key=" + key +
                '}';
    }
}
