package de.neuefische.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListItemTest {

    @Test
    void shouldBeEmptyList() {
        AnimalList xs = new AnimalList();
        assertEquals("", xs.toString());
    }

    @Test
    void shouldContainFourElements() {
        AnimalList xs = new AnimalList();
        Animal a1 = new Animal("dog");
        Animal a2 = new Animal("cat");
        Animal a3 = new Animal("mouse");
        Animal a4 = new Animal("snake");

        xs.add(a1);
        xs.add(a2);
        xs.add(a3);
        xs.add(a4);

        assertEquals("dog->cat->mouse->snake", xs.toString());
    }

    @Test
    void shouldContainOneElements() {
        AnimalList xs = new AnimalList();
        Animal a1 = new Animal("dog");

        xs.add(a1);
        assertEquals("dog", xs.toString());
    }

    @Test
    void shouldRemoveTheMouseElement() {
        AnimalList xs = new AnimalList();
        Animal a1 = new Animal("dog");
        Animal a2 = new Animal("cat");
        Animal a3 = new Animal("mouse");
        Animal a4 = new Animal("snake");

        xs.add(a1);
        xs.add(a2);
        xs.add(a3);
        xs.add(a4);

    }
}