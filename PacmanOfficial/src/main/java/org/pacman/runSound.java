package org.pacman;

public class runSound implements Runnable{
    private SoundEffects soundEffects;
    public runSound(SoundEffects soundEffects){
        this.soundEffects = soundEffects;
    }

    @Override
    public void run() {
        while(!soundEffects.killed()){ //this needs to constantly run because music.play sets the runnable in a waiting state until it's notified to play.
            soundEffects.getThreadReady();
        }
    }
}
