package com.yash.pms.model;

import java.util.Objects;

public class User {
	
	String name;
	String email;
	String password;
	String sq;
	String answer;
	String status;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", sq=" + sq + ", answer="
				+ answer + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(answer, email, name, password, sq, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(answer, other.answer) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(sq, other.sq) && Objects.equals(status, other.status);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSq() {
		return sq;
	}
	public void setSq(String sq) {
		this.sq = sq;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
