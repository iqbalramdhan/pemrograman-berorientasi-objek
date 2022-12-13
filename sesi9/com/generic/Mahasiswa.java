package com.generic;
class Mahasiswa<N, NA, CL>{
    private N nim;
    private NA name;
    private CL clas;
    
    public void setNim(N nim){
        this.nim = nim;
    }
    
    public void setName(NA name){
        this.name = name;
    }
    
    public void setClas(CL clas){
        this.clas = clas;
    }
    
    public N getNim(){
        return nim;
    }
    
    public NA getName(){
        return name;
    }
    
    public CL getClas(){
        return clas;
    }
}