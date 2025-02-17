package Set;

import java.util.Objects;

public class Reparts {

    String name;

    public Reparts(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reparts reparts = (Reparts) o;
        return Objects.equals(name, reparts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Reparts{" +
                "name='" + name + '\'' +
                '}';
    }
}
