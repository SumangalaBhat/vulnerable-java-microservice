@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAll() {
        return users;
    }

    @PostMapping
    public User add(@RequestBody User user) {
        users.add(user);
        return user;
    }
}