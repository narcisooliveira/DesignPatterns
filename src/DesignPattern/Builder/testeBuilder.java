package DesignPattern.Builder;

public class testeBuilder {
    public static void main(String[] args) {

        ConcessionariaDirector concessionaria1 = new ConcessionariaDirector(new FiatBuilder());

        concessionaria1.construirCarro();
        CarroProduct carro = concessionaria1.getCarro();

        System.out.println("Carro: "+carro.modelo+"/"+carro.montadora+"\nAno: "+carro.anoDeFabricacao+
        "\nMotor: "+carro.dscMotor+"\nValor: "+carro.preco);

        System.out.println();

        ConcessionariaDirector concessionaria2 = new ConcessionariaDirector(new VolksBuilder());

        concessionaria2.construirCarro();
        CarroProduct carro2 = concessionaria2.getCarro();

        System.out.println("Carro: "+carro2.modelo+"/"+carro2.montadora+"\nAno: "+carro2.anoDeFabricacao+
                "\nMotor: "+carro2.dscMotor+"\nValor: "+carro2.preco);
    }
}
