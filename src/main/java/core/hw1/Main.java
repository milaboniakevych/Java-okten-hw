package core.hw1;

import core.hw1.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Marks", 5, "bulldog"));
        dogs.add(new Dog("Bob", 3, "terrier"));
        dogs.add(new Dog("Miley", 7, "beagle"));
        dogs.add(new Dog("Beam", 1, "bulldog"));
        dogs.add(new Dog("Jack", 10, "spaniel"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Subaru", 230, 1.8, "no"));
        cars.add(new Car("Toyota", 250, 2.0, "yes"));
        cars.add(new Car("BMW", 300, 3.0, "yes"));
        cars.add(new Car("Honda", 220, 1.5, "no"));
        cars.add(new Car("Mercedes", 280, 2.5, "yes"));

        for (Car car : cars) {
            System.out.println(car);
        }

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", 310, List.of("J.R.R. Tolkien"), "Fantasy"));
        books.add(new Book("1984", 328, List.of("George Orwell"), "Dystopian"));
        books.add(new Book("To Kill a Mockingbird", 281, List.of("Harper Lee"), "Fiction"));
        books.add(new Book("The Great Gatsby", 180, List.of("F. Scott Fitzgerald"), "Classic"));
        books.add(new Book("Moby-Dick", 635, List.of("Herman Melville"), "Adventure"));

        for (Book book : books) {
            System.out.println(book);
        }

        List <User> users = new ArrayList<>();
        users.add(new User(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        users.add(new User(2, 2, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        users.add(new User(3, 3, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        users.add(new User(4, 4, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));
        users.add(new User(5, 5, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"));

        for (User user : users) {
            System.out.println(user);
        }

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        posts.add(new Post(2, 2, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        posts.add(new Post(3, 3, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        posts.add(new Post(4, 4, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));
        posts.add(new Post(5, 5, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"));

        for (Post post : posts) {
            System.out.println(post);
        }


    }
}
