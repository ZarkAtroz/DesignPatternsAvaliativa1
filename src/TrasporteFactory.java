/**
 * A Factory que centraliza a criação dos objetos de Transporte.
 * Esta classe aplica o padrão Factory Method. Ela desacopla o cliente
 * das classes concretas de transporte.
 */
class TransporteFactory {
    // Enum para representar os tipos de transporte de forma segura.
    public enum TipoTransporte {
        TERRESTRE,
        AEREO,
        MARITIMO
    }

    /**
     * O "Factory Method". Recebe um tipo e retorna a instância correspondente.
     * O cliente não precisa saber como instanciar `TransporteTerrestre`, etc.
     */
    public static Transporte criarTransporte(TipoTransporte tipo) {
        switch (tipo) {
            case TERRESTRE:
                return new TransporteTerrestre();
            case AEREO:
                return new TransporteAereo();
            case MARITIMO:
                return new TransporteMaritimo();
            default:
                throw new IllegalArgumentException("Tipo de transporte desconhecido.");
        }
    }
}