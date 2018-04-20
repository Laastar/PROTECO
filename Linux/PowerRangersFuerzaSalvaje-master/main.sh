#!/bin/bash
#service=kakodaimon.service
export BahiadeLasMarianas=1
login()
{
	cd /home/laastar/PoweRangersFuerzaSalvaje
	clear
	./prueba.sh
	export BahiadeLasMarianas=1
	if [ "$BahiadeLasMarianas" = 1 ]
	then
		retval=0
	else
		retval=1
	fi
	return "$retval"
}

echo "Initializing login interface..."
sleep 5
echo "Waiting for master..."
sleep 3
echo "Deploying scouts..."
sleep 2
echo "Landing..."
sleep 2
echo "Brace for impact..."
sleep 3
login
retval=$?
if [ "$retval" = "0" ]
then
	echo "Proceeding..."
else
	echo "Permission denied"
	echo "System shuting down"
	export BahiadeLasMarianas=0
	exit
fi
sleep 5
clear
echo "Bienvenido a la Bahia de las Marianas" | cowsay -f dragon | lolcat
PS1='\e[0;36m\H.\u\e[m \e[0;31m@\e[m \e[0;34m\W\e[m \e[0;31m@\e[m \e[0;35m\T\e[m\n\e[0;36mInsert commands:\e[m'
#gnome-terminal & disown
#sh /home/laastar/PowerRangersFuerzaSalvaje/BlueSharkZord.sh
