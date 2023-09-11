package Collection;

public class gbob {
private int id;
private String name;
private String sal;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the sal
 */
public String getSal() {
	return sal;
}
/**
 * @param sal the sal to set
 */
public void setSal(String sal) {
	this.sal = sal;
}

public gbob() {
	
}
public gbob(int id, String name, String sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}


}
