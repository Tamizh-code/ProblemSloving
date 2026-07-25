package Bank;
class Customer {
    private String customerId;
    private String name;
    private String dob;
    private String aadhaar;
    private String mobile;
    private String email;
    private String address;
    private String customerType;
    protected Customer(String customerId, String name, String dob, String aadhaar, String mobile, String email, String address, String customerType) {
        this.customerId = customerId;
        this.name = name;
        this.dob = dob;
        this.aadhaar = aadhaar;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(String aadhaar) {
        this.aadhaar = aadhaar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
