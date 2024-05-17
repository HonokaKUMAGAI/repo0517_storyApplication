package com.example.demo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProfileValidated {
	@NotBlank(message="何か入力してください")
	private String nickname = "";
	
	@Min(value = 0, message="0以上の数を入力してください")
    private int age = 0;

	@Size(min=1, max=20, message="1～20文字以内にしてください" )
	private String address = "";
	
	@Size(min=1, max=20, message="1～20文字以内にしてください" )
	private String favfood = "";
	
	@Size(min=1, max=20, message="1～20文字以内にしてください" )
	private String hobby = "";
	
//	@NotBlank(message="何か入力してください")
//	@Email(message="メールアドレスを入力してください") 
//	private String paramC = "";

}
