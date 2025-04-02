package _13_Class_mission;

public class Train_obj {
	private String TrainNum=null;
	private String TrainTime=null;
	private String TrainType=null;
	private boolean TrainFix=false;
	public String getTrainNum() {
		return TrainNum;
	}
	public void setTrainNum(String trainNum) {
		TrainNum = trainNum;
	}
	public String getTrainTime() {
		return TrainTime;
	}
	public void setTrainTime(String trainTime) {
		TrainTime = trainTime;
	}
	
	public String getTrainType() {
		return TrainType;
	}
	public void setTrainType(String trainType) {
		TrainType = trainType;
	}
	public boolean isTrainFix() {
		return TrainFix;
	}
	public void setTrainFix(boolean trainFix) {
		TrainFix = trainFix;
	}
	
	public void prt() {
		System.out.println("----열차 정보 출력----");
		System.out.println("열차번호: "+this.TrainNum);
		System.out.println("열차시간: "+this.TrainTime);
		String printType=this.TrainType;
		if(this.TrainType.equals("새마을")) {
			printType+="*";
		}
		System.out.println("열차종류"+printType);
	}
	
}
