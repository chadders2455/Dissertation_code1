

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Emotions_demo 
{
	public static void main(String[] args)
	{
		String emotions;
		char ch = 'y';
		while(ch=='y' || ch=='Y')
		{
		try 
		{
			HashMap<String,Integer> hm = new HashMap<String, Integer>(20);
			HashMap<String,Integer> hm1 = new HashMap<String, Integer>(60);
			HashMap<Integer,String> hm2 = new HashMap<Integer, String>(20);
			hm.put("alarmed",0);
			hm1.put("panic",0);
			hm1.put("startle",0);
			hm1.put("agitate",0);
			
			hm.put("afraid",1);
			hm1.put("scared",1);
			hm1.put("petrified",1);
			hm1.put("frightened",1);
			
			hm.put("annoyed",2);
			hm1.put("irritate",2);
			hm1.put("vex",2);
			hm1.put("displease",2);
			
			hm.put("frustrated",3);
			hm1.put("thwart",3);
			hm1.put("infuriate",3);
			hm1.put("derail",3);
			
			hm.put("angry",4);
			hm1.put("irate",4);
			hm1.put("aggrieved",4);
			hm1.put("furious",4);
			
			hm.put("excited",5);
			hm1.put("hectic",5);
			hm1.put("fevered",5);
			hm1.put("heated",5);
			
			hm.put("astonished",6);
			hm1.put("amazed",6);
			hm1.put("surprised",6);
			hm1.put("dazed",6);
			
			hm.put("delighted",7);
			hm1.put("hilarious",7);
			hm1.put("jolly",7);
			hm1.put("joyous",7);
			
			hm.put("happy",8);
			hm1.put("glad",8);
			hm1.put("blest",8);
			hm1.put("enjoyable",8);
			
			hm.put("pleased",9);
			hm1.put("grateful",9);
			hm1.put("thankful",9);
			hm1.put("elated",9);
			
			hm.put("content",10);
			hm1.put("fulfill",10);
			hm1.put("gratified",10);
			hm1.put("appease",10);
			
			hm.put("serene",11);
			hm1.put("calm",11);
			hm1.put("composed",11);
			hm1.put("collected",11);
			
			hm.put("calmed",12);
			hm1.put("poise",12);
			hm1.put("aplomb",12);
			hm1.put("sangfroid",12);
			
			hm.put("relaxed",13);
			hm1.put("ease",13);
			hm1.put("lessen",13);
			hm1.put("diminish",13);
			
			hm.put("sleepy",14);
			hm1.put("inactive",14);
			hm1.put("soporific",14);
			hm1.put("heavy-eyed",14);
			
			hm.put("tired",15);
			hm1.put("uninspired",15);
			hm1.put("fedup",15);
			hm1.put("drowsy",15);
			
			hm.put("bored",16);
			hm1.put("stultify",16);
			hm1.put("weary",16);
			hm1.put("exhaust",16);
			
			hm.put("depressed",17);
			hm1.put("glum",17);
			hm1.put("sad",17);
			hm1.put("low",17);
			
			hm.put("miserable",18);
			hm1.put("heartbroken",18);
			hm1.put("joyless",18);
			hm1.put("wretched",18);
			
			hm2.put(0, "Don't panic everything will be ok");			
			hm2.put(1, "Don't be afraid nothing bad will happen to you");			
			hm2.put(2, "Calm down, don't be so annoyed");			
			hm2.put(3, "Be patient, all will be good");			
			hm2.put(4, "Theres no need to be so angry");			
			hm2.put(5, "I m glad to see your so excited");			
			hm2.put(6, "We can all be surprised from time to time");			
			hm2.put(7, "Im glad to your having a good time");			
			hm2.put(8, "We should all be happy at least once in our lives");			
			hm2.put(9, "It's ok no need to be thankful");			
			hm2.put(10, "The body should always be in a state of happiness" );			
			hm2.put(11,"Stay serene, don't get so nervous");			
			hm2.put(12, "A calm mind is a calm body");			
			hm2.put(13, "Go get a drink and enjoy it whilst you can");			
			hm2.put(14, "Go grab yourself a coffee");			
			hm2.put(15, "If your feeling tired, go catch some Z's");			
			hm2.put(16, "Your young, go get some fresh air instead of talking to me!");			
			hm2.put(17, "The sadness we all feel makes holding on the happiness worth while");			
			hm2.put(18, "Whatever happens, I'm here for you");
			
			

			String word[]={"panic","startle","agitate","scared","petrified","frightened","irritate","vex","displease",
					"thwart","infuriate","derail","irate","aggrieved","furious","hectic","fevered","heated",
					"amazed","surprised","dazed","hilarious","jolly","joyous","glad","blest","enjoyable","grateful",
					"thankful","elated","fulfill","gratified","appease","calm","composed","collected","poise","aplomb",
					"sangfroid","ease","lessen","diminish","inactive","soporific","heavy-eyed","uninspired","fedup",
					"drowsy","stultify","weary","exhaust","glum","sad","low","heartbroken","joyless","wretched"};
			
			String emotions1[]={"alarmed","afraid","annoyed","frustrated","angry","excited","astonished","delighted",
								"happy","pleased","content","serene","calmed","relaxed","sleepy","tired","bored",
								"depressed","miserable"};
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Hi there! How are you today?");
			emotions = br.readLine();			
			String arr[]=emotions.split(" ");
			int flag=0,sentance=0;
			for (int i = 0; i < word.length; i++) 
			{
				for (int j = 0; j < arr.length; j++) 
				{	
					 if(word[i].equalsIgnoreCase(arr[j]))
					{
						
						sentance=hm1.get(word[i]);
						flag=1;
					}
					
				}
			}
			
			for (int i = 0; i < emotions1.length; i++) 
			{
				for (int j = 0; j < arr.length; j++) 
				{	
					if(emotions1[i].equalsIgnoreCase(arr[j]))
					{
						
						sentance=hm.get(emotions1[i]);
						flag=1;
					}
					
				}
			}
			
			
			if(flag==1)
			{
				System.out.println(hm2.get(sentance));
			}
			else 
			{
				System.out.println("Im sorry, I didnt quite catch that, could you repeat please");
			}
			
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Is there something else you'd like to talk about?");
			System.out.println("Enter y or Y to continue");
			ch = s.next().charAt(0);			
		}
		
		}	
	}
	
}			