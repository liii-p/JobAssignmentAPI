package JobAssignmentAPI.api.model;

public class Jobs {
    private final int id;
    private final String name;
    private final String startDate;
    private final String endDate;

    public Jobs(int id, String name, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

}
