package systemdesign.bookmyshow;

public class Movie {
    private String name;
    private float ratings = 0.0f;

    private Language language;
    private Genere genere;

    public Movie(String name, Language language,
                 Genere genere) {
        this.name = name;
        this.language = language;
        this.genere = genere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
