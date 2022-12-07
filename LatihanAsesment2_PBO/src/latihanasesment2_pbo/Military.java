package latihanasesment2_pbo;

public class Military extends Aircraft implements Cargo {
    public String type;
    public String nation;

    public Military(String nation) {
        this.nation = nation;
    }

    public Military(String type, String nation) {
        this.type = type;
        this.nation = nation;
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