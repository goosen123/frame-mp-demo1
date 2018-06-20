package com.goosen1.controller;

import com.google.code.kaptcha.Constants;
import com.goosen1.commons.utils.CheckUtil;

//import com.stylefeng.guns.common.controller.BaseController;
//import com.stylefeng.guns.common.exception.InvalidKaptchaException;
//import com.stylefeng.guns.common.node.MenuNode;
//import com.stylefeng.guns.core.log.LogManager;
//import com.stylefeng.guns.core.log.factory.LogTaskFactory;
//import com.stylefeng.guns.core.shiro.ShiroKit;
//import com.stylefeng.guns.core.shiro.ShiroUser;
//import com.stylefeng.guns.core.util.ToolUtil;
//import com.stylefeng.guns.modular.system.dao.MenuDao;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//import static com.stylefeng.guns.core.support.HttpKit.getIp;


/**
 * 登录控制器
 * @author Goosen
 * 2018年6月20日-下午4:02:48
 */
@Controller
public class LoginController extends BaseController {

//    @Autowired
//    MenuDao menuDao;

    /**
     * 跳转到主页
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        //获取菜单列表
//        List<Integer> roleList = ShiroKit.getUser().getRoleList();
//        List<MenuNode> menus = menuDao.getMenusByRoleIds(roleList);
//        List<MenuNode> titles = MenuNode.buildTitle(menus);
//        model.addAttribute("titles", titles);

        return "/index.html";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
//        if (ShiroKit.isAuthenticated() || ShiroKit.getUser() != null) {
//            return REDIRECT + "/";
//        } else {
//            return "/login.html";
//        }
    	return "";
    }

    /**
     * 点击登录执行的动作
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginVali() {
    	
    	String user = null;
    	CheckUtil.notNull(user, "user","不能空");

//        String username = super.getPara("username");
//        String password = super.getPara("password");
//        String kaptcha = super.getPara("kaptcha");
//
//        //验证验证码是否正确
//        String code = (String) super.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
//        if(ToolUtil.isEmpty(kaptcha) || !kaptcha.equals(code)){
//            throw new InvalidKaptchaException();
//        }
//
//        Subject currentUser = ShiroKit.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password.toCharArray());
//        token.setRememberMe(true);
//
//        currentUser.login(token);
//
//        ShiroUser shiroUser = ShiroKit.getUser();
//        super.getSession().setAttribute("shiroUser", shiroUser);
//
//        LogManager.me().executeLog(LogTaskFactory.loginLog(shiroUser.getId(), getIp()));
//
//        return REDIRECT + "/";
    	return "/user/hello";
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logOut() {
//        LogManager.me().executeLog(LogTaskFactory.exitLog(ShiroKit.getUser().getId(), getIp()));
//        ShiroKit.getSubject().logout();
//        super.getSession().invalidate();
//        return REDIRECT + "/login";
    	return "";
    }
}
