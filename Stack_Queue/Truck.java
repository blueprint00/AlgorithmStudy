package Stack_Queue;
import java.util.*;

public class Truck {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		//210321
		int time = 0;
		Queue<Truck1> bridge = new LinkedList<>();
		int lastEnterTruckIndex = 0;
		int currentBridgeWeight = 0;
		int truckNumber = truck_weights.length;

		while(lastEnterTruckIndex < truckNumber){
			time ++;
			
			if(!bridge.isEmpty()){
				Truck1 frontTruck = bridge.peek();
				if(time - frontTruck.enterTime == bridge_length){
					currentBridgeWeight -= bridge.poll().weight;
				}

				int compareTruck = truck_weights[lastEnterTruckIndex];
				if(currentBridgeWeight + compareTruck <= weight){
					bridge.offer(new Truck1(compareTruck, time));
					lastEnterTruckIndex ++;
					currentBridgeWeight += compareTruck;
				}
			}
		}
		time += bridge_length;
		return time;

	// 	int time = 0;
    //     Queue<Truck1> bridge = new LinkedList<>();
    //     int lastEnterTruckIndex = 0;
    //     int currentBridgeWeight = 0;
    //     int truckNumber = truck_weights.length;
		
    //     while(lastEnterTruckIndex < truckNumber) {
    //     	time ++;
        	
    //     	// 다리에 트럭이 있는지 먼저 비교!!
    //     	if(!bridge.isEmpty()) {
    //     		Truck1 frontTruck = bridge.peek();
    //     		if(time - frontTruck.enterTime == bridge_length) {
    //     			currentBridgeWeight -= bridge.poll().weight;
    //     		}
    //     	}
        	
    //     	int compareTruck = truck_weights[lastEnterTruckIndex];
    //         if (currentBridgeWeight + compareTruck <= weight) {
    //             bridge.offer(new Truck1(compareTruck, time));
    //             lastEnterTruckIndex ++;
    //             currentBridgeWeight += compareTruck;
    //         } 
    //     }

    //     time += bridge_length;

	// 	return time;
	}
}

class Truck1 {
	int weight;
	int enterTime;
	
	Truck1(int weight, int enterTime){
		this.weight = weight;
		this.enterTime = enterTime;
	}
}

