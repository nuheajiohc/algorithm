F=[0,1]
n = int(input())
for i in range(n-1):
    F.append(F[i]+F[i+1])
print(F[n])
