/**
 * Implementação concreta para Transporte Aéreo.
 */
class TransporteAereo implements Transporte {
    private static final double TARIFA_BASE_POR_KG = 5.0;
    private static final double TAXA_SEGURANCA = 50.0;

    @Override
    public double calcularTarifa(double peso, double distancia) {
        System.out.println("Calculando tarifa para Transporte Aéreo...");
        // Distância pode ter um impacto menor ou ser usada para voos internacionais, mas o peso é o principal.
        return (peso * TARIFA_BASE_POR_KG) + TAXA_SEGURANCA;
    }
}