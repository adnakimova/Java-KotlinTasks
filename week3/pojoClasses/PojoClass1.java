class DonutShop {  
  private String donutName;
  private int price;

  public DonutShop(String donutName, int price){
    this.donutName = donutName;
    this.price = price;
  }
  public String getDonutName(){
    return this.donutName;
  }
  public void setDonutName(String donutName){
    this.donutName = donutName;
  }

  public int getPrice(){
    return this.price;
  }
  public void setPrice(int price){
    this.price = price;
  }
   
}
