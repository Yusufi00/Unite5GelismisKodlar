package com.example.gelismiskomutlari;

public class ElektirikliCihaz {
    public String CihazAdi;
    public int CihazGucu;
    public int GunlukSaat;
    public int aylikTuketim() {
        int aylikKullanim;
        aylikKullanim = CihazGucu*GunlukSaat*30;
        return aylikKullanim;
    }

}
