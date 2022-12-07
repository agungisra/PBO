package latihanasesment2_pbo;

public class Commercial extends Aircraft implements Cargo {
    public int pessengerSize;

    public Commercial(int pessengerSize) {
        this.pessengerSize = pessengerSize;
    }

    @Override
    public void fly() {
        
    }

    @Override
    public void landing() {
        
    }

    @Override
    public void shoot() {
        
    }

    @Override
    public int loadCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int unloadCargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}