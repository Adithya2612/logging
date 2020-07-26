package logger;
public class Construct
{
	int std,Area;
	Construct(int std,int area)
	{
		std=std;
		Area=area;
	}
	String costCal()
	{
		if(std==1)
			return("Construction Cost: "+Area*12000);
		else if(std==2)
			return("Construction Cost: "+Area*15000);
		else if(std==3)
			return("Construction Cost:"+Area*18000);
		else if(std==4)
			return("Construction Cost:"+Area*25000);
		else
			return("invalid");
	}
}
