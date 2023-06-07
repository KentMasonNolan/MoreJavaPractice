package Exam_PracW6;

public enum Words {
    FOX, QUICK, LAZY, BROWN, CAT, NONKEYWORD;

    private int count;

    Words() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void incCount() {
        this.count = this.count+1;
    }
}
