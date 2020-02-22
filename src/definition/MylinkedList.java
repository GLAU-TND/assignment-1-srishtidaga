package definition;

public class MylinkedList {
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

