def fact1(n):
    return fact(n,1)

def fact(n, courant):
    if n == 0:
        return courant
    else:
        return fact(n-1, n*courant)

def fact2(n):
    if n == 0:
        return 1;
    else:
        return n * fact2(n-1)

for x in range(10):
    print("fact(%s) = %s ~ %s" % (x, fact1(x), fact2(x)))


fact1(100000000000000000)

