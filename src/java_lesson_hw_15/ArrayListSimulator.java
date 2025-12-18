package java_lesson_hw_15;

import java.util.Arrays;
/*
   Задача *:
   Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
   работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
   основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
   классов(т.е. это generic).
   Предусмотреть операции(методы):
    1. добавления элемента
    2. удаления элемента
    3. получение элемента по индексу
    4. проверка есть ли элемент в коллекции
    5. очистка всей коллекции
   Предусмотреть конструктор без параметров - создает массив размером
   по умолчанию.
    Предусмотреть конструктор с задаваемым размером внутреннего
   массива.
    Предусмотреть возможность автоматического расширения коллекции при
   добавлении элемента в том случае, когда коллекция уже заполнена.*/
public class ArrayListSimulator <T>{
    private T[] elements;
    private static final int defaultCapacity = 10;
    private int size;

    public ArrayListSimulator(){
        this.elements = (T[]) new Object[defaultCapacity];
    }
    public ArrayListSimulator(int capacity){
        if (capacity > 0){
            this.elements = (T[]) new Object[capacity];
        }
        else {throw new IllegalStateException("Capacity has to be more than 0!");}
    }
    public int size (){
        return size;
    }
    public T getElement(int index) {
        indexExist(index);
       return this.elements[index];
    }
    public int indexExist(int index){
        if(index<0||index>=this.size){
            throw new IndexOutOfBoundsException("INDEX ISN'T CORRECT!");
        }
        return index;
    }
    public boolean add(T element) {
        if(size == elements.length){
            this.elements = increaseCapacity();
        }
        this.elements[size] = element;
        size++;
        return true;
    }
    private T[] increaseCapacity(){
        T[] newElementArray = (T[]) new Object[(int)(elements.length*1.3)];
        System.arraycopy(this.elements,0,newElementArray,0,elements.length);
        return newElementArray;
    }
    public boolean deleteElement(T element) {
        for (int index = 0; index< size; index++){
            if(elements[index].equals(element)){
                int numMoved = size - index - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, index + 1, elements, index, numMoved);
                    size--;
                }else if(numMoved == 0) {
                    size--;
                    elements[size] = null;}
                return true; }
        }
    return false;}
    public void clear() {
        for (T el : this.elements){el = null;}
        size=0;
    }
    public boolean isExist (T element) {
        for (T el : this.elements){
            if(el.equals(element)){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        T [] temporaryArr = (T[])new Object[size];
        System.arraycopy(this.elements, 0, temporaryArr, 0, size);
        return Arrays.toString(temporaryArr);
    }

}
