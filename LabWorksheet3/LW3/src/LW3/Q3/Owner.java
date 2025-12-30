package LW3.Q3;
class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        ownerName = "Unknown";
        phoneNo = "Not Available";
    }

    public Owner(String name, String phone) {
        ownerName = name;
        phoneNo = phone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phone) {
        phoneNo = phone;
    }
}
