def create_grid (grid):
    n=0
    while n<4:
        grid.append([0,0,0,0,])
        n+=1
    return grid

def print_grid (grid):
    
    print ('+--------------------+') 
    z=0
    while z<4:
        print ("|",end="") 
        f=0
        while f<4:            
            if grid[z][f] > 0:
                print ("{0:<5}".format (grid[z][f]), end="")
            else:
                print ("     ",end="")
            f+=1
        print ("|")
        z+=1
    print ('+--------------------+') 



def check_lost(grid):
    emptylist = False
    l=0
    while l<4:
        i=0
        while i<4:
            if grid[l][i] == 0:
                emptylist = True
                break    
            i+=1
        l+=1
    
    if emptylist == True:
        return False
    else:
        n=0
        while n<4:
            g=0
            while g<3:
                if grid[n][g] == grid[n][g+1]:
                    return False
                g+=1
            n+=1
    columns = [list(i) for i in zip(*grid)]
    y=0
    while y<4:
        h=0
        while h<3:
            if columns[y][h] == columns[y][h+1]:
                return False   
            h+=1
        y+=1
    return True

def check_won(grid):
    for k in range(4):
        for g in range(4):
            if grid[k][g] >= 32:
                return True
    return False

def copy_grid (grid):
    new_grid = []
    b=0
    while b<4:
        new_grid.append ([0] * 4)
        b+=1
    u=0
    while u<4:
        m=0
        while m<4:
            new_grid[u][m] = grid[u][m]
            m+=1
        u+=1
    return new_grid

def grid_equal(grid1, grid2):
    if grid1 == grid2:
        return True
    else:
        return False
    
    