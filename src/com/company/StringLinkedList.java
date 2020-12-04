package com.company;

public class StringLinkedList {
    private int size;
//    private int index;
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
        return this.current.getCurrent();
    }

//    public void add(String value){
//        if(first == null){
//            this.first = new com.company.Element(null, value, null);
//            this.current = this.first;
//        } else if(current.getNext() != null){
//            this.current.setNext(new com.company.Element(this.current, value, this.current.getNext()));
//            this.current.getNext().setPrevious(this.current);
//        } else {
//            this.current.setNext(new com.company.Element(this.current, value, null));
//        }
//    }

//    public boolean hasNext(){
//        return first.getNext() != null;
//    }
//
//    public String getNext(){
//        if(hasNext()){
//            pointer.setPrevious(pointer.getCurrent());
//            pointer.setCurrent(pointer.getNext());
//            if(!pointer.getNext().equals(this.last)){
//            }
//
//            return pointer.getNext();
//        } else {
//            return null;
//        }
//    }


}
