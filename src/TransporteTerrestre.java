/**
 * Implementação concreta para Transporte Terrestre.
 * As regras de negócio para o cálculo da tarifa terrestre ficam encapsuladas aqui.
 */
class TransporteTerrestre implements Transporte {
    private static final double TARIFA_BASE_POR_KM = 0.5;
    private static final double FATOR_PESO = 0.1;

    @Override
    public double calcularTarifa(double peso, double distancia) {
        System.out.println("Calculando tarifa para Transporte Terrestre...");
        return (distancia * TARIFA_BASE_POR_KM) + (peso * FATOR_PESO);
    }
}