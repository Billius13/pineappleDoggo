all:
	javac *.java

clean: 
	rm *.class

backup:
	tar -cvzf Flowery.tar.gz *.java

cleanBU:
	rm Flowery.tar.gz
push:
	
	git add .
	git commit -m date
	git push origin master
