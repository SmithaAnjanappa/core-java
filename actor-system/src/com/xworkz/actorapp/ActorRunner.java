package com.xworkz.actorapp;

import com.xworkz.actorapp.actor.Actor;
import com.xworkz.actorapp.vishnuvardhan.VishnuVardhan;

public class ActorRunner {
    public static void main(String[] args) {
        Actor actor=new VishnuVardhan();
        actor.act();
    }
}
