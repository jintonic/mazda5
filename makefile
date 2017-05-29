DAT=$(wildcard *.sc)
TXT=$(DAT:.sc=.txt)
PDF=fuel.pdf cost.pdf #mileage.pdf oil.pdf

.PHONY: clean

mazda5.pdf: $(PDF)
	gs -sDEVICE=pdfwrite -o $@ $^
	rm -f $^ *~

cost.pdf: cost.R cost.dat
	Rscript $<

#mileage.pdf: oil.R oil.txt
#	Rscript $<

%.pdf:%.txt
	gnuplot $*.gnu

%.txt: %.sc
	sc -W % $< 1> $@ 2> /dev/null

cost.dat: $(TXT)
	tail -q -n 1 $^ | awk '{print $$NF}' > $@

clean:
	rm -f `cat .gitignore`
