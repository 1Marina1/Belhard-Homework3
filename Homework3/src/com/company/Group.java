package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Group implements GroupName {
    protected static String groupName;
    protected static int debutYear;
    private static Member[] members;
    private String lastAlbumName;

    public Group(String groupName, int debutYear, Member[] members, String lastAlbumName){
        Group.groupName = groupName;
        this.debutYear = debutYear;
        Group.members = members;
        this.lastAlbumName = lastAlbumName;

    }

    public Group() {

    }
    public String getGroupName() {
    return groupName;
}


    public void showAllMembers(){
        for (Member member:members) {
            System.out.println("Imya chela:               " + member.getName());
            System.out.println("Positsiya chela v gruppe: " + member.getPosition());
            System.out.println("Natsionalnost chela:      " + member.getNationality());
            System.out.println("Vozrast chela:            " + member.getAge() + "\n");
        }
    }

    public static void arrayFill() {
        Scanner scanner = new Scanner(System.in);
        for (Member member: members) {
            System.out.println("Enter name");
            member.setName(scanner.nextLine());
            System.out.println("Enter position");
            member.setPosition(scanner.nextLine());
            System.out.println("Enter nationality");
            member.setNationality(scanner.nextLine());
            System.out.println("Enter age");
            member.setAge(scanner.nextInt());
            scanner.nextLine();
        }

        scanner.close();
    }
}


