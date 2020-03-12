
package Inheritance;


public class Person {
  private String name;
  private String sex;
  private String profession;
  private String phone;
  private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
  
    void displayInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Sex : "+ sex);
        System.out.println("Profession : "+ profession);
        System.out.println("Phone : "+ phone);
        System.out.println("Age : "+ age);
        System.out.println("\n");
    }
}
