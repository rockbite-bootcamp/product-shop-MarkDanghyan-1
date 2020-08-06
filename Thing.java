import java.util.Objects;

public class Thing {
    int id;
    String name;
    String description;

    public Thing(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return id == thing.id &&
                Objects.equals(name, thing.name) &&
                Objects.equals(description, thing.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}
