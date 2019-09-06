package kr.co.sist.football.member.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.sist.football.common.model.dto.TeamInfo;
import kr.co.sist.football.member.model.dao.MemberDAO;
import kr.co.sist.football.member.model.dto.MemberDTO;
import kr.co.sist.football.member.model.service.MemberServiceImpl;

@Controller
@RequestMapping("/member")
public class MemberController {
	String userId;
	MemberDAO memberDAO = new MemberDAO();
	private static final int LOGIN_SUCCESS = 1;
	private static final int LOGIN_FAIL = 0;

 	private MemberServiceImpl memberServiceImpl;
	@Autowired
	public MemberController(MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}

 	@RequestMapping(value = "/insertmember", method = RequestMethod.GET)
	public String insertMember(MemberDTO memberDTO , Model model) {

 		return "member/register";
	}

 	@RequestMapping(value = "/insertmember", method = RequestMethod.POST) 
	public String insertMember(MultipartHttpServletRequest multipartRequest, MemberDTO memberDTO) throws FileNotFoundException, IOException {
		System.out.println(memberDTO); 
		MultipartFile multi = multipartRequest.getFile("uploadname"); 
		String picPath = multi.getOriginalFilename(); 
		System.out.println(memberDTO); 

 		if (picPath != null && !picPath.equals("")) { 
			String uploadPath = multipartRequest.getRealPath("/") + "filesave";
			System.out.println(uploadPath);
			FileCopyUtils.copy(multi.getInputStream(),new FileOutputStream(uploadPath + "/" + multi.getOriginalFilename()));
			memberDTO.setPicPath(picPath);
		} else { 
			memberDTO.setPicPath("");
		}
		memberServiceImpl.insertMemberInfo(memberDTO);

 		return "index";
	}

 	@RequestMapping(value = "/loginmember", method = RequestMethod.GET)
	public String loginMember(MemberDTO memberDTO , Model model) {

 		return "member/login";
	}


 	@RequestMapping(value = "/loginmember", method = RequestMethod.POST)
	public String loginMember(HttpServletRequest request) {
		HttpSession session = request.getSession();
		userId = request.getParameter("id");
		String password = request.getParameter("password");
		int x =  memberServiceImpl.userCheck(userId, password);

 		if(x == LOGIN_SUCCESS) {
			session.setAttribute("userId", userId);
			return "index";
		} else if (x == LOGIN_FAIL) {
			return "member/login";
		} else if (x == -1) {
			return "member/login";
		}
		return null;
	}

 	@RequestMapping(value="/logout", method= RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		request.getSession(false).invalidate();
		return "index";
	}

 }
