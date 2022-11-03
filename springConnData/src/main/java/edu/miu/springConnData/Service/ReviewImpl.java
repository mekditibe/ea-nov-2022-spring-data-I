package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Review;
import edu.miu.springConnData.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review getReview(Long Id) {
        return reviewRepository.findById(Id).get();
    }

    @Override
    public void deleteReview(Long Id) {
        reviewRepository.deleteById(Id);
    }

    @Override
    public void saveReview(Review review) {
        reviewRepository.save(review);
    }
}
