package ToDoList;


public class ToDo {
    private int taskNumber;
    private String taskDay;
    private String taskName;
    private String priority;
    private boolean status;

    public ToDo(int taskNumber, String taskDay, String taskName, String priority, boolean status) {
        this.taskNumber = taskNumber;
        this.taskDay = taskDay;
        this.taskName = taskName;
        this.priority = priority;
        this.status = status;
    }

    public ToDo(int taskNumber, String taskDay, String taskName, String priority) {
        this.taskNumber = taskNumber;
        this.taskDay = taskDay;
        this.taskName = taskName;
        this.priority = priority;
    }

    public ToDo() {
    }


    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTaskDay() {
        return taskDay;
    }

    public void setTaskDay(String taskDay) {
        this.taskDay = taskDay;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
