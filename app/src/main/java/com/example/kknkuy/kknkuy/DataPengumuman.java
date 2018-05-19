package com.example.kknkuy.kknkuy;

import java.io.Serializable;

public class DataPengumuman implements Serializable{

    private String judulPengumuman;
    private String linkPengumuman;
    private String deskripsiPengumuman;

    public DataPengumuman(){

    }

    public String getJudulPengumuman() {
        return judulPengumuman;
    }

    public void setJudulPengumuman(String judulPengumuman) {
        this.judulPengumuman = judulPengumuman;
    }

    public String getLinkPengumuman() {
        return linkPengumuman;
    }

    public void setLinkPengumuman(String linkPengumuman) {
        this.linkPengumuman = linkPengumuman;
    }

    public String getDeskripsiPengumuman() {
        return deskripsiPengumuman;
    }

    public void setHarga(String deskripsiPengumuman) {
        this.deskripsiPengumuman = deskripsiPengumuman;
    }

    @Override
    public String toString(){
        return " "+judulPengumuman+"\n" +
                " "+linkPengumuman +"\n" +
                " "+deskripsiPengumuman;
    }

    public DataPengumuman(String jp, String lp, String dp){
        judulPengumuman = jp;
        linkPengumuman = lp;
        deskripsiPengumuman = dp;
    }

}
