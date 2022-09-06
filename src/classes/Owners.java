package classes;

import service.FeelingsEnum;
import service.OwnersInterface;

public class Owners extends People implements OwnersInterface {

    public Owners() {
        super();
    }

    public Owners(String name) {
        super(name);
    }

    public Owners(String name, FeelingsEnum Feel) {
        super(name, Feel);
    }

    @Override
    public void ChangeFeeling(FeelingsEnum Feeling) {
        this.setFeel(Feeling);
        System.out.println("Хозяин " + getName() + " теперь " + getFeelings().get());
    }

    @Override
    public void JoinToStory() {
        System.out.println("Хозяин " + getName() + " прибыл для участия в истории.");
    }

    @Override
    public void RudeToAlice(Alice A) {
        A.Ruding();
        int rururu = A.getRuded();
        if (rururu < 5) {
            System.out.println("Вы нагрубили Алисе. Текущий уровень огрубленности составляет " + rururu);
        } else {
            System.out.println("Вы забуллили Алису");
            A.ChangeFeeling(FeelingsEnum.OUTRAGED);
            System.out.println("Алиса возмущена до предела (степень опасности " + rururu + "). Бегите, глупцы!");
            A.Sad();
        }
    }

    @Override
    public void DoSmthFun() {
        System.out.println(getName() + " Агрессивно засовывает Соню в чайник");
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return getName().length() * (int) Math.pow(2, 10) + getFeelings().get().length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owners O = (Owners) o;
        return this.hashCode() == O.hashCode();
    }
}