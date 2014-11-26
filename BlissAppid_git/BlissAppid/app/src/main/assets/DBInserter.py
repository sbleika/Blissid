import sqlite3;

def find_nth(string, sub, n):
    start = string.find(sub)
    while start >= 0 and n > 1:
       start = string.find(sub, start+len(sub))
       n -= 1
    return start

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
    startOfTableName = find_nth(currentLine,"/",6)+1;
    tableName = currentLine[startOfTableName:startOfTableName+3]
    print tableName
    
    #blob=unicode("readfile(\""+currentLine+"\")")
    imageFile=open(currentLine)
    blob=imageFile.read()


    print currentLine
    print name
    
    cursor.execute ("INSERT INTO bigtable values (?,?,?);", (tableName,sqlite3.Binary(blob),name))
    currentLine = nafnaListi.readline()
   


conn.commit()

conn.close()
    
