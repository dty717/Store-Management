package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import domain.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.ThingService;

import java.io.File;
import java.io.IOException;

@Controller
public class HelloWorldController {
    @Autowired
    Gson gson;

    @RequestMapping(value = { "/uploadThing" }, method = RequestMethod.GET)
    public String uplaodThing(@RequestParam("name")String name,@RequestParam("location")int position,@RequestParam(value = "use", required = false,defaultValue = "1")int use,
     @RequestParam(value = "count", required = false,defaultValue = "1")int count,@RequestParam(value="tag", required = false)String tag,@RequestParam(value = "file", required = false) MultipartFile multipartFile) {
        String orgName = "";
        thingService.insertThing(new Thing(name,position,orgName,use==1,count,tag));
//        multipartFile.getOriginalFilename();
//
//        String filePath = "C:\\Users\\xqy\\Desktop\\picture\\" + orgName;
//        File dest = new File(filePath);
//        try {
//            multipartFile.transferTo(dest);
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//            return "File uploaded failed:" + orgName;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "File uploaded failed:" + orgName;
//        }
         return "index.html";
    }
    @RequestMapping(value = { "get/tags" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public String getTags(HttpServletResponse response) {
        return gson.toJson(thingService.getTags());
    }

    @Autowired
    private ThingService thingService;
    @RequestMapping(value = { "get/location" }, method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public String getLocation(HttpServletResponse response) {
        return gson.toJson(thingService.getLocation());
    }
    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String homePage() {

        return "redirect:/index.html";
    }

//    @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public String adminPage(ModelMap model) {
//        model.addAttribute("user", getPrincipal());
//        return "admin";
//    }
//
//    @RequestMapping(value = "/db", method = RequestMethod.GET)
//    public String dbaPage(ModelMap model) {
//        model.addAttribute("user", getPrincipal());
//        return "dba";
//    }
//
//    @RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
//    public String accessDeniedPage(ModelMap model) {
//        model.addAttribute("user", getPrincipal());
//        return "accessDenied";
//    }
//
//    @RequestMapping(value="/logout", method = RequestMethod.GET)
//    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null){
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        return "redirect:/login?logout";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(ModelMap model) {
//        return "login";
//    }
//
//    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
//    public String loginerror(ModelMap model) {
//        model.addAttribute("error", "true");
//        return "denied";
//    }
//
//    private String getPrincipal(){
//        String userName = null;
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        if (principal instanceof UserDetails) {
//            userName = ((UserDetails)principal).getUsername();
//        } else {
//            userName = principal.toString();
//        }
//        return userName;
//    }

}