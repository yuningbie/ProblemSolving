import java.util.ArrayList;

public class ModifyWordShortestPath {
	
	static ArrayList<String> modifyWordShortestPath(String start, String end)
	{
		int s = 0;
		int e = 0;
		String temp = start;
		ArrayList<String> path = new ArrayList<String>();
		path.add(start);
		while(s < start.length() || e < end.length())
		{
			if(s < start.length() && e < end.length())
			{
				if(start.charAt(s) == end.charAt(e))
				{
					s++;
					e++;
				}
				else
				{
					char toChange = end.charAt(e);
					temp = temp.substring(0, s) + Character.toString(toChange) + temp.substring(s+1, start.length());
					path.add(temp);
					s++;
					e++;
				}
			}
			else if(s < start.length() && e >= end.length())
			{
				for(int i=s; i<start.length(); i++)
				{
					temp = temp.substring(0, i);
					path.add(temp);
					s++;
				}
			}
			else if(s >= start.length() && e < end.length())
			{
				for(int i=e; i<end.length(); i++)
				{
					temp = temp + Character.toString(end.charAt(i));
					path.add(temp);
					e++;
				}
			}
		}
		return path;
	}

	public static void main(String[] args) {
		String start = "qflopw";
		String end = "slap";
		ArrayList<String> path = modifyWordShortestPath(start, end);
		for(int i=0; i<path.size(); i++)
		{
			System.out.print(path.get(i));
			if(i < path.size()-1)
			{
				System.out.print(" --> ");
			}
		}

	}

}
