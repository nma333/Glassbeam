package glassbeam;

import java.util.ArrayList;

//The class Model acts as the data for the given problem.
class Model{
	int channelNumber;
	int uniqueID;
	Model(int channelNumber,char uniqueID){
		this.channelNumber=channelNumber;
		this.uniqueID=uniqueID;
	}
}

public class Solution3 {
	public static void main(String[] args) {
		//Here the channel1 and channel2 are the Arraylists which will stores the data and the memebers of the data.
		ArrayList<Model> channel1=new ArrayList<Model>();
		ArrayList<Model> channel2=new ArrayList<Model>();
		
		//Here we are going to compare the data name .If they are equal then we will print the datat name and 
		//the channelNumber and uniqueId as shown in the bellow.
		for(Model m:channel1) {
			for(Model n:channel2) {
				//m.getClass().getSimpleName()==n.getClass().getSimpleName()
				if(m.equals(n)) {
					System.out.println(m.getClass().getSimpleName()+""+m.channelNumber+"_"+m.uniqueID+
							", "+n.getClass().getSimpleName()+""+n.channelNumber+"_"+n.uniqueID);
				}
			}
		}
	}
}