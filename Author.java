package day3assingment;

public class Author {
	private int authorid;
	private String name;
	private String address;
	
	Author(int authorid,String name,String address ){
		this.setAuthorid(authorid);
		this.setAddress(address);
		this.setName(name);
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Authorid: "+authorid+"Author Name: "+name+"Address"+address;
	}

}
