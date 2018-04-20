#!/bin/bash

if(( "$BahiadeLasMarianas" == 1))
then
	clear
	YELLOW='\033[1;33m'
	echo -e "${YELLOW}Tienes 2 monedas"
	monedas=2
	tiradas=0
	DIFF=$((2))
	RANDOM=$$
	echo "		Si presionas el boton hay 50% de probabilidad de duplicar"
	echo "		         tus monedas y otro 50% de perder todo"
	echo "			     Se tira cinco veces la moneda"
	function juego
	{
	echo "¿Apuestas? (y/whatever key you want to press)" | pokemonsay -p Blastoise
	read response
	if [ "$response" = "y" ]
	then
		valor=$(($RANDOM%$DIFF))
		if(("$tiradas" == 5))
		then
			echo "Tus monedas son $monedas" | pokemon -p Squirtle
		else
			if(("$valor" == 1))
			then
				monedas=$(($monedas * 2))
				tiradas=$(($tiradas + 1))
				echo "Tus monedas ahora son $monedas"
				juego
			else
				echo "Te quedaste sin monedas :C" | pokemonsay -p Squirtle
			fi
		fi
	else
		echo "Te quedaste con $monedas monedas " | pokemonsay -p Blastoise
	fi
	}
	juego
fi
