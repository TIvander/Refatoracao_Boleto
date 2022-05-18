public class ContaLuzRefatorado {
    public Boleto boleto = new Boleto();

    public ContaLuzRefatorado(int barCode, String name){
        this.setBarCode(barCode);
        this.setName(name);
    }

    public String getName() {
        return this.boleto.name;
    }

    public int getBarCode() {
        return this.boleto.barCode;
    }

    public void setName(String name) {
        this.boleto.name = name;
    }

    public void setBarCode(int barCode) {
        this.boleto.barCode = barCode;
    }
}
