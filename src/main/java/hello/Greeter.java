package hello;



public class Greeter {



  private String name = "";
  private int age = 18;

  public String getName() 

  {

    return name;

  }
  
  public int getAge() {
    return age; 
  }
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name == "") 

    {

       return "Hello!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }

}
