package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Track {
    protected String trackName;
    protected String lyricsAuthor;
    protected int length;

    public Track(String trackName, String lyricsAuthor, int length){
        this.trackName = trackName;
        this.lyricsAuthor = lyricsAuthor;
        this.length = length;
    }


    public static void playSound(final String path) {
            try{
                final File audioFile=new File(path);
                AudioInputStream audioIn= AudioSystem.getAudioInputStream(audioFile);
                Clip clip=AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
                long duration=getDurationInSec(audioIn);

                Thread.sleep(duration*1000);
            }catch(LineUnavailableException | UnsupportedAudioFileException | MalformedURLException |
                    InterruptedException exception){
                exception.printStackTrace();
            }
            catch(IOException ioException){
                ioException.printStackTrace();
            }
        }
        public static long getDurationInSec(final AudioInputStream audioIn){
            final AudioFormat format=audioIn.getFormat();
            double frameRate=format.getFrameRate();
            return (long)(audioIn.getFrameLength()/frameRate);
        }


        }

