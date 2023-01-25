public class Runner {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("Dog"));
        System.out.println(Review.sentimentVal("is"));
        System.out.println(Review.sentimentVal("terrible"));

        System.out.println(Review.totalSentiment("simpleReview.txt"));

    }
}