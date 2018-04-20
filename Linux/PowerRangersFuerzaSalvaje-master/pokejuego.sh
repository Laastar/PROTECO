
#!/bin/bash
if(( "$BahiadeLasMarianas" == 1))
then
clear

echo -e "\e[37;43;1m  _____________________________________________________________________________________________________________  \e[0m"
echo -e "\e[37;43;1m |  _________________________________________________________________________________________________________  | \e[0m"
echo -e "\e[37;43;1m | |  _____________________________________________________________________________________________________  | | \e[0m"
echo -e "\e[37;43;1m | | |   ________________________________________________________________________________________________  | | | \e[0m"
echo -e "\e[37;43;1m | | |  |                                                                                                | | | | \e[0m"
echo -e "\e[37;43;1m | | |  |                                                                                                | | | | \e[0m"
echo -e "\e[37;43;1m | | |  |                                   \e[97;43;1m BIENVENIDO AL POKEJUEGO\e[37;43;1m                                     | | | | \e[0m"
echo -e "\e[37;43;1m | | |  |                                                                                                | | | | \e[0m"
echo -e "\e[37;43;1m | | |  |________________________________________________________________________________________________| | | | \e[0m"
echo -e "\e[37;43;1m | | |_____________________________________________________________________________________________________| | | \e[0m"
echo -e "\e[37;43;1m | |_________________________________________________________________________________________________________| | \e[0m"
echo -e "\e[37;43;1m |_____________________________________________________________________________________________________________| \e[0m"
echo -e "\e[37;43;1m                                                                                                                 \e[0m"
echo -e "\e[37;43;1m                                                                                                                 \e[0m"
echo -e "\e[37;43;1m                              Este es un juego para verdaderos amantes de Pokémon                                \e[0m"
echo -e "\e[37;43m                            Solo los verdaderos conocedores podrán con este reto!!!                              \e[0m"
echo -e "\e[37;43m                                            Veamos de qué eres capaz                                             \e[0m"
echo -e "\e[37;43m                                                                                                                 \e[0m"
echo -e "\e[37;43m                                      Ingresa tu contraseña para continuar                                       \e[91;49;1m"

read -p "                                               Presiona [Enter]..."

echo -e "\e[90;49m "
sudo apt-get install fortune cowsay
clear


POKE1="Bulbasaur"
POKE2="Ivysaur"
POKE3="Venusaur"
POKE4="Charmander"
POKE5="Charmeleon"
POKE6="Charizard"
POKE7="Squirtle"
POKE8="Wartortle"
POKE9="Blastoise"
POKE10="Caterpie"
POKE11="Metapod"
POKE12="Butterfree"
POKE13="Weedle"
POKE14="Kakuna"
POKE15="Beedrill"
POKE16="Pidgey"
POKE17="Pidgeotto"
POKE18="Pidgeot"
POKE19="Rattata"
POKE20="Raticate"
POKE21="Spearow"
POKE22="Fearow"
POKE23="Ekans"
POKE24="Arbok"
POKE25="Pikachu"
POKE26="Raichu"
POKE27="Sandshrew"
POKE28="Sandslash"
POKE29="Nidoran♀"
POKE30="Nidorina"

let cont=1

function intro
{
echo -e "\e[0m\e[44;97m                                                                                                                    "
echo -e "                                                                                                                    "
echo -e "   °Para este juego tendrás que seleccionar una categoría: sea \e[44;97;1mA\e[0m\e[44;97m,\e[44;97;1m B\e[0m\e[44;97m o\e[44;97;1m C\e[0m\e[44;97m                                             "
echo -e "   °Posteriormente, según la categoría que hayas seleccionado, deberás ingresar el nombre de ciertos pokémones...   "
echo -e "   °Si el número de la pokédex corresponde al pokémon que ingresaste verás magia ante tus ojos                      "
echo -e "   °Si el nombre del pokémon es incorrecto entonces pierdes el juego :v                                             "
echo -e "                                                                                                                    "
echo -e "\e[44;97;1m                                            Pon a trabajar esa memoria                                              "
echo -e "                                                     ¡Suerte!                                                       "
echo -e "                                                                                                                    "
echo -e "\e[44;97;1m                                                                                                                    \e[0m"
read -p "Presiona [Enter]..."

}

intro

function menu
{
clear
echo -e "\e[102;97m                 P O K E M E N Ú                \e[0m"
echo -e "\e[47;32m                                                \e[0m"
echo -e "\e[47;32m         Seleccione una opción                  \e[0m"
echo -e "\e[47;32m            1.- Categoría A                     \e[0m"
echo -e "\e[47;32m            2.- Categoría B                     \e[0m"
echo -e "\e[47;32m            3.- Categoría C                     \e[0m"
echo -e "\e[47;32m            4.- Salir                           \e[0m"
echo -e "\e[47;32m         Opción [1-4]:                          \e[0m"
echo -e "\e[47;32m                                                \e[0m"
}

menu

function selecciones
{

read seleccion
case $seleccion in

	1)
		clear
		echo -e "\e[45;37;4m                               CATEGORIA A                               \e[0m"
		echo -e "\e[45;37m                                                                         \e[0m"

		function P1 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #1 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE1"
        			then
               				pokemonsay -p Bulbasaur -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P1;

		function P2 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #2 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE2"
        			then
               				pokemonsay -p Ivysaur -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P2;

		function P3 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #3 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE3"
        			then
               				pokemonsay -p Venusaur -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P3;

		function P4 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #4 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE4"
        			then
               				pokemonsay -p Charmander -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P4;

		function P5 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #5 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE5"
        			then
               				pokemonsay -p Charmeleon -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P5;

		function P6 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #6 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE6"
        			then
               				pokemonsay -p Charizard -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P6;

		function P7 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #7 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE7"
        			then
               				pokemonsay -p Squirtle -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P7;

		function P8 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #8 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE8"
        			then
               				pokemonsay -p Wartortle -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P8;

		function P9 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #9 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE9"
        			then
               				pokemonsay -p Blastoise -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P9;

		function P10 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #10 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE10"
        			then
               				pokemonsay -p Caterpie -n "Felicidades!!! Te sabes mi nombre :V"
               				echo -e "\e[97;41;1mACABAS DE TERMINAR LA CATEGORIA A!!!!!\e[0m"
               				read -p "Presiona [Enter]..."
           					menu; selecciones;
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P10;;




	2)		
		clear
		echo -e "\e[45;37;4m                               CATEGORIA B                               \e[0m"
		echo -e "\e[45;37m                                                                         \e[0m"

		function P11 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #11 en la pokedex: \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE11"
        			then
               				pokemonsay -p Metapod -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P11;

		function P12 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #12 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE12"
        			then
               				pokemonsay -p Butterfree -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P12;

		function P13 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #13 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE13"
        			then
               				pokemonsay -p Weedle -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P13;

		function P14 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #14 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE14"
        			then
               				pokemonsay -p Kakuna -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P14;

		function P15 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #15 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE15"
        			then
               				pokemonsay -p Beedrill -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P15;

		function P16 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #16 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE16"
        			then
               				pokemonsay -p Pidgey -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P16;

		function P17 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #17 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE17"
        			then
               				pokemonsay -p Pidgeotto -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P17;

		function P18 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #18 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE18"
        			then
               				pokemonsay -p Pidgeot -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P18;

		function P19 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #19 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE19"
        			then
               				pokemonsay -p Rattata -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P19;

		function P20 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #20 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE20"
        			then
               				pokemonsay -p Raticate -n "Felicidades!!! Te sabes mi nombre :V"
               				echo -e "\e[97;41;1mACABAS DE TERMINAR LA CATEGORIA B!!!!!\e[0m"
               				read -p "Presiona [Enter]..."
           					menu; selecciones;
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P20;;



	3)
		clear
		echo -e "\e[45;37;4m                               CATEGORIA C                               \e[0m"
		echo -e "\e[45;37m                                                                         \e[0m"

		function P21 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #21 en la pokedex: \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE21"
        			then
               				pokemonsay -p Spearow -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P21;

		function P22 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #22 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE22"
        			then
               				pokemonsay -p Fearow -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P22;

		function P23 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #23 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE23"
        			then
               				pokemonsay -p Ekans -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P23;

		function P24 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #24 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE24"
        			then
               				pokemonsay -p Arbok -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P24;

		function P25 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #25 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE25"
        			then
               				pokemonsay -p Pikachu -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P25;

		function P26 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #26 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE26"
        			then
               				pokemonsay -p Raichu -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P26;

		function P27 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #27 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE27"
        			then
               				pokemonsay -p Sandshrew -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P27;

		function P28 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #28 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE28"
        			then
               				pokemonsay -p Sandslash -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P28;

		function P29 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #29 en la pokedex (pista: ♀):  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE29"
        			then
               				pokemonsay -p Nidoran♀ -n "Felicidades!!! Te sabes mi nombre :V"
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P29;

		function P30 {
			echo -e "\e[45;37mIngresa el nombre empezando con mayúscula del pokemon #30 en la pokedex:  \e[0m"
			read POKEIN
			if test "$POKEIN" = "$POKE30"
        			then
               				pokemonsay -p Nidorina -n "Felicidades!!! Te sabes mi nombre :V"
               				echo -e "\e[97;41;1mACABAS DE TERMINAR LA CATEGORIA C!!!!! ERES TODO UN PRO /0/\e[0m"
               				read -p "Presiona [Enter]..."
           					menu; selecciones;
        	else
           			echo "Te equivocaste men"
           			echo "Adios"
           			read -p "Presiona [Enter]..."
           			menu; selecciones;
			fi
		}
		P30;;


	4)
		read -p "Presiona [Enter] para salir"; clear; exit;;

	*)
		echo "Opción incorrecta"
		read -p "Presiona [Enter]..."
		clear;
		menu; selecciones;;

esac
}

selecciones


fi

