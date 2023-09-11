package Collection;

public class Employee {
private int id;
private String name;
private double salary;
private String post;
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
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
/**
 * @return the post
 */
public String getPost() {
	return post;
}
/**
 * @param post the post to set
 */
public void setPost(String post) {
	this.post = post;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", post=" + post + "]";
}

}
