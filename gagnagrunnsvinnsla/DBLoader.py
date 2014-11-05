import sqlite3;

#sql connection stuff
conn=sqlite3.connect("symbols.db")
cursor=conn.cursor()

#create sql database
cursor.execute(" CREATE TABLE symbols (name text, image blob);");
cursor.execute(" CREATE TABLE tables (name text, image text);");
cursor.execute(" CREATE TABLE tableSymbols (tablename text, symbolname text, posX int, posY int);");


nafnaListi = open("nofn.txt")




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
    
    cursor.execute ("INSERT INTO symbols values (?,?);", (name,sqlite3.Binary(blob)))
    currentLine = nafnaListi.readline()
   


conn.commit()

conn.close()
    
