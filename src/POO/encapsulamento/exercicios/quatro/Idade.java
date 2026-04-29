package POO.encapsulamento.exercicios.quatro;

public class Idade {
    private int anos;

    public void setAnos(int anos) {
        if (anos >= 0 && anos <= 150){
            this.anos = anos;
        } else {
            System.out.println("Erro! Idade inválida.");
        }
    }
}
