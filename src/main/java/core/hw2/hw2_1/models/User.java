package core.hw2.hw2_1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

        private int id;
        private String name;
        private String username;
        private String email;

        private Address address;

        private String phone;
        private String website;

        private Company company;

}
