public class ContaLuz extends Boleto{
    public int barCode;
    public String name;

    public ContaLuz(int barCode, String name){
        this.barCode = barCode;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }
}
