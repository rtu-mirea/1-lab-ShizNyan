package com.company;

public class Toy {
    String creator;
    int cost;
    int agestart;
    int ageend;

    public Toy(String creator1, int cost1, int agestart1, int ageend1){
        creator = creator1;
        cost = cost1;
        agestart = agestart1;
        ageend = ageend1;
    }

    public String getCreatorCost(int agest1, int ageend1){
        if (this.agestart == agest1 && this.ageend == ageend1){
            return this.creator+" "+this.cost;
        }
        return "";
    }

    public boolean compare(Toy T1){
        if(agestart == T1.agestart && ageend == T1.ageend){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "Производитель: " + creator+
                " Цена: " + cost +
                " От " + agestart +
                " лет до " + ageend;
    }
}
