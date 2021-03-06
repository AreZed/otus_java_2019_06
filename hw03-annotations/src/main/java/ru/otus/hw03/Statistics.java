package ru.otus.hw03;

public class Statistics {

    private int assertsSuccess = 0;
    private int assertsFailed  = 0;
    private int assertsAll     = 0;

    public int getAssertsSuccess() {
        return assertsSuccess;
    }

    public int getAssertsFailed() {
        return assertsFailed;
    }

    public int getAssertsAll() {
        return assertsAll;
    }

    void incSuccess() {
        this.assertsSuccess++;
    }

    void incFailed() {
        this.assertsFailed++;
    }

    void incAll() {
        this.assertsAll++;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "assertsSuccess=" + assertsSuccess +
                ", assertsFailed=" + assertsFailed +
                ", assertsAll=" + assertsAll +
                '}';
    }
}
