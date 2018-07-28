
public class ListModel {
	String number;
	String name;
	
	ListModel(String number,String name){
		this.number=number;
		this.name=name;
	}
	
	public String getNumber() {
        return this.number;
    }
	public String getName() {
        return this.name;
    }
	public void setName(String name) {
        this.name = name;
    }
	public void setNumber(String number) {
        this.number = number;
       
    }

}
