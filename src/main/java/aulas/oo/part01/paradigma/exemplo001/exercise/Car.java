package aulas.oo.part01.paradigma.exemplo001.exercise;

public class Car {
    private Integer quantidadePessoas = 1;
    private Integer maxCapability;

    public Integer getAmount() { return quantidadePessoas; }

    public String incAmount() {
        if( getAmount() < maxCapability) {
            ++quantidadePessoas;
            return "Pessoas no carro: " + getAmount();
        } else {
            return "O carro está cheio.";
        }

    }

    public String decAmount() {
        if( getAmount() > maxCapability) {
            --quantidadePessoas;
            return "Pessoas no carro: " + getAmount();
        } else {
            return "Você precisa de pelo menos uma pessoa para dirigir.";
        }

    }

    public void setCapability(int capability) {this.maxCapability = capability;}

}
