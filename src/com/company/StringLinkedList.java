package com.company;

public class StringLinkedList {
    private int size;
    private Element first;
    private Element current;

    public StringLinkedList() {
        this.first = null;
    }

    public void add(String value){
        if(first == null){
            this.first = new Element(null, value, null);
            this.current = this.first;
            this.size = 1;
        } else {
            while(this.current.getNext() != null){
                this.current = this.current.getNext();
            }
            this.current.setNext(new Element(this.current, value, null));
            this.size++;
        }
    }

    public String get(int index){
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

    public String next(){
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
