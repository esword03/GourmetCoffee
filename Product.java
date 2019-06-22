public class Product {
 private String code;
 private String description;
 private double price;
 public Product(String code, String description, double price) {
  this.code = code;
  this.description = description;
  this.price = price;
 }
 public String getCode() {
  return code;
 }
 public String getDescription() {
  return description;
 }
 public double getPrice() {
  return price;
 }
 @Override
 public String toString() {
  
  return code + "_" + description + "_" + price ;
 }
 
 @Override
 public boolean equals(Object object) {
  if(object instanceof Product){
   Product p=(Product)object;
   return p.getCode().equals(code);
   
  }
  return(false);
  
  
 }
 
 
}