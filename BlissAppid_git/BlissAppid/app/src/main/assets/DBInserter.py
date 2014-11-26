import sqlite3;

#sql connection stuff
conn=sqlite3.connect("symbols.db")
cursor=conn.cursor()

#create sql database


nafnaListi = open("list")




currentLine = nafnaListi.readline()

#inserts into symbols file
while currentLine:
    currentLine=currentLine.rstrip()
    startOfName=currentLine.rfind("/")+1
    endOfName=currentLine.rfind(".")
    name = unicode(currentLine[startOfName:endOfName])
    
    #blob=unicode("readfile(\""+currentLine+"\")")
    imageFile=open(currentLine)
    blob=imageFile.read()


    print currentLine
    print name
    
    cursor.execute ("INSERT INTO symbols values (1.1,?,?);", (sqlite3.Binary(blob)),name)
    currentLine = nafnaListi.readline()
   


conn.commit()

conn.close()
    
