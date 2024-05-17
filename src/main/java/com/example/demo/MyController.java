package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@GetMapping("/")
	public String getIndex(Model model) {

		User u = new User();
		u.setName("ほのっち"); //ここにはあとでログインしてるユーザのお名前を入れるようにしとく
		u.setBirthyear(2001);//ここにはあとでログインユーザの最初のアカウント設定で入れた生年月日がセットされるようにしとく

		model.addAttribute("user", u);
		//		model.addAttribute("profileValidated", new ProfileValidated());

		return "index";

	}

	@PostMapping("/submit-profile")
	public String getSubmitProfile(
			@RequestParam("nickname") String nickname,
			@RequestParam("age") int age,
			@RequestParam("address") String address,
			@RequestParam("favfood") String favfood,
			@RequestParam("hobby") String hobby,
			Model model) {

		model.addAttribute("nickname", nickname);
		model.addAttribute("age", age);
		model.addAttribute("address", address);
		model.addAttribute("favfood", favfood);
		model.addAttribute("hobby", hobby);
		// 確認画面を表示するHTMLテンプレートにリダイレクトする
		return "submit-profile";
	}

	@PostMapping("/story_start")
	public String getStoryStart(Model model) {

		return "story_start";
	}
}
