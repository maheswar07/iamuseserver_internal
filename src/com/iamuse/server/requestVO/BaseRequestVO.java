package com.iamuse.server.requestVO;

import org.springframework.stereotype.Component;





@Component
public class BaseRequestVO {

	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}
	
}
