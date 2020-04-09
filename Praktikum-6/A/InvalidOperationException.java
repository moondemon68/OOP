class InvalidOperationException extends Throwable {
    private String opType;
    private String description;
    public InvalidOperationException() {
        this.opType = "";
        this.description = "";
    }
    public InvalidOperationException(String opType, String description) {
        this.opType = opType;
        this.description = description;
    }
    public String getOpType() {
        return opType;
    }
    public String getDescription() {
        return description;
    }
}