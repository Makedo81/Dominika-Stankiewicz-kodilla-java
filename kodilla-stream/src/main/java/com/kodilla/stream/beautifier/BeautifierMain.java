package com.kodilla.stream.beautifier;
public class BeautifierMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify ("Text to decorate",
                (textToDecorate) ->textToDecorate.toUpperCase());
        poemBeautifier.beautify ("Text to decorate",
                (textToDecorate) ->"ABC"+textToDecorate+"ABC");
        poemBeautifier.beautify ("Text to decorate",
                (textToDecorate) ->textToDecorate.replace("T","t"));
        poemBeautifier.beautify ("Text to decorate",
                (textToDecorate) ->textToDecorate.replace("","*").toLowerCase());
    }
}
