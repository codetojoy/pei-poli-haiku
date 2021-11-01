
package net.codetojoy.system.json

import groovy.json.*
import java.text.SimpleDateFormat

import static BuilderConstants.*

class JsonNormalBuilder extends BaseBuilder {

    def buildDate(def dateStr) {
       def oldFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);
       def newFormat = new SimpleDateFormat("dd MMMM, yyyy", Locale.US);
       def date = oldFormat.parse(dateStr)
       def newDateStr = newFormat.format(date)
       return newDateStr
    }

    def buildChildren(def infos) {
        def children = infos.collect { info ->
            def infoMap = [:]
            infoMap[DATE] = buildDate(info.date)
            infoMap[HONOURIFIC] = info.honourific
            infoMap[NAME] = info.name
            infoMap[LINE1] = info.line1
            infoMap[LINE2] = info.line2
            infoMap[LINE3] = info.line3
            infoMap[SOURCE] = info.source
            return infoMap
        }

        return children
    }

    def buildNormal(def infos) {
        def children = buildChildren(infos)
        def jsonMap = ["name" : "haikus", "children" : children]
        def json = JsonOutput.toJson(jsonMap)
        return JsonOutput.prettyPrint(json)
    }
}
