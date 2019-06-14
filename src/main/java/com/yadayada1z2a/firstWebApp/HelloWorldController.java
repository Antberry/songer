package com.yadayada1z2a.firstWebApp;

import org.springframework.web.bind.annotation.*;


@RestController
    public class HelloWorldController {
        @GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }

        @GetMapping ("/capitalize/{text}")
        public String upperCase(@PathVariable String text){
            return text.toUpperCase();
        }

        @RequestMapping(value = "/reverse", method = RequestMethod.GET)
        public @ResponseBody String strReverse(@RequestParam("sentence") String sentence){
            StringBuilder reversedStr = new StringBuilder();
            String[] splitSent = sentence.split(" ");
            for (int i = splitSent.length - 1; i >= 0; i--){
                reversedStr.append(splitSent[i]);
                reversedStr.append(" ");
            }
            return reversedStr.toString().trim();
        }


}

