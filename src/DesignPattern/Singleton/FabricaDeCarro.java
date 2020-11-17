package DesignPattern.Singleton;

public class FabricaDeCarro {
    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;

    public static FabricaDeCarro instancia;

    private FabricaDeCarro() {

    }

    public static FabricaDeCarro getInstancia(){
        if (instancia == null) {
            instancia = new FabricaDeCarro();
        }
        return instancia;
    }


    public String criarCarrosVolks(){
        return new String("Carro Volks #"+ totalCarrosVolks++ +" criado");
    }


    public String criarCarrosFord(){
        return new String("Carro Ford #"+ totalCarrosFord++ +" criado");
    }

    public String criarCarrosFiat(){
        return new String("Carro Fiat #"+ totalCarrosFiat++ +" criado");
    }

    public String gerarRelatorio(){
        return new String("Total de carros Fiat vendidos "+totalCarrosFiat
                +"\nTotal de carros Ford vendidos: "+totalCarrosFord
                +"\nTotal de carros Volks vendidos: "+totalCarrosVolks
        );
    }


}
