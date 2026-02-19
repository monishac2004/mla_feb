package com.test;

public class Movie {
	
	private int id;
	
	private String m_name;
	
	private String m_director;
	
	public Movie() {
		
	}
	
	public Movie(int id, String m_name, String m_director) {
		this.id = id;
		this.m_name = m_name;
		this.m_director = m_director;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_director() {
		return m_director;
	}

	public void setM_director(String m_director) {
		this.m_director = m_director;
	}
	
	
}
