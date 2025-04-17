import java.util.*;


class Player implements Comparable<Player>,Comparator<Player>
{

	private int playid;
	private String name;
	private int match;
	private double score;

	Player(int playid, String name , int match, double score)
	{

		this.playid=playid;
		this.name=name;
		this.match=match;
		this.score=score;

	}

	public int getId()
	{
		return playid;
	}
	public String getName()
	{
		return name;	
	}
	public int getMatch()
	{
		return match;
	}
	public double getScore()
	{
		return score;
	}

	public String toString()
	{
		return playid+"  "+ name+" "+match+ " "+ score;
	}
	public int compareTo(Player p)
	{
		return -Double.compare(this.getScore(),p.getScore());
	}
	public int compare(Player p1,Player p2)
	{
		return p1.getName().compareTo(p2.getName());

	}
}


class Sports{

	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> list=new ArrayList<Player>();
		int id,m;
 		String n;
		double s;
		System.out.println("enter the no of player   :  ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{	

			System.out.println("ID");
			 id=sc.nextInt();
			System.out.println("NAME");
			 n=sc.next();
			System.out.println("MATCHES");
			 m=sc.nextInt();
			System.out.println("SCORE");
			 s=sc.nextDouble();

		Player player =new Player(id,n,m,s);
		list.add(player);
			
		}

		Collections.sort(list);
		System.out.println("Comparatable   : "+list);
		Collections.sort(list , new Player(0," ",0,0));
		System.out.println("Comparator     : "+list);
	}

}
















