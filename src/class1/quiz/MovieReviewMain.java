package class1.quiz;

/**
 * Movie Review Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MovieReviewMain {

	public static void main(String[] args) {

		// 영화 리뷰 정보 선언
		MovieReview inception = new MovieReview();
		inception.title = "인셉션";
		inception.review = "인생은 무한 루프";

		MovieReview aboutTime = new MovieReview();
		aboutTime.title = "어바웃타임";
		aboutTime.review = "인생 시간 영화!";

		MovieReview[] movieReviews = {inception, aboutTime};

		// 영화 리뷰 정보 출력
		for (MovieReview review : movieReviews) {
			System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
		}
	}
}