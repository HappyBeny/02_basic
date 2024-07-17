package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생은 무한 루프!";

        MovieReview[] reviews = {inception, aboutTime};

        for (MovieReview s : reviews) {
            System.out.println("제목 : " + s.title + ", 영화 리뷰 : " + s.review);
        }

    }
}
