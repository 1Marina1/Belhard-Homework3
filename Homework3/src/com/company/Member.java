package com.company;

import java.util.Date;

public class Member extends Group {
    private static String memberName;
    private String position;
    private static int age;
    private String nationality;

    public Member(String groupName, int debutYear, Member[] members, String lastAlbumName) {
        super(groupName, debutYear, members, lastAlbumName);
    }

    public Member() {
        super();
    }


    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return memberName;
    }

    public void setName(String memberName) {
        this.memberName = memberName;
    }
    public void showTheActivityYears(){
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        int activity = currentYear -Member.debutYear;
        System.out.printf("The members debuted in %d", Member.debutYear);
        System.out.printf("\n%s has been active for %d years\n", Member.memberName, activity);
    }

//    public static void catchError(){ // I want to catch an exception when user enters string when int is expected
//        try {
//            if(member.setAge == String) throw new Exception("This age can't be true");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


}




