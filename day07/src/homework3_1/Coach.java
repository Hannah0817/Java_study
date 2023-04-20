package homework3_1;

public  abstract  class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int year) {
        super(name, year);
    }

    public abstract void trainting();

}
