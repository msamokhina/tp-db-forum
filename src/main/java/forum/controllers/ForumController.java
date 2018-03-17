package forum.controllers;

import forum.models.Forum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {
    @RequestMapping("/forum")
    public Forum getForum() {
        Forum myForum = new Forum(
                1,
                "my forum"
        );
        return myForum;
    }
}
