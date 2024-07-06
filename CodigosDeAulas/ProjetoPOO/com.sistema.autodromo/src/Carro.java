public class Carro extends Automovel{
    //Metodos
    @Override
    public void ligar (){
//        Antes de ligar, conferir os metodos
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo Cambio em P ou N");
    }


}
