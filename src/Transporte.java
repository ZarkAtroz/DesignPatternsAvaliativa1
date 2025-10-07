/**
 * Interface comum para todos os tipos de transporte.
 * Define o contrato para o cálculo de tarifas, permitindo o polimorfismo.
 */
interface Transporte {
    double calcularTarifa(double peso, double distancia);
}