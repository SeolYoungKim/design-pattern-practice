package _07_composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public void move() {
        components.forEach(Component::move);
    }
}
