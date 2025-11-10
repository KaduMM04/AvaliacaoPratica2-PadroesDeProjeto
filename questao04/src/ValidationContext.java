public class ValidationContext {
     private int failureCount = 0;
    private boolean rollbackNeeded = false;

    public void incrementFailure() {
        failureCount++;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public void resetFailures() {
        failureCount = 0;
    }

    public boolean isRollbackNeeded() {
        return rollbackNeeded;
    }

    public void setRollbackNeeded(boolean rollbackNeeded) {
        this.rollbackNeeded = rollbackNeeded;
    }
}
