package classes;

import service.FeelingsEnum;

public abstract class People {
    private String name;
    private FeelingsEnum Feel;

    public People() {
        this.name = "";
        this.Feel = FeelingsEnum.NoneFeelings;
    }

    public People(String name) {
        this.name = name;
        this.Feel = FeelingsEnum.NoneFeelings;
    }

    public People(String name, FeelingsEnum Feel) {
        this.name = name;
        this.Feel = Feel;
    }

    public String getName() {
        return name;
    }

    public FeelingsEnum getFeelings() {
        return Feel;
    }

    public void setFeel(FeelingsEnum Feel){
        this.Feel = Feel;
    }

    public abstract void ChangeFeeling(FeelingsEnum Feeling);

    public abstract void JoinToStory();
}
