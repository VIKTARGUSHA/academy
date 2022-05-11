package by.academy.LinkedList;

    public class LinkedList<T> {
        private int size = 0;
        Node<T> first;
        Node<T> last;


        public Node<T> get(int index){
            if(index >= size || index < 0){
                System.out.println("\n" + "Index is out of bounds");
            }
            Node<T> node = first;
            int indexI = 0;

            while (indexI < index) {
                node = node.next;
                indexI++;
            }

            return node;
        }

        public void add(T item){
            Node<T> nodeAdd = new Node<>(item);
            if(first == null){
                last = nodeAdd;
                first = nodeAdd;
            } else {
                nodeAdd.next = null;
                nodeAdd.prev = last;
                last.next = nodeAdd;
                last = nodeAdd;
            }
            size++;
        }

        public void add( int index ,T item) {

            Node<T> nodeWithThisItem = new Node<>(item);
            if (index < 0 || index > size) {
                System.out.println("Index out of bounds");
            }
            else if (index == size) {
                add(item);

            }
            else if (index == 0){
                nodeWithThisItem.prev = null;
                nodeWithThisItem.next = first;
                first.prev = nodeWithThisItem;
                first = nodeWithThisItem;
                size++;
            }
            else {
                Node <T> nodeForReplace = get(index);
                nodeWithThisItem.next = nodeForReplace;
                nodeWithThisItem.prev = nodeForReplace.prev;
                nodeForReplace.prev.next = nodeWithThisItem;
                nodeForReplace.prev = nodeWithThisItem;
                size++;
            }
        }

        public void print(){
            Node<T> node = first;
            for (int i = 0; i < size; i++){
                System.out.print(node.item + " ");
                node = node.next;
            }
        }

        public void remove(int index) {

            if (index >= size || index < 0) {
                System.out.println("Index is out of bounds");
            } else if (index == size - 1) {
                last.prev.next = null;
                last = last.prev;
                size--;
            } else if (index > 0) {
                Node<T> node = get(index);
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
            }
            else {
                first.next.prev = null;
                first = first.next;
                size--;
            }
        }

        public class Node <T>{
            public T item;
            public Node<T> prev;
            public Node<T> next;
            public Node(T item, Node<T> prev, Node<T> next){
                this.item = item;
                this.prev = prev;
                this.next = next;
            }
            public Node (T item){
                this.item = item;
            }

            @Override
            public String toString() {
                return String.valueOf(item);
            }
        }

        public int size() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
