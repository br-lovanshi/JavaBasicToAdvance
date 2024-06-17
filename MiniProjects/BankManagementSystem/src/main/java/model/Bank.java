package model;

public class Bank {

    private long id;
    private String name;
    private String branchName;
    private String ifcCode;
    private String address;

    public Bank() {
    }

    public Bank(long id, String name, String branchName, String ifcCode, String address) {
        this.id = id;
        this.name = name;
        this.branchName = branchName;
        this.ifcCode = ifcCode;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfcCode() {
        return ifcCode;
    }

    public void setIfcCode(String ifcCode) {
        this.ifcCode = ifcCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
