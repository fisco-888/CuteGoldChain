package com.webank.lian.result;


public class Result {
	
	private Integer status;//状态码
	private String message;//消息
	
	private Result(Integer status, String message) {
		this.status = status;
		this.message = message;
	}
	
	/*
	登录验证成功，返回success
	 */
	public static Result success() {
		return new Result(0, "success");
	}
	
	/*
	登录验证失败，返回状态码和相应的消息
	
	1 : 用户名或密码为空
	2 ：用户不存在
	3 : 用户名或密码错误
	 */
	public static Result error(Integer status, String message) {
		return new Result(status, message);
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Result{");
		sb.append("status=").append(status);
		sb.append(", message='").append(message).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
