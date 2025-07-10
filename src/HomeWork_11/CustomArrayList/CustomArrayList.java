package HomeWork_11.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Конструктор без параметров
    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Конструктор с заданием размера
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    // Метод добавления элемента
    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Метод удаления элемента по индексу
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index regardless");
        }
        T removedElement = (T) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // Удаляем ссылку на удаленный элемент
        size--;
        return removedElement;
    }

    // Метод получения элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index regardless");
        }
        return (T) elements[index];
    }

    // Метод проверки наличия элемента в коллекции
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки коллекции
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    // Метод для автоматического расширения массива
    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Метод для получения текущего размера коллекции
    public int size() {
        return size;
    }

    // Метод для получения массива элементов
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }
}
