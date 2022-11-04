package edu.miu.springConnData.Controller;

import edu.miu.springConnData.Entity.Product;
import edu.miu.springConnData.Entity.Review;
import edu.miu.springConnData.Service.ReviewImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/reviews")
@RestController
public class ReviewController {

    @Autowired
    private ReviewImpl reviewImpl;

    @GetMapping
    public List<Review> getAllReview(){
        return reviewImpl.getReviews();
    }
    @GetMapping("/{Id}")
    public Review getReview(@PathVariable Long Id){
        return reviewImpl.getReview(Id);
    }

    @GetMapping("/filter")
    public List<Review> findAllReviewByProductId(@RequestParam Product product){
        return reviewImpl.findAllReviewByProductId(product);
    }

    @DeleteMapping("/{Id}")
    public void deleteReview(@PathVariable Long Id){
        reviewImpl.deleteReview(Id);
    }

    @PostMapping
    public void addReview(@RequestBody Review review){
        reviewImpl.saveReview(review);
    }

    @PutMapping
    public void updateReview(@RequestBody Review review){
        reviewImpl.updateReview(review);
    }


}
