package designpatterns.coffeepoweredcrew.solid.s;

import java.io.IOException;

//import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private UserPersistenceService persistenceService = new UserPersistenceService();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);

        if (!valid) return "ERROR";

        /**
        if(!isValidUser(user)) {
            return "ERROR";
        }
        */

        persistenceService.saveUser(user);

        return "SUCCESS";
    }

}