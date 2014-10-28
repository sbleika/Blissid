import sqlite3;

#sql connection stuff
conn=sqlite3.connect("symbols.db")
cursor=conn.cursor()

#create sql database
cursor.execute(" CREATE TABLE symbols (name text, image blob);");
cursor.execute(" CREATE TABLE tables (name text, image blob);");
cursor.execute(" CREATE TABLE tableSymbols (tablename text, symbolname text, posX int, posY int);");


nafnaListi = open("nofn.txt")



currentLine = nafnaListi.readline()
#inserts into symbols file
while currentLine:
    startOfName=currentLine.rfind("/")+1
    endOfName=currentLine.rfind(".")
    name = unicode(currentLine[startOfName:endOfName])
    
    blob=unicode("readfile(\""+currentLine+"\")")
    print currentLine
    print name
    
    cursor.execute ("INSERT INTO symbols values (?,?);", (name,blob))
    currentLine = nafnaListi.readline()


conn.commit()

conn.close()
    
