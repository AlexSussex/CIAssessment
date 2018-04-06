echo "Please enter a file name to be searched "

read filename 
if [ -e ${filename} ]
then
	sudo mv ${filename} ${filename}.sh
	sudo chmod +x ${filename}.sh
fi
