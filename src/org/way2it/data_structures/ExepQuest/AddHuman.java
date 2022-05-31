package org.way2it.data_structures.ExepQuest;

import java.util.ArrayList;

public class AddHuman {

    private final ArrayList<Human> questDb = new ArrayList<Human>();

    public AddHuman() {

    }

    public void setQuestDb(Human human) {
        this.questDb.add(human);
    }

    @Override
    public String toString() {
        String sdbQuest = "";
        for(int i = 0; i < questDb.size(); i++) {
            sdbQuest = sdbQuest + " Name - " + questDb.get(i).getName() + ", age - " + questDb.get(i).getAge() + ", email - " + questDb.get(i).getEmail() + "\n";

        }
        return sdbQuest;
    }
}
