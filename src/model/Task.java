import java.time.LocalDate;

class Task {
    public int taskId;
    private String taskDescription;
    private Status taskStatus;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public void setCreatedTaskAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedTaskAt(LocalDate updatedAt) {
        this.updateAt = updatedAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }
}