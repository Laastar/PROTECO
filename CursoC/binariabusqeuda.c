#include <stdio.h>
#include <stdlib.h>

int main() {
  int arr[5] = {1, 4, 6, 8, 9};
  int busqueda=4;
  binary(arr, busqueda, arr[0], arr[5]);
  return 0;
}

int binary(int arr, int busqueda, int arr[inicio], int arr[fin]) {
  if(arr[fin] == arr[inicio])
  {
    printf("Valor es %d", arr[fin]);
  }
  int medio = (arr[inicio]+arr[fin])/2;
  if(medio>busqueda)
    arr[fin] = arr[medio];
  else
    arr[incio] = arr[fin];
  return binary(arr, busqueda, arr[incio], arr[fin]);
}
