package myShop.pool;

import java.util.LinkedList;
import java.util.List;

public abstract class Pool<T extends Poolable>{
    List<T> freeObjects = new LinkedList<>();

    List<T> usedObjects = new LinkedList<>();


    public Pool() {}

    protected abstract T newObject();

    public T obtain () {
        if (freeObjects.isEmpty()) {
            T object = newObject();
            freeObjects.add(object);
        }

        T object = freeObjects.remove(0);
        usedObjects.add(object);

        return object;
    }

    public void free (T object) {
        usedObjects.remove(object);
        freeObjects.add(object);

        object.reset();
    }
}
