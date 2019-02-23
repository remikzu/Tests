package UserPackage;

import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class User {

    String name;
    List<Resource> resources;
    Boolean logged = false;

    public User(String name, List<Resource> resources) {
        this.name = name;
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public boolean getLogged() {
        return logged;
    }

    public boolean setLogged() {
        return logged;
    }
}
