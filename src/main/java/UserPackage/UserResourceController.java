package UserPackage;

import java.util.Map;

/**
 * @author Remigiusz Zudzin
 */
public class UserResourceController {

    private Map<User, String> passwordsMap;

    public UserResourceController(Map<User, String> passwordsMap) {
        this.passwordsMap = passwordsMap;
    }

    public boolean login(User user, String inputPassword) {
        if(passwordsMap.containsKey(user)) {
            if(passwordsMap.get(user).equals(inputPassword)) {
                user.getLogged();
                return true;
            }
        }
        return false;
    }

    public boolean hasAccess(User user, Resource resource) {
        boolean hasAccess = false;
        if (!user.getLogged()) {
            if (user.getResources().contains(resource)) {
                hasAccess = true;
            }
        }
        return false;
    }
}
