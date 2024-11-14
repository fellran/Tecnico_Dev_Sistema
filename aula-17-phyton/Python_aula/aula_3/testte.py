def fun(a):
    if a > 30:
        return 4
    else:
        return a + fun(a + 4)
 
 
print(fun(25))
 
