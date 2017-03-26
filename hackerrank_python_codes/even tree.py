def trav(edge0,edge1,tree):
    global evecount
    for vertice in tree[edge0]:
        if vertice != edge1:
            evecount+=1
            trav(vertice,edge0,tree)
    return

evecount=1
nm = input().split()
nm[0] = int(nm[0])
nm[1] = int(nm[1])

tree = [[]for _ in range(nm[0]+1)]
edges = [[]for _ in range(nm[1])]


for _ in range(0,nm[1]):

    temp = input().split()
    temp[0] = int(temp[0])
    temp[1] = int(temp[1])
    
    edges[_].append(temp[0])
    edges[_].append(temp[1])

    tree[temp[0]].append(temp[1])
    tree[temp[1]].append(temp[0])

sumed = 0
for ed in edges:
    trav(ed[0],ed[1],tree)
    if evecount%2 == 0:
        evecount = 1
        trav(ed[1],ed[0],tree)
        if evecount%2 == 0:
            sumed+=1
            tree[ed[0]].remove(ed[1])
            tree[ed[1]].remove(ed[0])


##print(inp)
##print(edges)

##print(evecount)
print(sumed)
