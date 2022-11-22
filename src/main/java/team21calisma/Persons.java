package team21calisma;

public class Persons {
    public String idNo;
    public String name;
    public String adress;
    public String telNo;

    public Persons(String name, String adress, String telNo) {
        this.name = name;
        this.adress = adress;
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "isim='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';


    }

}
