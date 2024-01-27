package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DesignHashMap {
    List<List<Integer>> hashValues;

    public DesignHashMap() {
        hashValues = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean found = false;
        for (List<Integer> v : hashValues) {
            if (v.get(0) == key) {
                v.set(1, value);
                found = true;
                break;
            }
        }

        if (!found) {
            List<Integer> hashVal = new ArrayList<>();
            hashVal.add(key);
            hashVal.add(value);
            hashValues.add(hashVal);
        }
    }

    public int get(int key) {
        for (List<Integer> v : hashValues) {
            if (v.get(0) == key) {
                return v.get(1);
            }
        }
        return -1;
    }

    public void remove(int key) {
        Iterator<List<Integer>> iterator = hashValues.iterator();
        while (iterator.hasNext()) {
            List<Integer> v = iterator.next();
            if (v.get(0) == key) {
                iterator.remove();;
            }
        }
    }
}