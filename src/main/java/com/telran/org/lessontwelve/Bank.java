package com.telran.org.lessontwelve;

public class Bank {

    private String account;

    public void setAccount(String account) {
        boolean validResult = isValidAccountNumber(account);
        if (validResult) {
            this.account = account;
        } else {
            System.out.println("Bank account is incorrect");
        }
    }

    public boolean isValidAccountNumber(String accountNumber) {
        //not null
        if (accountNumber == null) {
            return false;
        }
        //14 length digit
        if (accountNumber.length() != 14) {
            return false;
        }
        //14 digit
        for (int i = 0; i < accountNumber.length(); i++) {
            char temp = accountNumber.charAt(i);
            boolean isDigit = Character.isDigit(temp);
            if (!isDigit) {
                return false;
            }
        }

        //all digit is not 0
        int count = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            char temp = accountNumber.charAt(i);
            if (temp == '0') {
                count++;
            }
        }
        if (count == 14) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                '}';
    }
}
