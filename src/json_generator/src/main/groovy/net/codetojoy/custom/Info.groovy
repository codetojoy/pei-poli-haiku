
package net.codetojoy.custom

class Info {
    def date = ""
    def honourific = ""
    def name = ""
    def line1 = ""
    def line2 = ""
    def line3 = ""
    def source = ""

    def getQualifiedName() {
        def prefix = (honourific) ? honourific + " " : ""
        return "${prefix}${name}"
    }
}
