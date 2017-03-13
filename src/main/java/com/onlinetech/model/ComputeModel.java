package com.onlinetech.model;

public class ComputeModel {
	private double firstinput;
	private double secondinput;
	private String type;
	private boolean status;
	private String result;
	private String message;

	public double getFirstinput()
	{
			return this.firstinput;
	}
	
	public void setFirstinput(double firstinput)
	{
			this.firstinput = firstinput;
	}

	public double getSecondinput()
	{
			return this.secondinput;
	}
	
	public void setSecondinput(double secondinput)
	{
			this.secondinput = secondinput;
	}
	
	public String getType()
	{
			return this.type;
	}
	
	public void setType(String type)
	{
			this.type = type;
	}
	
	public String getResult()
	{
			return this.result;
	}
	
	public void setResult(String result)
	{
			this.result = result;
	}
	
	public boolean getStatus()
	{
			return this.status;
	}
	
	public void setStatus(boolean status)
	{
			this.status = status;
	}
	
	public String getMessage()
	{
			return this.message;
	}
	
	public void setMessage(String message)
	{
			this.message = message;
	}

}
