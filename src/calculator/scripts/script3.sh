echo "The logged in users are: "
sudo who
echo "The network adresses are: "
sudo ifconfig
sudo touch script3LogFile.c

echo "Would you like to delete the current log file? Y/N"
read input

if [ ${input} == "Y" ]
then
	cat /dev/null > script3LogFile.c
	echo "The previous log file has been emptied"
fi
sudo echo "Logged in users are: " $(who) >> script3LogFile.c
sudo echo "The network adresses are: " $(ifconfig) -t >> script3LogFile.c
