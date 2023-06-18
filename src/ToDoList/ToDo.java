package ToDoList;


public class ToDo {
    private int taskNumber;
    private String taskDay;
    private String taskName;
    private String priority;
    private String status;

    public ToDo(int taskNumber, String taskDay, String taskName, String priority, String status) {
        this.taskNumber = taskNumber;
        this.taskDay = taskDay;
        this.taskName = taskName;
        this.priority = priority;
        this.status = status;
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

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ToDo{" + "\n" +
                "TaskNumber = " + taskNumber + ";" + "\n" +
                "TaskDay = " + taskDay + ";" + "\n" +
                "TaskName = " + taskName + ";" + "\n" +
                "Priority = " + priority + ";" + "\n" +
                "Status = " + status + ";" + "\n" +
                '}';
    }
}
