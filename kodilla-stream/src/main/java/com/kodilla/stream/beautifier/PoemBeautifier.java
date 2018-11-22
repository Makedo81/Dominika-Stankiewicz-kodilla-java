package com.kodilla.stream.beautifier;

public class PoemBeautifier{

   public void beautify(String textToDecorate,PoemDecorator poemDecorator){
       String beautifiedText = poemDecorator.decorate(textToDecorate);
       System.out.println (beautifiedText);
       //return beautifiedText;
   }
}
