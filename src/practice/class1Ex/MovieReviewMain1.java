package practice.class1Ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        //영화 리뷰 정보 선언
        MovieReview move1 = new MovieReview();
        move1.title =  "인셉션";
        move1.review = " 인생은 무한 루프";

        MovieReview move2 = new MovieReview();
        move2.title = "어바웃 타임";
        move2.review = "인생 시간 영화!";

        //영화 리뷰 정보 출력
        System.out.println("영화 제목 : " + move1.title + ", 리뷰 : " + move1.review);
        System.out.println("영화 제목 : " + move2.title + ", 리뷰 : " + move2.review);
    }
}
