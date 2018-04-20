#!/bin/bash
if(( "$BahiadeLasMarianas" == 1))
then
function main_HF {
	clear
	echo -e "\n\e[43m	Bienvenido al menú de Hora y Fecha		\e[49m\n"
	echo -e "\e[45m	¿Qué desea hacer?				\e[49m"
	echo -e "	1)Ver hora del equipo (formato 24 horas)"
	echo -e "	2)Ver hora del equipo (formato 12 horas)"
	echo -e "	3)Ver fecha del equipo (número)"
	echo -e "	4)Ver fecha del equipo (letra)"
	echo -e "	5)Salir"
	read -p "	" decision_HF
	while [ $decision_HF -ne 1 ] && [ $decision_HF -ne 2 ] && [ $decision_HF -ne 3 ] && [ $decision_HF -ne 4 ] && [ $decision_HF -ne 5 ];do
		echo "ERROR: opción no válida. Favor de volver a ingresar en dato"
		read -p " " decision_HF
	done
	case $decision_HF in
		1)
			ver_H24;;
		2)
			ver_H12;;
		3)
			ver_FN;;
		4)
			ver_FL;;
		5)
			clear;;
	esac
}

function ver_H24 {
clear
        echo -e "\n\e[43m	       		Hora y Fecha              		\e[49m\n"
	echo -en "\n\t"
	date +"Son las %H horas con %M minutos y %S segundos"
	echo -en "\n\tPresione Enter para regresar al menú principal...";read -p "" pasaramenu
	main_HF
}

function ver_H12 {
clear
        echo -e "\n\e[43m	       		Hora y Fecha				\e[49m\n"
	echo -en "\n\t"
	date +"Son las %l horas con %M minutos y %S segundos %p"
	echo -en "\n\tPresione Enter para regresar al menú principal...";read -p "" pasaramenu
	main_HF
}

function ver_FN {
clear
        echo -e "\n\e[43m	       		Hora y Fecha      		        \e[49m\n"
	echo -en "\n\t"
	date +"%d/%m/%Y"
	echo -en "\n\tPresione Enter para regresar al menú principal...";read -p "" pasaramenu
	main_HF
}

function ver_FL {
clear
        echo -e "\n\e[43m	       		Hora y Fecha		              \e[49m\n"
	echo -en "\n\tHoy es el día "
	date +"%A %d de %B del año %Y"
	echo -en "\n\tPresione Enter para regresar al menú principal...";read -p "" pasaramenu
	main_HF
}

main_HF
fi
