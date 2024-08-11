package com.demo.learnJson;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.demo.dto.DeDupRes;
import com.demo.dto.Person;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonArrayAndJsonObject {

	public static void main(String[] args) { 
		
		JSONObject obj1 = new JSONObject();
    obj1.put("name", "John");
    obj1.put("age", 30);

    JSONObject obj2 = new JSONObject();
    obj2.put("name", "Jane");
    obj2.put("age", 25);

    JSONObject obj3 = new JSONObject();
    obj3.put("name", "Joshwin");
    obj3.put("age", 26);
    
    JSONObject obj4 = new JSONObject();
    obj4.put("name", "arun");
    obj4.put("age", 32);
    Person[] peopleArray = {
            new Person("Joshwin", 30),
            new Person("Arun", 25)
        };
    
    DeDupRes deDupResObj = new DeDupRes();
    deDupResObj.setPeopleArray(peopleArray);


    // Create a JSON array and add objects to it
    JSONArray jsonArray = new JSONArray();
    jsonArray.add(obj1);
    jsonArray.add(obj2);
    jsonArray.add(obj3);
    jsonArray.add(obj4);
    System.out.println(jsonArray.toJSONString());
    JSONObject jobj = (JSONObject)jsonArray.get(0);
    System.out.println(jobj);
    System.out.println("jobj name is "+jobj.get("name"));
    
    List<Integer> indices = (List<Integer>)IntStream.range(0, jsonArray.size()).filter(i->{
    											JSONObject jsonobj = (JSONObject)jsonArray.get(i);
    												String name = (String)jsonobj.get("name");
    													return Arrays.stream(deDupResObj.getPeopleArray())
    															.map(Person::getName)
    																.noneMatch(name::equals);
    																	}).boxed()
    																		.collect(Collectors.toList());
    
    //System.out.println("indices"+(!indices.isEmpty() && indices.size()>0 ? indices.stream().map : ""));
    
    
    System.out.println(Arrays.stream(deDupResObj.getPeopleArray()).map(Person::getAge).collect(Collectors.toList()));
     
//    00 01 02
//    10 11 12
//    20 21 22
	}

}
