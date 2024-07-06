public abstract class Automovel {
    private String chassi;
    public abstract void ligar();
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
