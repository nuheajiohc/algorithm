n,m = map(int, input().split())
no_hear = set([input() for i in range(n)])
no_see = set([input() for i in range(m)])

intersection = sorted(no_hear & no_see)
print(len(intersection))
print("\n".join(intersection))
