import java.util.ArrayList;
import java.util.List;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }

    public void addFriend(int friendId) {
        if (!friends.contains(friendId)) {
            friends.add(friendId);
        }
    }

    public void removeFriend(int friendId) {
        friends.remove(Integer.valueOf(friendId));
    }

    public List<Integer> getFriends() {
        return friends;
    }
}

class SocialMedia {
    User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    public User searchByUserId(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public User searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }

    public List<Integer> findMutualFriends(int userId1, int userId2) {
        User user1 = searchByUserId(userId1);
        User user2 = searchByUserId(userId2);
        List<Integer> mutualFriends = new ArrayList<>();

        if (user1 != null && user2 != null) {
            for (Integer friendId1 : user1.getFriends()) {
                for (Integer friendId2 : user2.getFriends()) {
                    if (friendId1.equals(friendId2)) {
                        mutualFriends.add(friendId1);
                    }
                }
            }
        }
        return mutualFriends;
    }

    public void displayAllFriends(int userId) {
        User user = searchByUserId(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.getFriends());
        }
    }

    public void countNumberOfFriends(int userId) {
        User user = searchByUserId(userId);
        if (user != null) {
            System.out.println(user.name + " has " + user.getFriends().size() + " friends.");
        }
    }

    public void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 22);
        sm.addUser(4, "David", 27);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 4);

        sm.displayAllFriends(1);
        sm.displayAllFriends(2);

        System.out.println("Mutual friends between Alice and Bob: " + sm.findMutualFriends(1, 2));

        sm.removeFriendConnection(1, 3);
        sm.displayAllFriends(1);

        sm.countNumberOfFriends(1);
        sm.countNumberOfFriends(2);
        sm.countNumberOfFriends(3);

        sm.displayAllUsers();
    }
}

