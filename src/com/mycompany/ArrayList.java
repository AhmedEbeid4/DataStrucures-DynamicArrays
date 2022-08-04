package com.mycompany;

public class ArrayList{
    private int size;
    private int []af;
    private int capacity;


    ArrayList(){
        capacity=10;
        af=new int[capacity];
    }
    public void add(int y){
        if (capacity != size){
            size++;
            if (size==1){
                af[0]=y;
            }
            else {
                af[size-1]=y;
            }
        }else{
            capacity=capacity+5;
            af=addingError(capacity,af);
            size++;
            if (size==1){
                af[0]=y;
            }
            else {
                af[size-1]=y;
            }
        }
    }
    public void add(int element, int position){
        if (!(position<0 || position>size-1)){
            if (position==size-1){
                add(element);
                size--;
            }else {
                af=addAtPosition(af,element,position);
            }
            size++;
        }else{
            System.out.println("out of the index");
        }
    }
    private int [] addAtPosition(int [] af, int element ,int position){
        int [] newArray = new int[af.length+1];
        int u =0;
        for (int i =0; i<newArray.length;i++){
            if (i==position) {
                newArray[i]=element;
                continue;
            }
            newArray[i]=af[u++];
        }
        return newArray;
    }

    private int[] addingError(int capacity,int [] af){
        int y []= new int[capacity];
        for (int i =0; i< af.length;i++){
            y[i]=af[i];
        }
        return y;
    }

    public String toString(){
        String a ="["+af[0]+" , ";
        for (int i =1 ; i<size;i++){
            if (i==size-1){
                a=a+af[i];
            }else{
                a=a+af[i]+" , ";
            }
        }
        a=a+']';
        return a;
    }
    public int get(int position){
        return af[position];
    }
    public void set(int element, int position){
        int []o = new int[size];

        for (int i =0 ; i<size;i++){
            if(i==position){
                o[i]=element;
                continue;
            }
            o[i]=af[i];
        }
        af=o;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize() {
        return size;
    }
    public int getLast(){
        return af[size-1];
    }
    public int[] toArray(){
       return af;
    }
}
