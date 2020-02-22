package definition;

import adt.ConcADT;

public class MylinkedList<E> implements ConcADT<E> {
    private Node head = null;
    private int size = 0;

    private void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    private void addAfter(E item, Node<E> afternode) {
        afternode.next = new Node<>(item, afternode.next);
        size++;

    }

    public void add(E item, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);
        } else {
            addAfter(item, getNode(index - 1));
        }
    }

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
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

