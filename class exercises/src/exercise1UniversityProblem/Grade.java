/**
 * Created by hp on 10/18/2019.
 */
package exercise1UniversityProblem;

public class Grade {
    //field
    private Course course;
    private Letter letter;
    private int rating;


    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
