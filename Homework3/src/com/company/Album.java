package com.company;

public class Album extends Group implements GroupName{
    protected String albumName;
    protected String titleTrack;
    protected Track[] trackList;
    protected int releaseYear;

    public Album(String albumName, String titleTrack, Track[] trackList, int releaseYear){
        this.albumName = albumName;
        this.titleTrack = titleTrack;
        this.trackList = trackList;
        this.releaseYear = releaseYear;

    }
    public void playAllTracks(){
        for (Track track:trackList) {
            System.out.println("Track name:                         " + track.trackName);
            System.out.println("The author of the lyrics:           " + track.lyricsAuthor);
            System.out.println("The length of the track in seconds: " + track.length);
        }
    }
    public void showTheGroupName(){
        System.out.println("This album is by: " + Album.groupName);
    }

    public String getGroupName() {
        return groupName;
    }
}
