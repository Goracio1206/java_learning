package Chapter4.Classes;

public class Cycle extends Car{

    private int diametr;
    private int tusk;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getTusk() {
        return tusk;
    }

    public void setTusk(int tusk) {
        this.tusk = tusk;
    }

    public Cycle(String model, String type, String color, int diametr, int tusk ) {
        super(model, type, color);
        this.diametr = diametr;
        this.tusk = tusk;
    }

    public Cycle() {}
    public Cycle(int diametr, int tusk) {
        this.diametr = diametr;
        this.tusk = tusk;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
            if(obj instanceof Cycle){
                Cycle temp = (Cycle) obj;
                return this.diametr == temp.diametr &&
                        this.tusk == temp.tusk;
            }else
                return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Diametr: " + this.diametr + "\n" + "Tusk is: " + this.tusk;
    }
}