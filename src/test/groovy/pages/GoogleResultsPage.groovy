package pages

import geb.Page

class GoogleResultsPage extends Page {
    static url =""
    static at = {
        title.contains('Google Search')
        $("div.hdtb-mitem.hdtb-msel.hdtb-imb").text()=="All"
    }
    static content={
        firstResult{
            $("h3.r").first().text()
        }
    }
    def getFirstResultLink(){
        println firstResult
    }
}
