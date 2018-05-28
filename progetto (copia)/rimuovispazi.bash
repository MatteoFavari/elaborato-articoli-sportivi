#!/bin/bash

POS=1
DUE=2
TRE=3
# scorre in nomi_report_csv.txt tutti i nomi dei file in reports
for nome_file in $(cat province); do
	
	if [ $POS -eq $DUE ]; then
		echo $nome_file | tr '[:lower:]' '[:upper:]'| sed 's/$/,/' >> province2.txt 

	fi

	if [ $POS -eq $TRE ]; then
		POS=0

	fi
	let "POS++"
	
done
