public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
//        jeep.confereCombustivel();
//        jeep.confereCambio();
        jeep.ligar();
        jeep.setChassi("856985");

        Moto kawasaki = new Moto();
        kawasaki.ligar();
        kawasaki.setChassi("955353");
    }
}
