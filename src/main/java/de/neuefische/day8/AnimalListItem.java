package de.neuefische.day8;

import java.util.Objects;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Animal getValue() {
        return value;
    }
}
