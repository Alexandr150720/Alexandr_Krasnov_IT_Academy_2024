package com.academy.course.lesson12.home.work;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {

    private final static int INITIAL_CAPACITY = 10;
    private T[] array;

    public MyArrayList() {
        this.array = (T[]) new Object[INITIAL_CAPACITY];
    }

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public MyArrayList(int capacity) {
        if (capacity < 1)
            throw new ArrayIndexOutOfBoundsException("Invalid array value");
        this.array = (T[]) new Object[capacity];
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
    public boolean contains(T var1) {
        for (T o: this.array) {
            if (o == null){
                return false;
            }
            if (o.equals(var1) ) {
               return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T var1) {
        if (this.array[array.length - 1] != null) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = (T[]) newArray;
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
    public boolean remove(T var1) {
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
    public boolean addAll(MyList<? extends T> inputArray) {
        return addAll(this.size(), inputArray);
    }

    @Override
    public void add(int index, T obj) {
        if (index > size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.array[array.length - 1] != null) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = (T[]) newArray;
        }
        for (int i = this.array.length - 2; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[index] = obj;
    }

    @Override
    public boolean addAll(int index, MyList<? extends T> col) {
        int offset = 0;
        if (col.isEmpty()){
            return false;
        }
        for (T element: col.toArray()){
            if (element != null) {
                this.add(offset + index, element);
                offset++;
            }
        }
        return true;
    }

    @Override
    public T get(int index) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.array[index];
    }

    @Override
    public int indexOf(T obj) {
        int index = -1;
        for (int i = 0; i < this.size() - 1; i++) {
            if (this.array[i] == obj){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(T obj) {
        int index = -1;
        for (int i = this.size() - 1; i > 0; i--) {
            if (this.array[i] == obj){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public T remove(int index) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T indexObject = this.array[index];
        for (int i = index + 1; i < this.array.length; i++) {
            this.array[i - 1] = this.array[i];
        }
        this.array[this.array.length - 1] = null;
        return indexObject;
    }

    @Override
    public T set(int index, T obj) {
        if (index > size() - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T indexObject = this.array[index];
        this.array[index] = obj;
        return indexObject;
    }

    @Override
    public void sort(Comparator<? super T> comp) {
        for (int i = 0; i < this.size(); i++) {
            boolean isChanged = false;
            for (int j = 0; j < this.size() - 1; j++) {
                if (comp.compare(this.array[j], this.array[j + 1]) > 0){
                    T element = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = element;
                    isChanged = true;
                }
            }
            if (!isChanged){
                return;
            }
        }
    }

    @Override
    public boolean removeAll(MyList<T> col) {
        boolean isRemoved = false;
        for (T element: col.toArray()){
            isRemoved |= this.remove(element);
        }
       return isRemoved;
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

    @Override
    public T[] toArray(){
        return this.array;
    }
}
