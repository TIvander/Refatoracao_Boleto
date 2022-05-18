public class Boleto {
    public int barCode;
    public String name;

    public Boleto(){

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
