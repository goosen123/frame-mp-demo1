package com.goosen1.controller;

import com.goosen1.commons.annotations.GetMapping;
import com.goosen1.commons.annotations.ResponseResult;
import com.goosen1.service.DictService;
import com.goosen1.service.UserService;
//import com.stylefeng.guns.common.annotion.Permission;
//import com.stylefeng.guns.common.annotion.log.BussinessLog;
//import com.stylefeng.guns.common.constant.Const;
//import com.stylefeng.guns.common.constant.factory.ConstantFactory;
//import com.stylefeng.guns.common.controller.BaseController;
//import com.stylefeng.guns.common.exception.BizExceptionEnum;
//import com.stylefeng.guns.common.exception.BussinessException;
//import com.stylefeng.guns.common.persistence.dao.DictMapper;
//import com.stylefeng.guns.common.persistence.model.Dict;
//import com.stylefeng.guns.core.log.LogObjectHolder;
//import com.stylefeng.guns.core.util.ToolUtil;
//import com.stylefeng.guns.modular.system.service.IDictService;
//import com.stylefeng.guns.modular.system.warpper.DictWarpper;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字典控制器
 * @author Goosen
 * 2018年6月21日-下午4:57:24
 */
@Controller
@RequestMapping(value="dict")
public class DictController extends BaseController {

	@Autowired
	private DictService dictService;
    
    private String PREFIX = "/system/dict/";

    /**
     * 跳转到字典管理首页
     */
    @RequestMapping(value = {""},method=RequestMethod.GET)
    public String index() {
        return PREFIX + "dict";
    }

    /**
     * 跳转到添加字典
     */
    @RequestMapping(value = {"dict_add"},method=RequestMethod.GET)
    public String deptAdd() {
        return PREFIX + "dict_add";
    }

//    /**
//     * 跳转到修改字典
//     */
//    @Permission(Const.ADMIN_NAME)
//    @RequestMapping("/dict_edit/{dictId}")
//    public String deptUpdate(@PathVariable Integer dictId, Model model) {
//        Dict dict = dictMapper.selectByPrimaryKey(dictId);
//        model.addAttribute("dict", dict);
//        Dict queryModel = new Dict();
//        dict.setPid(dictId);
//        List<Dict> subDicts = dictMapper.select(queryModel);
//        model.addAttribute("subDicts", subDicts);
//        LogObjectHolder.me().set(dict);
//        return PREFIX + "dict_edit.html";
//    }

    /**
     * 新增字典
     *
     * @param dictValues 格式例如   "1:启用;2:禁用;3:冻结"
     */
//    @BussinessLog(value = "添加字典记录", key = "dictName,dictValues", dict = com.stylefeng.guns.common.constant.Dict.DictMap)
    @RequestMapping(value = "/add")
//    @Permission(Const.ADMIN_NAME)
    @ResponseBody
//    @ResponseResult
//	@RequestMapping(value = {"addUser4"},method=RequestMethod.POST)
//	@Transactional(readOnly = false)
    public Object add(String dictName, String dictValues) {
//        if (ToolUtil.isOneEmpty(dictName, dictValues)) {
//            throw new BussinessException(BizExceptionEnum.REQUEST_NULL);
//        }
//        dictService.addDict(dictName, dictValues);
    	
    	System.out.println("dictName:"+dictName);
    	System.out.println("dictValues:"+dictValues);
    	//dictName:订单状态
    	//dictValues:1:未付款;2:待发货;
    	
    	Map result = new HashMap();
    	result.put("code", 200);
    	result.put("message", "操作成功");
        return result;
    }

    /**
     * 获取所有字典列表
     */
//    @RequestMapping(value = "/list")
//    @Permission(Const.ADMIN_NAME)
//    @ResponseBody
    @GetMapping
	@RequestMapping(value = {"list"},method=RequestMethod.GET)
    public Object list() {
//        List<Map<String, Object>> list = dictMapper.list(condition);
//        return super.warpObject(new DictWarpper(list));
    	return new ArrayList<Map<String, Object>>();
    }

//    /**
//     * 字典详情
//     */
//    @RequestMapping(value = "/detail/{dictId}")
//    @Permission(Const.ADMIN_NAME)
//    @ResponseBody
//    public Object detail(@PathVariable("dictId") Integer dictId) {
//        return dictMapper.selectByPrimaryKey(dictId);
//    }

//    /**
//     * 修改字典
//     */
//    @BussinessLog(value = "修改字典", key = "dictName,dictValues", dict = com.stylefeng.guns.common.constant.Dict.DictMap)
//    @RequestMapping(value = "/update")
//    @Permission(Const.ADMIN_NAME)
//    @ResponseBody
//    public Object update(Integer dictId, String dictName, String dictValues) {
//        if (ToolUtil.isOneEmpty(dictId, dictName, dictValues)) {
//            throw new BussinessException(BizExceptionEnum.REQUEST_NULL);
//        }
//        dictService.editDict(dictId, dictName, dictValues);
//        return super.SUCCESS_TIP;
//    }

//    /**
//     * 删除字典记录
//     */
//    @BussinessLog(value = "删除字典记录", key = "dictId", dict = com.stylefeng.guns.common.constant.Dict.DeleteDict)
//    @RequestMapping(value = "/delete")
//    @Permission(Const.ADMIN_NAME)
//    @ResponseBody
//    public Object delete(@RequestParam Integer dictId) {
//
//        //缓存被删除的名称
//        LogObjectHolder.me().set(ConstantFactory.me().getDictName(dictId));
//
//        dictService.delteDict(dictId);
//        return SUCCESS_TIP;
//    }

}
