package com.niit.kstart.controller;

import com.niit.kstart.bean.Card;
import com.niit.kstart.bean.Student;
import com.niit.kstart.dao.CardDao;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 99550 on 2018/9/6.
 */
@Controller
@Data
public class IndexController {
   // @RequestMapping(value = "index",method = RequestMethod.GET)
    @Resource
   private CardDao cardDao;
    @GetMapping("index")
    public  String index(ModelMap modelMap){
        List<Card> cardList = cardDao.getCardList();
        modelMap.addAttribute("cardList",cardList);
        return "index";
    }
}
