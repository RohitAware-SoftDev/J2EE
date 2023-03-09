package com.jspiders.song;

public class Song {
	private int id;
	private String name;
	private String singer;
	private String movie;
	private float duration;
	private String album;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Override
	public String toString() {
		return "MusicPlayer ["
				+ "  id=" + id + ""
				+ ", name=" + name + ""
				+ ", singer=" + singer + ""
				+ ", movie=" + movie + ""
				+ ", duration="+ duration + ""
				+ ", album=" + album + "]";
	}
	
	
}
