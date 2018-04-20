#!/bin/bash

clear
if(( "$BahiadeLasMarianas" == 1))
then
echo -e "\e[96;107;1;7m  ___________________________________________________________________________________________________________  \e[0m"
echo -e "\e[96;107;1;7m |                                                                                                           | \e[0m"
echo -e "\e[96;107;1;7m |                                                                                                           | \e[0m"
echo -e "\e[96;107;1;7m |                                     BIENVENIDO A LA PREBEPLAYER                                           | \e[0m"
echo -e "\e[96;107;1;7m |                                                                                                           | \e[0m"
echo -e "\e[96;107;1;7m |                                                                                                           | \e[0m"
echo -e "\e[96;107m |                                                                                                           | \e[0m"
echo -e "\e[96;107m |	        Este programa te permitirá escuchar tus canciones desde la prebeshell                        | \e[0m"
echo -e "\e[96;107m |	        A continuación te mostramos una lista de opciones para manejar la prebeplayer...             | \e[0m"
echo -e "\e[96;107m |                          Por favor ingresa tu contraseña para poder continuar                             | \e[0m"
echo -e "\e[96;107m |___________________________________________________________________________________________________________| \e[0m"
echo -e "\e[96;107m                                                                                                               \e[0m"

read -p "Presiona [Enter]..."
sudo apt-get install mpg123
clear

function menu
{
echo -e "\e[97;101m		                    M E N Ú   P R I N C I P A L                                  \e[0m"
echo -e "\e[91;107m                                                                                                 \e[0m"
echo -e "\e[91;107m  Seleccione una opción                                                                          \e[0m"
echo -e "\e[91;107m 	1.- Reproducir una sola canción                                                          \e[0m"
echo -e "\e[91;107m 	2.- Reproducir todas las canciones de un directorio (en orden)                           \e[0m"
echo -e "\e[91;107m 	3.- Reproducir todas las canciones de un directorio aleatoriamente (de forma finita)     \e[0m"
echo -e "\e[91;107m 	4.- Reproducir todas las canciones de un directorio aleatoriamente (de forma infinita)   \e[0m"
echo -e "\e[91;107m 	5.- Salir                                                                                \e[0m"
echo -e "\e[91;107m  Opción [1-5]:                                                                                  \e[0m"
echo -e "\e[91;107m                                                                                                 \e[0m"
}

menu

function opciones
{
read opcion
case $opcion in
	1)
		clear
		echo -e "\e[45;37;4m                               SINGLE                                 \e[0m";
		echo -e "\e[45;37m                                                                      \e[0m";
		echo -e "\e[45;37m Ingresa la ruta y el nombre de la canción de la siguiente manera:    \e[0m";
		echo -e "\e[45;37;3m                    \e[1m /ruta/canción.mp3                                \e[0m";
		echo -e "\e[45;37m Posteriormente presiona la letra \"h\" para ver las teclas de control  \e[0m";
		echo -e "\e[45;37m ***Recuerda que actualmente estás en la ruta: \e[1m`pwd`\e[0m\e[45;37m***      \e[0m";
		echo -e "\e[45;37m                                                                      ";
		read cancion;
		echo -e "\e[0m";
		mpg123 --title -C $cancion
		clear;
		echo -e "--- FIN DE LA REPRODUCCIÓN --- \nPresione [Enter] para regresar al menú principal..."; read -p ""; clear; 
		menu; opciones;;


	2)
		clear
		echo -e "\e[45;37;4m                              IN ORDER                                \e[0m";
		echo -e "\e[45;37m                                                                      \e[0m";
                echo -e "\e[45;37m Ingresa la ruta del directorio de la siguiente manera:               \e[0m";
                echo -e "\e[45;37;3m           \e[1m /ruta/directorio_con_las_canciones                        \e[0m";
                echo -e "\e[45;37m                                                                      \e[0m";
		echo -e "\e[45;37m Posteriormente presiona la letra \"h\" para ver las teclas de control  \e[0m";
                echo -e "\e[45;37m ***Recuerda que actualmente estás en la ruta: \e[1m`pwd`\e[0m\e[45;37m***      \e[0m";
		echo -e "\e[45;37m                                                                      ";
		read carpeta;
		echo -e "\e[0m";
		mpg123 --title -C $carpeta/*;
		clear;
		echo -e "--- FIN DE LA REPRODUCCIÓN --- \nPresione [Enter] para regresar al menú principal..."; read -p ""; clear;
		menu; opciones;;



	3)
		clear
		echo -e "\e[45;37;4m                               SHUFFLE                                \e[0m";
		echo -e "\e[45;37m                                                                      \e[0m";
                echo -e "\e[45;37m Ingresa la ruta del directorio de la siguiente manera:               \e[0m";
		echo -e "\e[45;37;3m           \e[1m /ruta/directorio_con_las_canciones                        \e[0m";
                echo -e "\e[45;37m Posteriormente presiona la letra \"h\" para ver las teclas de control  \e[0m";
		echo -e "\e[45;37m ***Recuerda que actualmente estás en la ruta: \e[1m`pwd`\e[0m\e[45;37m***      \e[0m";
                echo -e "\e[45;37m                                                                      ";
                read carpeta;
                echo -e "\e[0m";
                mpg123 --title --shuffle -C $carpeta/*;
                clear;
                echo -e "--- FIN DE LA REPRODUCCIÓN --- \nPresione [Enter] para regresar al menú principal..."; read -p ""; clear;
                menu; opciones;;



	4)
		clear
		echo -e "\e[45;37;4m                               RANDOM                                 \e[0m";
		echo -e "\e[45;37m                                                                      \e[0m";
                echo -e "\e[45;37m Ingresa la ruta del directorio de la siguiente manera:               \e[0m";
		echo -e "\e[45;37;3m           \e[1m /ruta/directorio_con_las_canciones                        \e[0m";
                echo -e "\e[45;37m Posteriormente presiona la letra \"h\" para ver las teclas de control  \e[0m";
		echo -e "\e[45;37m ***Recuerda que actualmente estás en la ruta: \e[1m`pwd`\e[0m\e[45;37m***      \e[0m";
                echo -e "\e[45;37m                                                                      ";
                read carpeta;
                echo -e "\e[0m";
                mpg123 --title --random -C $carpeta/*;
                clear;
                echo -e "--- FIN DE LA REPRODUCCIÓN --- \nPresione [Enter] para regresar al menú principal..."; read -p ""; clear;
                menu; opciones;;




	5)	read -p "Presiona [Enter] para salir"; clear; exit;;

	*)
		echo "Opción incorrecta";
		read -p "Presiona [Enter]..."
		clear;
		menu; opciones;;

esac
}

opciones
fi
