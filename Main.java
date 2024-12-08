import java.io.File;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        File file = new File("top100streams.txt");
        Scanner text = new Scanner(file);
        String str = text.nextLine();
        System.out.println("Top Streams of 2016: ");

        //starting counter for songs
        int i = 1;

        //loops through the text file 
        while(text.hasNextLine()){
            //System.out.println(text.hasNextLine());
            str = text.nextLine();

            //marks the position of | 
            int index1 = str.indexOf("|");
            int index2 = str.indexOf("|", index1 + 1);
            int index3 = str.indexOf("|", index2 + 1);
            int index4 = str.indexOf("|", index3 + 1);
            int index5 = str.indexOf("|", index4 + 1);
            
            //collects each piece of data and makes them variables 
            String title = str.substring(index1 + 1, index2);
            String artist = str.substring(index2 + 1, index3);
            String album = str.substring(index3 + 1, index4);
            String date = str.substring(index5 + 1);
            int year = Integer.valueOf(date.substring(date.length() - 4));

            //if the song is from 2016, prints out the title, artist, and album name
            if (year == 2016){
                Song song1 = new Song(title, artist, album, year);
                System.out.println(i);
                System.out.println(song1);
                System.out.println();
                i++;
            }
            
            }

    }
}
