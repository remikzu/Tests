import UserPackage.Resource;
import UserPackage.User;
import UserPackage.UserResourceController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Remigiusz Zudzin
 */
class UserResourceControllerTest {


    Map<User, String> passwordsMap = new HashMap<>();
    User user = new User("Remigiusz", new LinkedList<>());

    @BeforeAll
    void populatePasswdMap() {
        passwordsMap.put(user, "123");
    }
    UserResourceController controller = new UserResourceController(passwordsMap);

    @AfterEach
    void logout() {
        user.setLogged(false);
    }

    @Test
    void testLogin() {
        User user = new User("Remik", new LinkedList<>());
        passwordsMap.put(user, "123");
        UserResourceController controller = new UserResourceController(passwordsMap);
        String inputPassword = "123";
        String wrongPassword = "312";
        Assertions.assertTrue(controller.login(user, inputPassword));
        Assertions.assertFalse(controller.login(user, wrongPassword));
        Assertions.assertFalse(controller.login(new User("testowy", new LinkedList<>()), "123"));
        Assertions.assertEquals(true, user.getLogged(true));
    }

    @Test
    void resourcesAccessTest() {
        Resource resource = new Resource("zasoby1");
        user.getResources().add(resource);
        Assertions.assertTrue(controller.hasAccess(user, resource));

    }

}