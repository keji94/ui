package com.keji;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keji on 2017/11/11.
 */
@Controller
public class IndexController {

    @RequestMapping("/{page}")
    public String index(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/admin/{page}")
    public String adminIndex(@PathVariable String page) {
        return "/admin/"+page;
    }



    @ResponseBody
    @RequestMapping("/getOptions")
    public List<Option> getOptions() {
        ArrayList<Option> options = new ArrayList<>();
        options.add(new Option("key1", "value1"));
        options.add(new Option("key2", "value2"));
        options.add(new Option("key3", "value3"));
        return options;
    }

}

@Data
class Option{

    private String key;

    private String value;

    Option(String key, String value) {
        this.key = key;
        this.value = value;
    }

}
