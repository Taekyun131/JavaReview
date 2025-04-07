package _16_OJDBC_practice;

public class FoodDTO {
	private String foodName=null;
	private String foodIntime=null;
	private int foodLikeLevel=0;
	
	//getter, setter
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodIntime() {
		return foodIntime;
	}
	public void setFoodIntime(String foodIntime) {
		this.foodIntime = foodIntime;
	}
	public int getFoodLikeLevel() {
		return foodLikeLevel;
	}
	public void setFoodLikeLevel(int foodLikeLevel) {
		this.foodLikeLevel = foodLikeLevel;
	} 
	
	
}
