package com.social.demo.users;

import com.social.demo.locations.Location;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        Location location = new Location("Some City", "Some Country");

        return Arrays.asList(
            new User("1", "John", "Doe", location, "john.doe@example.com"),
            new User("2", "Jane", "Doe", location, "jane.doe@example.com")
        );
    }
}
