#!/bin/bash
clear

if(( "$BahiadeLasMarianas" == 1))
then

function main_juego_ahorcado {
	clear
	echo -e "\e[46m\t\t\t\t\t\t\t\t\e[49m"
	echo -e "\e[46m\t\tBIENVENIDO AL JUEGO DEL AHORCADO\t\t\e[49m"
	echo -e "\e[46m\t\t\t\t\t\t\t\t\e[49m"
	echo -e "\n\e[44m\t¿Qué desea hacer?\t\t\t\t\t\e[49m\n\n\t1) Comenzar Juego\n\t2) Leer instrucciones\n\t3) Salir del juego\n"
	read -p "	" decision_j_ahorcado
	while [ $decision_j_ahorcado -ne 1 ] && [ $decision_j_ahorcado -ne 2 ] && [ $decision_j_ahorcado -ne 3 ]; do
		echo -e "\n\e[0;30m\e[43m\tERROR: opción no válida.\t\t\t\t\e[49m\e[0m"
		read -p "	Favor de volver a ingresar el dato: " decision_j_ahorcado
	done
	case $decision_j_ahorcado in
		1)
			juego_ahorcado;;
		2)
			ayuda_j_ahorcado;;
		3)
			clear;;
	esac
}

function ayuda_j_ahorcado {
clear
echo -e "\n\e[46m						JUEGO DEL AHORCADO						\e[49m"
echo -e "\n\e[0;36m\e[47m							AYUDA							"
echo -e "                                                               							"
echo -e "    Instrucciones de Juego:\e[0;30m\e[47m                                    							"
echo -e "	1. Se trata de un juego para dos personas.								"
echo -e "	   Una elige una palabra (retador) y la otra trata de adivinarla (adivinador).				"
echo -e "	2. Lo primero que se debe de hacer es escoger la palabra y escribirla cuando el programa lo solicite.	"
echo -e "	   Una vez hecho esto comenzará el juego.								"
echo -e "	3. El adivinador tendrá tantas oportunidades como letras existan.					"
echo -e "	4. Cada turno el adivinador deberá seleccionar una letra que considere forma parte de la palabra del	"
echo -e "	   juego.												"
echo -e "	5. Con cada vez que se acierte se irán mostrando en pantalla las letras de la palabra que ya se hayan	"
echo -e "	   adivinado.												"
echo -e "	   Las letras aún sin adivinar aparecer ocultas por un '*'.						"
echo -e "	6. Con cada error se irá dibujando en pantalla un muñeco que está en la horca.				"
echo -e "	7. Se tiene derecho a equivocarse un máximo de 10 veces.						"
echo -e "	   Después de eso se habrá completado el dibujo y el juego habrá terminado.				"
echo -e "	8. Gana el retador si se completa el dibujo del ahorcado.						"
echo -e "	9. Gana el adivinador si adivna la palabra antes del límite de errores.					"
echo -e "\e[0;36m\e[47m														"
echo -e "    Estategias de juego:\e[0;30m\e[47m											"
echo -e "	Retador:												"
echo -e "	1. Escoge palabras poco comunes o confusas. O palabras tan sencillas que no se suelan pensar.		"
echo -e "	2. Para evitar disgustos, evita palabras que dudes que la otra persona pueda conocer.			"
echo -e "	   Después de todo, a veces lo más sencillo es lo más complicado.					"
echo -e "	Adivinador:												"
echo -e "	1. Procura comenzar por letras relativamente comunes. Por ejemplo, las vocales.				"
echo -e "	2. Usa tus habilidades de deducción conociendo a la otra persona. ¿Qué clase de palabra pondría?	"
echo -e "                               	                                                    				\e[49m\e[0m"
read -p "	Presiona Enter para regresar al menú principal..." pausa
main_juego_ahorcado
}

function juego_ahorcado {
clear
echo -e "\n\e[46m\t\t\tJUEGO DEL AHORCADO\t\t\t\t\e[49m"
echo -e "\n\e[46m\t\tIngrese los nombres de los jugadores\t\t\t\e[49m\n"
echo -en "	\e[41m Jugador 1: \e[49m ";read -p "" jugador1
echo ""
echo -en "	\e[44m Jugador 2: \e[49m ";read -p "" jugador2
echo -e "\n\e[46m   $jugador1, por favor ingresa la palabra que deseas que adivine $jugador2\t"
echo -en "   (Sólo se aceptan minúculas): \e[49m"; read -p " " palabra
size_word=${#palabra}

errores=0
aciertos=0
palabra_r=(0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0)
letras_elegidas=(0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0)
turno=0

clear

while [ $errores -lt 10 ]; do
	echo -e "\n\e[46m\t\t\tJUEGO DEL AHORCADO\t\t\t\e[49m"
	case $errores in
		0)
			error0;;
		1)
			error1;;
		2)
			error2;;
		3)
			error3;;
		4)
			error4;;
		5)
			error5;;
		6)
			error6;;
		7)
			error7;;
		8)
			error8;;
		9)
			error9;;
	esac
	echo -en "\n\e[46m\tPalabra: "
	for ((posicion=0; posicion < $size_word; posicion++)); do
		if [ ${palabra_r[posicion]} -eq 0 ];then
			echo -en "*"
		else
			echo -en "${palabra:$posicion:1}"
		fi
	done
	echo -e "\t\e[49m\e[41m\tNúmero de errores: $errores\t"
	echo -en "\n\e[43m\tLetras elegidas:"
	if [ $turno -gt 0 ];then
		for ((posicion=0; posicion < turno; posicion++)); do
        	        echo -en " ${letras_elegidas[posicion]},"
        	done
	fi
	echo -e "\e[49m"
	echo -en "\e[46m	¿Qué letra desea elegir? \e[49m";read -p " " letra
	size_letra=${#letra}
	
	while [ $size_letra -ne 1 ]; do
		echo -e "\n\e[0;30m\e[43m\tERROR: sólo puedes escribir una letra\t\t\t\e[49m\e[0m"
		read -p "	Favor de volver a ingresar el dato: " letra
		size_letra=${#letra}
	done

	let turno=turno+1

	for ((posicion=0; posicion <= $turno; posicion++)); do
                if [ ${letras_elegidas[posicion]} = $letra ];then
                        echo -e "\n\e[0;30m\e[43m\tLo siento, pero ya has elegido esta letra. Ingresa otra, por favor\e[49m\e[0m"
			read -p "	" letra
			size_letra=${#letra}
			while [ $size_letra -ne 1 ]; do
                		echo -e "\n\e[0;30m\e[43m\tERROR: sólo puedes escribir una letra\t\t\t\e[43m\e[0m"
                		read -p "       Favor de volver a ingresar el dato: " letra
                		size_letra=${#letra}
        		done
			let posicion=0
                fi
        done

	letras_elegidas[turno-1]=$letra
	coincidencias=0
	for ((posicion=0; posicion < $size_word; posicion++)); do
	        if [ ${palabra:$posicion:1} = $letra ];then
	                let coincidencias=coincidencias+1
	        fi
	done

	if [ $coincidencias -eq 0 ];then
		let errores=errores+1
	else
		for ((posicion=0; posicion < $size_word; posicion++)); do
	        	if [ ${palabra:$posicion:1} = $letra ];then
	                	let palabra_r[posicion]=1
				let aciertos=aciertos+1
	        	fi
		done
	fi
		
	if [ $aciertos = $size_word ];then
		break;
	fi
	
	clear
done

if [ $errores -eq 10 ];then
	clear
	echo -e "\n\e[46m\t\t\tJUEGO DEL AHORCADO\t\t\t\e[49m"
	error10
	echo -e "\n\e[44m\t¡LO SIENTO, AMIGO! SE TE ACABARON LAS OPORTUNIDADES\t\e[49m\n\n\t"
	read -p "	Presione Enter para regresar al menú principal..." pausa
	main_juego_ahorcado
else
	clear
	echo -e "\n\e[46m\t\t\tJUEGO DEL AHORCADO\t\t\t  \e[49m"
	echo -e "\n\e[43m\t\t\t  ¡¡FELICIDADES!!\t\t\t  \n\t\t\t   ¡HAS GANADO!\t\t\t\t  \e[49m\n\n"
	read -p "	Presione Enter para regresar al menú principal..." pausa
	main_juego_ahorcado
fi
}

function error10 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||           o                 "
echo -e "\t||           o                 "
echo -e "\t||           o                 "
echo -e "\t||           o                 "
echo -e "\t||         __o____             "
echo -e "\t||        /_______\            "
echo -e "\t||       |_________|           "
echo -e "\t||        | **  **|            "
echo -e "\t||        |  x  x |            "
echo -e "\t||        |    >  |            "
echo -e "\t||         \  ~~ /             "
echo -e "\t||        _ooooooo_            "
echo -e "\t||      /          \           "
echo -e "\t||     /            \          "
echo -e "\t||     |  |       | |          "
echo -e "\t||     |__|_______|_|          "
echo -e "\t||      ww|       |w           "
echo -e "\t||______  |   |   |            "
echo -e "\t||    (_) |   |   |            "
echo -e "\t||____| | |___|___|            "
echo -e "\t||    | |  |  \  \             "
echo -e "\t||    | |   \_/\_/             "
echo -e "\t||    | |                      "
echo -e "\t||    |_|                      "
}
function error9 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||           o                 "
echo -e "\t||         __o____             "
echo -e "\t||        /_______\            "
echo -e "\t||       |_________|           "
echo -e "\t||        | **  **|            "
echo -e "\t||        |  0  0 |            "
echo -e "\t||        |    >  |            "
echo -e "\t||         \  ~~ /             "
echo -e "\t||       __o|___|o_            "
echo -e "\t||      /   ooooo  \           "
echo -e "\t||     /            \          "
echo -e "\t||     |  |       | |          "
echo -e "\t||     |__|_______|_|          "
echo -e "\t||      ww|       |w           "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error8 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||         _______             "
echo -e "\t||        /_______\            "
echo -e "\t||       |_________|           "
echo -e "\t||        | **  **|            "
echo -e "\t||        |  0  0 |            "
echo -e "\t||        |    >  |            "
echo -e "\t||         \  ~~ /             "
echo -e "\t||       ___|___|__            "
echo -e "\t||      /          \           "
echo -e "\t||     /            \          "
echo -e "\t||     |  |       | |          "
echo -e "\t||     |__|_______|_|          "
echo -e "\t||      ww|       |w           "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error7 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||       __________            "
echo -e "\t||      /          \           "
echo -e "\t||     /            \          "
echo -e "\t||     |  |       | |          "
echo -e "\t||     |__|_______|_|          "
echo -e "\t||      ww|       |w           "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error6 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||       _________             "
echo -e "\t||      /         |            "
echo -e "\t||     /          |            "
echo -e "\t||     |  |       |            "
echo -e "\t||     |__|_______|            "
echo -e "\t||      ww|       |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error5 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||         _______             "
echo -e "\t||        |       |            "
echo -e "\t||        |       |            "
echo -e "\t||        |       |            "
echo -e "\t||        |_______|            "
echo -e "\t||        |       |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error4 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||         _______             "
echo -e "\t||        |       |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |   |   |            "
echo -e "\t||        |___|___|_           "
echo -e "\t||________|_____|___|          "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error3 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||         ___                 "
echo -e "\t||        |   |                "
echo -e "\t||        |   |                "
echo -e "\t||        |   |                "
echo -e "\t||        |___|_               "
echo -e "\t||________|_____|___           "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error2 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||__________________           "
echo -e "\t||    (_)___________|          "
echo -e "\t||____|                        "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error1 {
echo -e "\t________________               "
echo -e "\t|O==========___/               "
echo -e "\t||          |_|                "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}
function error0 {
echo -e "\t__                             "
echo -e "\t|O                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
echo -e "\t||                             "
}

main_juego_ahorcado

fi
