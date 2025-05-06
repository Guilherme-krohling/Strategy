public class Disciplina {
    private String nome,situacao;
    private double p1,p2,media;


    public Disciplina(String nome, double p1, double p2, MediaStrategy estrategia) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.media = estrategia.calcularMedia(p1, p2);
        this.situacao = estrategia.verificarSituacao(media);
    }

    public void exibir(){
        System.out.println("Disciplina: "+nome);
        System.out.println("P1: " +p1);
        System.out.println("P2: "+p2);
        System.out.println("Media: "+media);
        System.out.println("Situacao: "+situacao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getMedia() {
        return media;
    }

    
}
