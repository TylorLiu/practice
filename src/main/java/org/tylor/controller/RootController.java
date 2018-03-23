package org.tylor.controller;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tylor.common.ResponseCode;
import org.tylor.common.ServerResponse;
import org.tylor.dto.UserDto;
import org.tylor.service.UserService;

/**
 * @author liubin10  2018/3/19
 */
@Controller
public class RootController {

//    @GetMapping("/")
//    public String index(Model model) {
//        return "/index.html";
//    }
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("/login/{userName}")
    @ResponseBody
    public ServerResponse<Void> login(@PathVariable String userName,@RequestParam String ticket,HttpSession session,HttpServletRequest request){
        if(userService.checkUserPassword(userName,ticket)){
            session=request.getSession(true);
            session.setAttribute("user",userName);
            //本地用户类型为1
            session.setAttribute("type",1);
            return new ServerResponse();
        }else {
            return  new ServerResponse(ResponseCode.FAIL);
        }
    }

}
