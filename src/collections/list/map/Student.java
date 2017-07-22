package collections.list.map;

/**
 * Created by dorka on 17.07.2017.
 */
public class Student {
    private String name;
    private String surName;
    private long indexNo;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public long getIndexNo() {
        return indexNo;
    }

    public Student(String name, String surName, long indexNo) {
        this.name = name;
        this.surName = surName;
        this.indexNo = indexNo;
    }

}
