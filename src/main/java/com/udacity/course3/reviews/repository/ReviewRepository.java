package com.udacity.course3.reviews.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udacity.course3.reviews.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	/*
	 * Finds all the reviews based on the productId.
	 * Generated by JPA at runtime
	 * 
	 * @param : Integer product id to do the search
	 * @result: List of reviews have product id same as @param
	 */
	List<Review> findByProductId(Integer productId);

}
