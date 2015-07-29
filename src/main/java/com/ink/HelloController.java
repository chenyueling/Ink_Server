package com.ink;

import com.ink.common.QiNiuUtils;
import com.ink.entity.Message;
import com.ink.form.MessageForm;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

        //    'Uptoken_Url': 'http://localhost:8080/InkApp-Server/uptoken',
      //  'Domain': 'http://qiniu-plupload.qiniudn.com/'
		model.addAttribute("uptoken_url", "http://localhost:8080/InkApp-Server/uptoken");
        model.addAttribute("domain", "http://7ni3r6.com1.z0.glb.clouddn.com/");
		return "addMessage";
	}


    @RequestMapping(value = "uptoken",produces = { MediaType.APPLICATION_JSON_VALUE },method = RequestMethod.GET)
    public @ResponseBody
    Map<String,String> uptoken(ModelMap model) {
        Map map = new HashMap<String,String>();
        map.put("uptoken", QiNiuUtils.getUploadToken());
        return map;
    }

    /**
     *
     *
     * @param model
     */
    @RequestMapping(value = "/pets", method = RequestMethod.POST,consumes = {"application/x-www-form-urlencoded"})
    public void addPet(MessageForm id, Model model) {
        // implementation omitted
        System.out.println(id.getId());
        System.out.println(id.getHeadIcon());

    }


    @RequestMapping(value = "/pets", method = RequestMethod.GET)
    public void getPet(String id, Model model) {
        // implementation omitted
        System.out.println(id);
    }
}