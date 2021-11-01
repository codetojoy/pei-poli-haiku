
package net.codetojoy.custom

class InfoMapper {
    static final def INDEX_DATE = 0
    static final def INDEX_HONOURIFIC = 1
    static final def INDEX_NAME = 2
    static final def INDEX_LINE1 = 3
    static final def INDEX_LINE2 = 4
    static final def INDEX_LINE3 = 5
    static final def INDEX_SOURCE = 6

    def mapLine(def line) {
        def info = null

        try {
            def date = line.getAt(INDEX_DATE)
            def honourific = line.getAt(INDEX_HONOURIFIC)
            def name = line.getAt(INDEX_NAME)
            def line1 = line.getAt(INDEX_LINE1)
            def line2 = line.getAt(INDEX_LINE2)
            def line3 = line.getAt(INDEX_LINE3)
            def source = line.getAt(INDEX_SOURCE)

            info = new Info(date: date, honourific: honourific, name: name, 
                            line1: line1, line2: line2, line3: line3, source: source)
        } catch(Exception ex) {
            System.err.println("TRACER caught ex : ${ex.message}")
        }

        return info
    }
}

