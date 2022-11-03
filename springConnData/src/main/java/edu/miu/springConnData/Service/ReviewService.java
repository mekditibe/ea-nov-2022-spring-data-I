package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Review;


import java.util.List;

public interface ReviewService {
    List<Review> getReviews();
    Review getReview(Long Id);
    void deleteReview(Long Id);
    void saveReview(Review review);
}
