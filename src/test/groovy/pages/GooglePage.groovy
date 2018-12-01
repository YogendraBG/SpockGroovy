package pages

import geb.Page


class GooglePage extends Page {

    static url =""
    static at ={
        println("I am at google home page")
                title =="Google"
        $("div#SIvCob").text().contains('Google offered in')
        println("currenlty valided google Offered")

    }


    static content = {
        hindi{$("a",text:"हिन्दी").text()}
        println("currenlty valided hindi")
        hindi{$("a",text:"मराठी").text()}
        println("currenlty valided Marathi")
        image {
            $("img", alt: "Google")
        }
        searchTextField {
            $("input", name: "q")
        }
        searchButton {
            $("input", name: "btnK",type:"submit").first()
        }

    }
    def searchFor(String query) {
        searchTextField.value(query)
        searchButton.click()
    }




}
