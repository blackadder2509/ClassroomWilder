public class Wilder{

    private String firstname;
    private boolean aware;

  public Wilder(String firstname, boolean aware){
    this.firstname=firstname;
    this.aware=aware;
  }

  public String getfirstname(){
    return this.firstname;
  }
  public boolean isaware(){
    return this.aware;
  }
  public void setfirstname(String firstname){
    this.firstname=firstname;
  }
  public void setaware(boolean aware){
    this.aware=aware;
  }
  public String whoAmI(){
    if(this.aware){
      return ("Je m'appelle " +this.firstname+ " et je suis aware");
    }
    else{
      return ("Je m'appelle " + this.firstname + " et je ne suis pas aware");
    }
  }

}
