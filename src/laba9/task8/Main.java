package laba9.task8;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Ввод с головы (цикл)
    public void createHead(int[] values) {
        for (int value : values) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    // Ввод с хвоста (цикл)
    public void createTail(int[] values) {
        if (values.length == 0) return;
        head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
    }

    // Вывод списка (цикл)
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    // Добавление элемента в начало
    public void AddFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Добавление элемента в конец
    public void AddLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Вставка элемента с указанным номером
    public void Insert(int index, int value) {
        if (index == 0) {
            AddFirst(value);
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) return;
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление элемента с головы
    public void RemoveFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Удаление последнего элемента
    public void RemoveLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Удаление элемента с указанным номером
    public void Remove(int index) {
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) return;
        current.next = current.next.next;
    }

    // Ввод с головы (рекурсия)
    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index == values.length) return null;
        Node newNode = new Node(values[index]);
        newNode.next = createHeadRecHelper(values, index + 1);
        return newNode;
    }

    // Ввод с хвоста (рекурсия)
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index == values.length) return null;
        Node newNode = new Node(values[index]);
        newNode.next = createTailRecHelper(values, index + 1);
        return newNode;
    }

    // Вывод списка (рекурсия)
    public String toStringRec() {
        return StringRecHelper(head).trim();
    }

    private String StringRecHelper(Node node) {
        if (node == null) return "";
        return node.value + " " + StringRecHelper(node.next);
    }
}
