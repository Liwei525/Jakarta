package com.example.demo.base;

import com.alibaba.fastjson.JSONException;
import com.example.demo.base.exception.GetFailedException;
import com.example.demo.base.exception.PostFailedException;
import com.example.demo.base.response.Response;
import com.example.demo.entity.vo.RuiUserVO;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by CHENGRui on 2017/8/3.
 */
@ControllerAdvice
public class UserInfoAdvice {

	protected static final Logger LOGGER = Logger.getLogger(UserInfoAdvice.class);

	@ModelAttribute("user")
	public RuiUserVO getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		RuiUserVO user = new RuiUserVO();

		try {
			Subject subject = SecurityUtils.getSubject();
			if (subject == null || subject.getPrincipals() == null) {
				return null;
			}
			List list = subject.getPrincipals().asList();
			if (CollectionUtils.isEmpty(list)) {
				return null;
			}
			user.setUserName(list.get(0).toString());
//			Map<String, Object> info = (Map<String, Object>) list.get(0);
//			user.setUserName(String.valueOf(info.get("userName")));
//			user.setUserStatus(Integer.valueOf(String.valueOf(info.get("userStatus"))));
//			user.setNickname(String.valueOf(info.get("nickname")));
//			user.setId(Integer.valueOf(String.valueOf(info.get("id"))));
		} catch (Exception e) {
			LOGGER.error("something error,please check it", e);
			throw new JSONException(e.toString());
		}
//		StringBuilder sbUrl = new StringBuilder(1024);
//		String url = sbUrl.append(",").append(request.getRequestURI()).append(",").toString();
		return user;
	}

	@ExceptionHandler(GetFailedException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public String handleGetFailedException(){
		return "noPrivilege";
	}

	@ExceptionHandler(PostFailedException.class)
	@ResponseBody
	public Response handlePostFailedException(HttpServletRequest req, Throwable exception) {
		Response response = Response.fail(exception.getMessage());
		return response;
	}
}