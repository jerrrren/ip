import java.time.LocalDate;

public class Deadline extends Task {
    public Deadline(String description) {
        super(description);

    }

    public Deadline(String description, LocalDate deadline) {
        super(description, deadline);

    }

    @Override
    public String toString() {
        return "[D]" + super.toString();
    }
}
