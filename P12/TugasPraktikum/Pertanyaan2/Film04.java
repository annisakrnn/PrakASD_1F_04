public class Film04 {
    int id;
    String judulFilm;
    double rating;
    Film04 prev, next;

    Film04(Film04 prev, int id, String judulFilm, double rating, Film04 next){
        this.prev=prev;
        this.id=id;
        this.judulFilm=judulFilm;
        this.rating=rating;
        this.next=next;

    }

}
