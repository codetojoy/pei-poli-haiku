
import java.text.SimpleDateFormat 

def file = new File("./info.html")
def workingFile = new File("./tmp.info.html")

def pattern = "dd-MM-yyyy HH:mm";
def formatter = new SimpleDateFormat(pattern)
def timestamp = formatter.format(new Date())
def version = "v 0.9.1"

def VERSION_TOKEN = '__HAIKU_VERSION'
def TIMESTAMP_TOKEN = '__HAIKU_TIMESTAMP'

workingFile.withWriter { writer ->
    file.eachLine { line ->
        def newLine = line
        if (newLine.indexOf(VERSION_TOKEN) != -1) {
            newLine = newLine.replaceAll(VERSION_TOKEN, version)
        }
        if (newLine.indexOf(TIMESTAMP_TOKEN) != -1) {
            newLine = newLine.replaceAll(TIMESTAMP_TOKEN, timestamp)
        }
        workingFile = writer.write(newLine + "\n")
    }
}

println "Ready."
