//created a class to collect the data of the title, artist, album, and year
public class Song{
    String title; 
    String artist;
    String album;
    int year;
    
    public Song(String title, String artist, String album, int year){
        this.title = title; 
        this.artist = artist;
        this.album = album;
        this.year = year;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getAlbum(){
        return album;
    }
    public int getYear(){
        return year;
    }
    
    
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    //makes note of which songs are not from albums so it can return non-album single instead
    //if it's a song from an album, it returns everything 
    public String toString(){
        if (this.album.equals("none")){
            return "Artist: " + artist + "\nTitle: " + title + "\nNon-album single ";
        }
        else{
            return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album;
        }
    }

        
}
