package movies.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LogosAndPosters {
	private List<Image> background;
    private int id;
    private List<Image> posters;

    @Override
    public String toString() {
        return "BackgroundLogosPosters{" +
                "background=" + background +
                ", id=" + id +
                ", posters=" + posters +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Image> getBackground() {
        return background;
    }

    public void setBackground(List<Image> background) {
        this.background = background;
    }



    public List<Image> getPosters() {
        return posters;
    }

    public void setPosters(List<Image> posters) {
        this.posters = posters;
    }

    public LogosAndPosters() {
    }

    public LogosAndPosters(List<Image> background, int id, List<Image> posters) {
        this.background = background;
        this.id = id;
        this.posters = posters;
    }
}
