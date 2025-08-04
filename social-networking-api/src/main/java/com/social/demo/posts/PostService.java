package com.social.demo.posts;

import com.social.demo.locations.Location;
import com.social.demo.users.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> getAllPosts() {
        Location location = new Location("Some City", "Some Country");
        User user = new User("2", "Jane", "Doe", location, "jane.doe@example.com");

        Post post = new Post("835", "02-09-22", user, "#Admission");

        return Arrays.asList(post);
    }
}
