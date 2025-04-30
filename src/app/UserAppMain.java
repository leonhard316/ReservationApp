package app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserAppMain {
    public static void main(String[] args){

    }
    // ユーザー情報
    class UserData{
        private String name; // 名前
        private String[] sex; // 性別 "M"または"F"
        private Date birthDate; // 生年月日 
        private int age; // 年齢
        private String MedicalHistory; // 既往歴
        private String address;
    }
}
