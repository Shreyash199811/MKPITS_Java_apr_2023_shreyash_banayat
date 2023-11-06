package com.example.bankapplicationusebean;

public class Bank {
    private String userID;
    private String user_password;
    private String userName;
    private String userAddress;
    private  String userCity;
    private String accountBalance;
    private String approveStatus;
    private  String registeredOn;
    private String approvedBy;
    private String approvedOn;

//    --------------------Default Constructor--------------------
    public Bank(){
    }


//    --------------------getter--------------------

    public String getUserID() {
        return userID;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public String getRegisteredOn() {
        return registeredOn;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public String getApprovedOn() {
        return approvedOn;
    }

//    --------------------setter--------------------


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public void setApprovedOn(String approvedOn) {
        this.approvedOn = approvedOn;
    }


}
