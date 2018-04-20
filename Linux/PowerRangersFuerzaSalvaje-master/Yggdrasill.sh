#!/bin/bash

if(( "$BahiadeLasMarianas" == 1 ))
then
echo "En que directorio desea ejecutar el arbol?" | lolcat
echo "(Inserte la ruta absoluta)" | lolcat
echo "Si desea ejecutarlo en el directorio actual presiona enter" | lolcat
read Directorio
if [ "$Directorio" == "" ]
then
cd "$Ratatoskr"
else
cd "$Directorio"
fi
echo */ > listadir.txt
echo * > listaarch.txt
echo */* > listaanidada.txt
grep -o "\<A[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[a|A][a-zA-Z0-9]*\.[a-z]* " listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<B[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[b|B][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<C[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[c|C][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<D[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[d|D][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<E[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[e|E][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<F[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[f|F][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<G[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[g|G][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<H[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[h|H][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<I[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[i|I][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<J[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[j|J][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<K[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[k|K][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<L[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[l|L][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<M[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[m|M][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<N[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[n|N][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<O[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[o|O][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<P[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[p|P][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<Q[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[q|Q][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<R[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[r|R][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<S[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[s|S][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<T[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[t|T][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<U[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[u|U][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<V[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[v|V][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<W[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[w|W][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<X[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[x|X][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<Y[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[y|Y][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat
grep -o "\<Z[a-zA-Z0-9]*/" listadir.txt | lolcat
grep -o "\<[z|Z][a-zA-Z0-9]*\.[a-z]*" listaarch.txt | tr '\n' ' ' | sed '$s/ $/\n/' | lolcat

fi
