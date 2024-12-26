package com.academy.course.lesson12.home.work;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {

    private final static int INITIAL_CAPACITY = 10;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(Object[] array) {
        this.array = array;
    }

    public MyArrayList(int capacity) {
        if (capacity < 1)
            throw new ArrayIndexOutOfBoundsException("Invalid array value");
        this.array = new Object[capacity];
    }

    @Override
    public int size() {
        int count = 0;
        for (Object o : this.array) {
            if (o != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object var1) {
        int count = 0;
        for (Object o : this.array) {
            if (o.equals(var1)) {
                count++;
                break;
            }
        }
        return count != 0;
    }

    @Override
    public boolean add(Object var1) {
        if (this.array[array.length - 1] != null) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null) {
                this.array[i] = var1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object var1) {
        boolean isRemoved = false;
        for (int i = 0; i < this.array.length; i++) {
            if (isRemoved) {
                this.array[i - 1] = this.array[i];
                continue;
            }
            if (this.array[i] == var1) {
                isRemoved = true;
            }
        }
        if (isRemoved) {
            this.array[this.array.length - 1] = null;
        }
        return isRemoved;
    }

    @Override
    public boolean addAll(MyList<? extends T> var1) {
        boolean modified = false;
        Iterator<T> iterator = var1.iterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            modified = true;
            this.add(element);
        }
        return modified;
    }

    @Override
    public void add(int index, Object obj) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.array[array.length - 1] != null) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        for (int i = this.array.length - 2; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = obj;
    }

    @Override
    public boolean addAll(int index, MyList col) {
        return false;
    }

    @Override
    public Object get(int index) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.array[index];
    }

    @Override
    public int indexOf(Object obj) {

        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public Object remove(int index) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object indexObject = this.array[index];
        for (int i = index + 1; i < this.array.length; i++) {
            this.array[i - 1] = this.array[i];
        }
        this.array[this.array.length - 1] = null;
        return indexObject;
    }

    @Override
    public Object set(int index, T obj) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object indexObject = this.array[index];
        this.array[index] = obj;
        return indexObject;
    }

    @Override
    public void sort(Comparator comp) {

    }

    @Override
    public boolean removeAll(MyList<T> col) {
       return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        int arrayLength = this.size();
        for (int i = 0; i < arrayLength; i++) {
            if (i != 0) {
                res.append(", ");
            }
            res.append(this.array[i].toString());
        }
        return "[" + res + "]";
    }
}
