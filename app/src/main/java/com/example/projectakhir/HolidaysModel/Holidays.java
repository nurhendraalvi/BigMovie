package com.example.projectakhir.HolidaysModel;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Holidays{

	@SerializedName("holidays")
	private List<HolidaysItem> holidays;

	@SerializedName("query")
	private Query query;

	public void setHolidays(List<HolidaysItem> holidays){
		this.holidays = holidays;
	}

	public ArrayList<HolidaysItem> getHolidays(){
		return (ArrayList<HolidaysItem>) holidays;
	}

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	@Override
 	public String toString(){
		return 
			"Holidays{" + 
			"holidays = '" + holidays + '\'' + 
			",query = '" + query + '\'' + 
			"}";
		}
}