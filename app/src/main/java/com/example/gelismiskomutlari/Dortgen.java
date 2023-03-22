package com.example.gelismiskomutlari;

public class Dortgen {
    public int kisakenar;
    public int uzunkenar;

    public Dortgen(int kisakenar, int uzunkenar) {
        this.kisakenar = kisakenar;
        this.uzunkenar = uzunkenar;
    }

    public Dortgen(int kisakenar) {
        this.kisakenar = kisakenar;
        this.uzunkenar = kisakenar;
    }

    public int alanBul(){
        int alan;
        alan = kisakenar * uzunkenar;
        return alan;
    }

}
