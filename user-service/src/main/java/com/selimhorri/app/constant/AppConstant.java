package com.selimhorri.app.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class AppConstant {
	
	public static final String LOCAL_DATE_FORMAT = "dd-MM-yyyy";
	public static final String LOCAL_DATE_TIME_FORMAT = "dd-MM-yyyy__HH:mm:ss:SSSSSS";
	public static final String ZONED_DATE_TIME_FORMAT = "dd-MM-yyyy__HH:mm:ss:SSSSSS";
	public static final String INSTANT_FORMAT = "dd-MM-yyyy__HH:mm:ss:SSSSSS";
	
	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public abstract class DiscoveredDomainsApi {
		
		public static final String USER_SERVICE_HOST = "http://user-service/user-service";
		public static final String USER_SERVICE_API_URL = "http://user-service/user-service/api/users";
		
		public static final String PRODUCT_SERVICE_HOST = "http://product-service/product-service";
		public static final String PRODUCT_SERVICE_API_URL = "http://product-service/product-service/api/products";
		
		public static final String ORDER_SERVICE_HOST = "http://order-service/order-service";
		public static final String ORDER_SERVICE_API_URL = "http://order-service/order-service/api/orders";
		
		public static final String FAVOURITE_SERVICE_HOST = "http://favourite-service/favourite-service";
		public static final String FAVOURITE_SERVICE_API_URL = "http://favourite-service/favourite-service/api/favourites";
		
		public static final String PAYMENT_SERVICE_HOST = "http://payment-service/payment-service";
		public static final String PAYMENT_SERVICE_API_URL = "http://payment-service/payment-service/api/payments";
		
		public static final String SHIPPING_SERVICE_HOST = "http://SHIPPING-SERVICE/shipping-service";
		public static final String SHIPPING_SERVICE_API_URL = "http://SHIPPING-SERVICE/shipping-service/api/shippings";
		
	}
	
	
	
}









