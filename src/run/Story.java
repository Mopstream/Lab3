package run;

import classes.Alice;
import classes.Owners;
import classes.People;
import classes.Sonya;
import service.AliceInterface;
import service.FeelingsEnum;

public class Story {
    public static void main(String[] args) {
        Alice A = new Alice("Из Яндекса", FeelingsEnum.NoneFeelings, 0);
        Owners O1 = new Owners("Барин", FeelingsEnum.NoneFeelings);
        Owners O2 = new Owners("Барыня", FeelingsEnum.NoneFeelings);
        Sonya S = new Sonya("Солнышко");
        A.JoinToStory();
        O1.JoinToStory();
        O2.JoinToStory();
        S.JoinToStory();
        for (int i = 0; i < 5; ++i) {
            System.out.println("Буллим Алису " + A.getName() + " ...");
            O1.RudeToAlice(A);
        }
        A.TryToImpressOwners(new Owners[]{O1, O2, S});
        S.ChangeFeeling(FeelingsEnum.SLEEPING);
        O1.ChangeFeeling(FeelingsEnum.NoneFeelings);
        O2.ChangeFeeling(FeelingsEnum.NoneFeelings);
        for (int i = 0; i < 3; ++i) {
            A.TurnAround();
        }
        O1.DoSmthFun();
        O2.DoSmthFun();
        S.DoSmthFun();
    }
}
