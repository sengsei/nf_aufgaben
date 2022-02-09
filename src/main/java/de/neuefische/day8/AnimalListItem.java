package de.neuefische.day8;

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
}
