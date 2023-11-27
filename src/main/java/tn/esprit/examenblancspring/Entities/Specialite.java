package tn.esprit.examenblancspring.Entities;

public enum Specialite {
    Cardiologue("cardiologue") , Gynecologue("gynecologue") , Dermatologue("dermatologue");

    private String type;
    Specialite(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
