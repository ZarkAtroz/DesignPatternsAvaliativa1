/**
 * Implementação concreta para Transporte Marítimo.
 */
class TransporteMaritimo implements Transporte {
    private static final double TARIFA_CONTAINER = 1000.0;
    private static final double FATOR_DISTANCIA_MILHAS = 0.2;

    @Override
    public double calcularTarifa(double peso, double distancia) {
        System.out.println("Calculando tarifa para Transporte Marítimo...");
        // O cálculo pode ser baseado em containers, peso volumétrico, etc.
        // Aqui, simplificamos com uma taxa base mais um fator de distância.
        return TARIFA_CONTAINER + (distancia * FATOR_DISTANCIA_MILHAS);
    }
}