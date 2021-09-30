build:
	find . -name "*.java" > sources.txt
	javac -d bin @sources.txt

run:
	java -cp ./bin Main

exec:
	make build
	make run