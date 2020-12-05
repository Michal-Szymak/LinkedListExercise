package com.company;

public class GenericElement <T> {
    private GenericElement previous;
    private T value;
    private GenericElement next;

    public GenericElement(GenericElement previous, T value, GenericElement next) {
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

    public GenericElement getPrevious() {
        return previous;
    }

    public void setPrevious(GenericElement previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public GenericElement getNext() {
        return next;
    }

    public void setNext(GenericElement next) {
        this.next = next;
    }
}
