// Questão 1: Código
public class Main {
    public static void main(String[] args) {
        // O cliente solicita a criação de um transporte através da factory.
        Transporte meuTransporteTerrestre = TransporteFactory.criarTransporte(TransporteFactory.TipoTransporte.TERRESTRE);
        double tarifa1 = meuTransporteTerrestre.calcularTarifa(100, 500); // 100kg, 500km
        System.out.println("Tarifa final: R$ " + tarifa1);

        System.out.println("---");

        Transporte meuTransporteAereo = TransporteFactory.criarTransporte(TransporteFactory.TipoTransporte.AEREO);
        double tarifa2 = meuTransporteAereo.calcularTarifa(50, 2000); // 50kg, 2000km
        System.out.println("Tarifa final: R$ " + tarifa2);
    }
}