public class Main {
    public static void main(String[] args) {
        MediaStrategy estrategia = new Geometrica();      // troque por new Geometrica()
        Disciplina d = new Disciplina("ADS", 2, 2, estrategia);
        d.exibir();
        // System.err.println("------------------------");
        // d.setNome("Padrões de Desenvolvimento");
        // d.setP1(10);
        // d.setP2(5);
        // //d.calcularMedia();
        // d.exibir();
        System.err.println("------------------------");

        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}
