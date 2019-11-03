package demo.conteoller;


import demo.entity.Result;
import demo.entity.StatusCode;
import demo.pojo.Label;
import demo.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询所有的标签
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Label> list =  labelService.findAll();
        return  new Result(true, StatusCode.OK,"查询成功!",list);
    }

}