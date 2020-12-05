package com.company;

public class GenericLinkedList <T>{
    private int size;
    private GenericElement<T> first;
    private GenericElement<T> current;

    public GenericLinkedList() {
        this.first = null;
    }

    public void add(T value){
        if(first == null){
            this.first = new GenericElement(null, value, null);
            this.current = this.first;
            this.size = 1;
        } else {
            while(this.current.getNext() != null){
                this.current = this.current.getNext();
            }
            this.current.setNext(new GenericElement(this.current, value, null));
            this.size++;
        }
    }

    public T get(int index){
        if(index >= size ){
            System.out.println("Index out of bounds.");
            return null;
        }
        this.current = this.first;
        for(int i = 0; i < index; i++){
            this.current = this.current.getNext();
        }
        return this.current.getValue();
    }

    public T next(){
        if(hasNext()){
            this.current = this.current.getNext();
            return this.current.getValue();
        } else {
            return null;
        }
    }

    public boolean hasNext(){
        return this.current.getNext() != null;
    }

    public int size(){
        return this.size;
    }
}
