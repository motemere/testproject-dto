.DEFAULT_GOAL := build

clean:
	./gradlew clean

build: clean
	./gradlew build -x test -x checkstyleMain -x checkstyleTest

lint:
	./gradlew checkstyleMain checkstyleTest

test:
	./gradlew test