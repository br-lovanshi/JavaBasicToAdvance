package opps.Encaptulation;

public class SingerAndSong {
   private String singer;
   private String song;

    void song(){
        System.out.println(this.singer + " is singing a song " + this.song);
    }
    public static void main(String[] args) {
        SingerAndSong singer1  = new SingerAndSong();
        singer1.singer = "Lata";
        singer1.song = "Vande Mataram";
        singer1.song();

        SingerAndSong singer2 = new SingerAndSong();
        singer2.singer = "Arijit";
        singer2.song = "Tum hi ho";
        singer2.song();
    }
}
