package classes;

import service.AliceInterface;
import service.FeelingsEnum;

public class Alice extends People implements AliceInterface {
    private int Ruded;

    public Alice() {
        super();
        Ruded = 0;
    }

    public Alice(String name) {
        super(name);
        Ruded = 0;
    }

    public Alice(String name, FeelingsEnum Feel) {
        super(name, Feel);
        Ruded = 0;
    }

    public Alice(String name, FeelingsEnum Feel, int Ruded) {
        super(name, Feel);
        this.Ruded = Ruded;
    }

    @Override
    public void JoinToStory() {
        System.out.println("Алиса " + getName() + " прибыла для участия в истории.");
    }

    @Override
    public void ChangeFeeling(FeelingsEnum Feeling) {
        this.setFeel(Feeling);
        System.out.println("Алиса " + getName() + " теперь " + getFeelings().get());

    }

    public int getRuded() {
        return this.Ruded;
    }

    public void Ruding() {
        this.Ruded++;
    }

    @Override
    public void Sad() {
        System.out.println("Алиса, не говоря ни слова, встала и гордо удалилась.");
    }

    @Override
    public void TryToImpressOwners(Owners[] p) {
        String s = "";
        for (People x : p) {
            s += " " + x.getName();
        }
        System.out.println("Алиса " + getName() + " попробовала удивить хозяев" + s);
    }

    @Override
    public void TurnAround() {
        System.out.println("Алиса " + getName() + " обернулась посмотреть...");
        this.ChangeFeeling(FeelingsEnum.HOPEFUL);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return getName().length() * (int) Math.pow(2, 20) + getFeelings().get().length() * (int) Math.pow(2, 20) + this.Ruded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alice O = (Alice) o;
        return this.hashCode() == O.hashCode();
    }
}