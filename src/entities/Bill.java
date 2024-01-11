package entities;

import org.w3c.dom.ls.LSOutput;

public class Bill {
    private char gender;
    private Integer beer;
    private Integer barbecue;
    private Integer softDrink;

    public Bill() {

    }

    public Bill(char gender, Integer beer, Integer barbecue, Integer softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Integer getBeer() {
        return beer;
    }

    public void setBeer(Integer beer) {
        this.beer = beer;
    }

    public Integer getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(Integer barbecue) {
        this.barbecue = barbecue;
    }

    public Integer getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(Integer softDrink) {
        this.softDrink = softDrink;
    }

    public double feeding(){
        return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
    }
    public double ticket() {
        return (gender == 'F') ? 8.00 : 10.00;
    }
    public double cover(){
        return(feeding() > 30.00) ? 0.00 : 4.00;
    }
    public String coverResult() {
        if (cover() == 0.00){
            return "Isento de Couvert";
        }
        else {
            return "Couvert = R$ " + String.format("%.2f", cover());
        }
    }
    public double total(){
        return feeding()+ ticket() + cover();
    }

    public String toString(){
        return "Consumo = R$ " + String.format("%.2f", feeding()) +
                "\n" +
                coverResult() +
                "\n" +
                "Ingresso = R$ "+ String.format("%.2f", ticket()) +
                "\n" +
                "\n" +
                "Valor a pagar = R$ "+ String.format("%.2f", total());
    }


}
