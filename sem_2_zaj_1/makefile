

JAVAC=javac
JAVA=java

all: hello swt
	@echo "done"


%: %.class
	$(JAVA) $@

%.class: %.java
	$(JAVAC) $< 
