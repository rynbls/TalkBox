import java.time.LocalDateTime;

public class AudioFile {
    private String fileName;
    private int runTime; // in sec
    private LocalDateTime timeAdded;

    public AudioFile(){ }

    public AudioFile(String fileName){
        this.fileName = fileName;
    }

    public AudioFile(String fileName, int runTime, LocalDateTime timeAdded){
        this.fileName = fileName;
        this.runTime = runTime;
        this.timeAdded = timeAdded;
    }

    public String getName(){
        return fileName;
    }

    public void setName(String fileName){
        this.fileName = fileName;
    }
}
