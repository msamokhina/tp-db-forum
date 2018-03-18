package forum.controllers;

import forum.models.Forum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {
    @RequestMapping("/forums")
    public Forum[] getForums() {
        Forum[] myForums = new Forum[2];
        for(int i = 0; i < 2; i++) {
            myForums[i] = new Forum(
                    "" + i,
                    "my forum " + i);
        }
        return myForums;
    }

    @RequestMapping("/forums/{forumId}")
    public Forum getForumById(@PathVariable("forumId") String id) {
        Forum myForum = new Forum(
                id,
                "my forum"
        );
        return myForum;
    }
}
