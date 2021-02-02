package academy.belhard;

import entity.Person;
import entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Alexei", "Kuzmichev", "alexei.@mail.ru", "qwerty");
        System.out.println(user1.getFullInfo());
        System.out.println(user1.isPasswordCorrect("dsfgfdhgfd"));
    }
}
