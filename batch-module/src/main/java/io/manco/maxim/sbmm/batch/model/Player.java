package io.manco.maxim.sbmm.batch.model;

public class Player {

	private String id;

	private String name;

	public Player(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Player() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

}
