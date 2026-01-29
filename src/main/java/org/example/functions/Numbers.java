package org.example.functions;

public class Numbers {

    int a;
    int b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void seta(int a){
        this.a = a;
    }
    public void setb(int b){
        this.b = b;
    }

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }
}
