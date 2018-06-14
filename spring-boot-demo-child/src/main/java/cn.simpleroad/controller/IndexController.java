package cn.simpleroad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

	@GetMapping("/")
    public String getString() {
        return "Hi~";
    }

    @GetMapping("/map")
    @ResponseBody
    public Map getDataFromMap() {
	    Map map = new HashMap<>();
        map.put("id",1);
        map.put("name","hi~");
        return map;
    }

    @GetMapping("/list")
    @ResponseBody
    public List getDataFromList() {
        List list = new ArrayList<>();

        Map map = new HashMap<>();
        map.put("id",1);
        map.put("name","hi~");

        list.add(map);

        map.put("id",2);
        map.put("name","你好~");
        list.add(map);
        return list;
    }
	
}
