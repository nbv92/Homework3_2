
public class Main {

	public static void main(String[] args) {
		task1();
		task2();
		task3(); 
		task4();
		task5();
	}
	
	public static void task1() {
		System.out.println("Task1");
		//int clientOS = 1;
		//boolean clientOSBool = clientOS<=1;почему не работает? Почему не работает модификатор паблик?
		int clientOS = 1;
		if (clientOS==1) {
			System.out.println("Android\n");
		}else {
			System.out.println("iOS\n");
		}
	}
	
	public static void task2() {
		System.out.println("Task2");
		int clientDeviceYear = 2015;
		int clientOS = 1;
		boolean clientOSBool = clientOS<=1;
		if(clientOSBool) {
			if (clientDeviceYear<2015) {
				System.out.println("Установите облегченную версию приложения для Android по ссылке."+"\n");
			}else {
				System.out.println("Установите версию приложения для Android по ссылке"+"\n");
			}
		}else {
			if(clientDeviceYear<2015) {
				System.out.println("Установите облегченную версию приложения для iOS по ссылке"+"\n");
			}else {
				System.out.println("Установите версию приложения для iOS по ссылке"+"\n");
			}
		}
		
	}
	
	public static void task3() {
		System.out.println("Task3");
		int year = 2021;
		if(year%4==0) {
			if(year%400==0) {
				System.out.println(year+" год является високосным.\n");
			}else if(year%100==0);
				System.out.println(year+" год не является високосным.\n");
			}else if (year%4==0){
				System.out.println(year+" год является високосным.\n");
			}
		else{
			System.out.println(year+" год не является високосным.\n");
		}
	}
	
	public static void task4() {
		System.out.println("Task4");
		int eliveryDistance = 95;
		int day = 1;
		if (eliveryDistance<=20) {
			System.out.println("Потребуется дней: "+day+"\n");
		}else if(eliveryDistance<60) {
			day+=1;
			System.out.println("Потребуется дней: "+day+"\n");
		}else if(eliveryDistance<100) {
			day+=2;
			System.out.println("Потребуется дней: "+day+"\n");
		}else {
			System.out.println("Свыше 100 км доставки нет.\n");
		}
	}
	
	public static void task5() {
		System.out.println("Task5");
		int monthNumber = 12; 
		if(monthNumber<=12) {
			switch (monthNumber) {
			case 1:
				System.out.println("Winter");
				break;
			case 2:
				System.out.println("Winter");
				break;
			case 3:
				System.out.println("Spring");
				break;
			case 4:
				System.out.println("Spring");
				break;
			case 5:
				System.out.println("Spring");
				break;
			case 6:
				System.out.println("Summer");
				break;
			case 7:
				System.out.println("Summer");
				break;
			case 8:
				System.out.println("Summer");
				break;
			case 9:
				System.out.println("Autumm");
				break;
			case 10:
				System.out.println("Autumm");
				break;
			case 11:
				System.out.println("Autumm");
				break;
			case 12:
				System.out.println("Winter");
				break;
			default:
				System.out.println("Back to Future!");	
		} //else if (monthNumber>12){
			//System.out.println("It's TRAP!");
			//}
			//*/Main.java:118:11
			//java: 'else' without 'if' Тоже не понял в чем ошибка
		}
	}

}
