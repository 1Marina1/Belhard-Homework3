package com.company;

import java.util.Scanner;

import static com.company.Group.arrayFill;

public class Main {

    public static void main(String[] args) {
        Track sticker = new Track("Sticker", "Tayeong", 227);
        Track lemonade = new Track("Lemonade", "Teuru", 190);
        Track breakfast = new Track("Breakfast", "Jeong Ha-ri",212);
        Track focus = new Track("Focus", "Lee Chang-hyeok", 204);
        Track theRainyNight = new Track("The Rainy Night", "Seo Hye-ri", 199);
        Track far = new Track("Far", "Sahara", 216);
        Track bringTheNoize = new Track("Bring the Noize", "Kim Boo-min", 222);
        Track magicCarpetRide = new Track("Magic Carpet Ride", "Jo Yoon-kyung", 218);
        Track roadTrip = new Track("Road Trip", "Le'mon", 215);
        Track dreamer = new Track("Dreamer", "Baek Geum-min", 209);
        Track promiseYou = new Track("Promise you", "ZNEE", 211);

        Track[] trackList = {sticker, lemonade, breakfast, focus, theRainyNight, far, bringTheNoize, magicCarpetRide,
        roadTrip, dreamer, promiseYou};

        Album stickerAlbum = new Album("Sticker", "Sticker", trackList, 2021);

        Member yuta  = new Member();
        Member tayeong = new Member();
        Member taeil = new Member();
        Member[] members = { tayeong, taeil, yuta }; //but in reality there are 9 of them

//        yuta.catchError();
//        tayeong.catchError();
//        taeil.catchError();

        Group nct127 = new Group("NCT 127", 2016, members, "Sticker");

        stickerAlbum.playAllTracks();
        stickerAlbum.showTheGroupName();

        nct127.arrayFill();

        yuta.showTheActivityYears();


        nct127.showAllMembers();
        Track.playSound("..\\Homework3\\NCT_127_-_127_Stickercom.wav");

    }



}