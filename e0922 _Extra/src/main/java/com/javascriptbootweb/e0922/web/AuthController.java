package com.javascriptbootweb.e0922.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RestController = クライアントがサイトにリクエストを送りRestControllerはリクエストの処理を行い、データを返却します。
//RequestMapping =  Spring MVC のコントローラに付与して、リクエスト URL に対して、どのメソッドが処理を実行するか定義するアノテーション(注釈)
@RequestMapping(value = "/auth", method = RequestMethod.GET)
public class AuthController {


  // http://localhost:8080/auth/
  // 10行目にauthがあるから16行目にauthを追加で書く必要はない
  @RequestMapping(value = "/", method = RequestMethod.GET)
   public String def() {
     return "<h1 style='color: red'>AUTH PAGE</h1>";
   }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login() {
     return "<h1>LOGIN PAGE</h1>";
   }

   // http://localhost:8080/auth/signup
   @RequestMapping(value = "/signup", method = RequestMethod.GET)
   public String signup() {
     return "<h1>SIGNUP PAGE</h1>";
   }
}
