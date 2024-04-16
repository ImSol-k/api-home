package com.javaex.vo;

public class ManagerVoY {

   private int product_no;
   private String product_name;
   private int price;
   private String category;
   private String main_img;
   
   private int img_no;
   private String save_name;
   
   public ManagerVoY() {
      super();
   }

   public int getProduct_no() {
      return product_no;
   }

   public void setProduct_no(int product_no) {
      this.product_no = product_no;
   }

   public String getProduct_name() {
      return product_name;
   }

   public void setProduct_name(String product_name) {
      this.product_name = product_name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getMain_img() {
      return main_img;
   }

   public void setMain_img(String main_img) {
      this.main_img = main_img;
   }

   public int getImg_no() {
      return img_no;
   }

   public void setImg_no(int img_no) {
      this.img_no = img_no;
   }

   public String getSave_name() {
      return save_name;
   }

   public void setSave_name(String save_name) {
      this.save_name = save_name;
   }

   @Override
   public String toString() {
      return "ManagerVoY [product_no=" + product_no + ", product_name=" + product_name + ", price=" + price
            + ", category=" + category + ", main_img=" + main_img + ", img_no=" + img_no + ", save_name="
            + save_name + "]";
   }
   
}
