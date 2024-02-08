package com.zensar.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.entity.CouponDto;

//@FeignClient("http://localhost:8585/")
@FeignClient("COUPON-SERVICE")
public interface RestClient {

	// ResponseEntity<CouponDto> responseEntity =
	// restTemplate.getForEntity("http://COUPON-SERVICE/coupon-api/coupons/"+couponCode,
	// CouponDto.class);
	@GetMapping("/coupon-api/coupons/{couponCode}")
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponCode") String couponCode);

}
