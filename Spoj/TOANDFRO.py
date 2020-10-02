cols = int(input())
while cols!=0:
    cadena = input()
    rows = int(len(cadena)/cols)
    aux = [cadena[i*cols:i*cols+cols] for i in range(rows)]
    for i in range(len(aux)):
        if i % 2:
            aux[i] = aux[i][::-1]
    rta =''
    for x in range(cols):
        for fil in aux:
            rta+=fil[x]
    print(rta)
    cols = int(input())  