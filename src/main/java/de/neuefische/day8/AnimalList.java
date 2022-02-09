package de.neuefische.day8;

import java.util.LinkedList;
import java.util.List;

public class AnimalList {
    private AnimalListItem head;

    public void add(Animal animal){
        if(head==null){
            head = new AnimalListItem(animal);
        } else {
            nextElement(head).setNext(new AnimalListItem(animal));
        }
    }

    //TODO
    public void remove(Animal animal){
        if (head == null){
            return;
        }

        while(head != null && head.getValue().equals(animal)) {
            head = head.getNext();
        }



    }

    private AnimalListItem nextElement(AnimalListItem animalListItem){
        if (animalListItem.getNext() == null) {
            return animalListItem;
        } else {
            return nextElement(animalListItem.getNext());
        }
    }

    @Override
    public String toString() {
        if (head == null){
            return "";
        }

        AnimalListItem animalListItem = head;
        StringBuilder s = new StringBuilder();
        while( animalListItem != null){
            s.append(animalListItem).append("->");
            animalListItem = animalListItem.getNext();
        }
        if (s.toString().endsWith("->")) {
            s = new StringBuilder(s.substring(0, s.length() - 2));
        }
        return s.toString();
    }
}
