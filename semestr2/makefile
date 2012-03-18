JAVA_PATH=c:/program files/Java/jdk1.7.0/bin/
#JAVAC=$(JAVA_PATH)javac
#JAVA= $(JAVA_PATH)java
JAVAC=javac
JAVA=java

PROGRAMS=hello hello_1 swing_test

all: $(PROGRAMS)
	@echo "done"

%: %.class
	@echo "run program " $@ " " $<
	$(JAVA) $@

%.class: %.java
	@echo "compile program " $@ " " $<
	$(JAVAC) $<

.PHONY: clean
clean: 
	@-rm */*.class
