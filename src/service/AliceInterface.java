package service;

import classes.Owners;

public interface AliceInterface {
    default void Sad(){
        System.out.println("   ");
    }

    void TryToImpressOwners(Owners[] p);

    void TurnAround();
}
