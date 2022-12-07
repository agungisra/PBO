package latihanasesment2_pbo;

public abstract class Aircraft {
    protected String name;
    protected String engineType;
    protected int engineCount;
    
    //method abstract
    public abstract void fly();
    public abstract void landing();
    
    //method biasa
    public void shoot(){
    
    }
}