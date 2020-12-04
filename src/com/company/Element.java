package com.company;

public class Element {
    private Element previous;
    private String current;
    private Element next;

    public Element(Element previous, String current, Element next) {
        this.previous = previous;
        this.current = current;
        this.next = next;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
