class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    Item head;

    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    public void removeByItemId(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantityByItemId(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public Item searchByItemId(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Item searchByItemName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    public void sortByItemName(boolean ascending) {
        if (head == null) return;
        head = mergeSortByItemName(head, ascending);
    }

    private Item mergeSortByItemName(Item node, boolean ascending) {
        if (node == null || node.next == null) {
            return node;
        }
        Item middle = getMiddle(node);
        Item nextToMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByItemName(node, ascending);
        Item right = mergeSortByItemName(nextToMiddle, ascending);

        return mergeByItemName(left, right, ascending);
    }

    private Item mergeByItemName(Item left, Item right, boolean ascending) {
        Item result = null;
        if (left == null) return right;
        if (right == null) return left;

        if (ascending) {
            if (left.itemName.compareTo(right.itemName) <= 0) {
                result = left;
                result.next = mergeByItemName(left.next, right, ascending);
            } else {
                result = right;
                result.next = mergeByItemName(left, right.next, ascending);
            }
        } else {
            if (left.itemName.compareTo(right.itemName) >= 0) {
                result = left;
                result.next = mergeByItemName(left.next, right, ascending);
            } else {
                result = right;
                result.next = mergeByItemName(left, right.next, ascending);
            }
        }
        return result;
    }

    private Item getMiddle(Item node) {
        if (node == null) return node;
        Item fast = node.next;
        Item slow = node;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public void sortByPrice(boolean ascending) {
        if (head == null) return;
        head = mergeSortByPrice(head, ascending);
    }

    private Item mergeSortByPrice(Item node, boolean ascending) {
        if (node == null || node.next == null) {
            return node;
        }
        Item middle = getMiddle(node);
        Item nextToMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByPrice(node, ascending);
        Item right = mergeSortByPrice(nextToMiddle, ascending);

        return mergeByPrice(left, right, ascending);
    }

    private Item mergeByPrice(Item left, Item right, boolean ascending) {
        Item result = null;
        if (left == null) return right;
        if (right == null) return left;

        if (ascending) {
            if (left.price <= right.price) {
                result = left;
                result.next = mergeByPrice(left.next, right, ascending);
            } else {
                result = right;
                result.next = mergeByPrice(left, right.next, ascending);
            }
        } else {
            if (left.price >= right.price) {
                result = left;
                result.next = mergeByPrice(left.next, right, ascending);
            } else {
                result = right;
                result.next = mergeByPrice(left, right.next, ascending);
            }
        }
        return result;
    }

    public void displayAllItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", Item ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        inventory.addAtEnd("Laptop", 101, 10, 1000.0);
        inventory.addAtEnd("Phone", 102, 20, 500.0);
        inventory.addAtBeginning("Tablet", 103, 15, 300.0);
        inventory.addAtPosition("Headphones", 104, 25, 50.0, 2);
        inventory.displayAllItems();
        System.out.println("Total Value: " + inventory.calculateTotalValue());
        inventory.updateQuantityByItemId(102, 30);
        inventory.displayAllItems();
        inventory.removeByItemId(103);
        inventory.displayAllItems();
        inventory.sortByItemName(true);
        System.out.println("Sorted by Name (Ascending):");
        inventory.displayAllItems();
        inventory.sortByPrice(false);
        System.out.println("Sorted by Price (Descending):");
        inventory.displayAllItems();
    }
}

