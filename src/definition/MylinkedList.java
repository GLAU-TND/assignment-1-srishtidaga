package definition;

import adt.ConcADT;

public class MylinkedList<E> implements ConcADT<E> {
    private Node head = null;
    private int size = 0;

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E getData(int index) {
        return null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;



        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;


        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

    }
    }

