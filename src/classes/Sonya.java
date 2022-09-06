package classes;

import service.FeelingsEnum;

public class Sonya extends Owners {

    public Sonya() {
        super();
    }

    public Sonya(String name) {
        super(name);
    }

    public Sonya(String name, FeelingsEnum Feel) {
        super(name, Feel);
    }

    @Override
    public void JoinToStory() {
        System.out.println("Соня " + getName() + " прибыла для участия в истории.");
    }

    @Override
    public void ChangeFeeling(FeelingsEnum Feeling) {
        this.setFeel(Feeling);
        System.out.println("Соня " + getName() + " теперь " + getFeelings().get());
    }

    @Override
    public void DoSmthFun() {
        System.out.println("Соня " + getName() + " успешно покоится на дне чайника. Press F");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sonya S = (Sonya) o;
        return this.hashCode() == S.hashCode();
    }
}