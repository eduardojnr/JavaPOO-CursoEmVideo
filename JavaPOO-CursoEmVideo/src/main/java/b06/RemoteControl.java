
package b06;

public class RemoteControl implements Controller{
    
    private int volume;
    private boolean status; // ON | OFF
    private boolean playing;
   
    // Aux variable
    int vol = this.getVolume(); // To aux on mute/unmute method
   
    // Constructor method
    public RemoteControl(){
       volume = 5;
       status = false;
       playing = false;
   }
    
    // Abstract methods
    @Override
    public void turnOn() {
        this.setStatus(true);
    }

    @Override
    public void turnOff() {
        this.setStatus(false);
    }

    @Override
    public void openMenu() {
        // Getting the On/Off status
        if (this.isStatus()){
            System.out.println("ON");
            System.out.println("Volume: " + this.getVolume());
            if (this.isPlaying()){
                System.out.println("You're watching");
            }
        } else {
            System.out.println("OFF");
        }
    }

    @Override
    public void closeMenu() {
        // Any code here
    }

    @Override
    public void increaseVolume() {
        if ((this.isStatus()) & (this.getVolume() < 10)){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void decreaseVolume() {
        if ((this.isStatus()) & (this.getVolume() > 0)){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void mute() {
        if (this.isStatus()){
            vol = this.getVolume(); // Saving the volume setup till unmute
            this.setVolume(0);
        }
    }

    @Override
    // The volume come back to the last setup ;D
    public void unmute() {
        if (this.isStatus()){
            this.setVolume(vol);
        }
    }

    @Override
    public void play() {
        if (this.isStatus()){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.isStatus()){
            this.setPlaying(false);
        }
    }
    
    // Getters and Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}