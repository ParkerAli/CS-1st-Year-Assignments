def movement(grid):
    columns = grid
    l=0
    while l<4:
        j=0
        while j<4:
            if columns[l][j] == 0:
                x=j+1
                while x<4:
                    if columns[l][x] != 0:
                        columns[l][j] = columns[l][x]
                        columns[l][x] = 0
                        break
                    x+=1
            y=j+1
            while y<4:                            
                if columns[l][j] == columns[l][y] and all(n == 0 for n in columns[l][j + 1:y:]):
                    columns[l][j] *= 2
                    columns[l][y] = 0
                    break 
                y+=1
            j+=1
        l+=1
    return columns

def push_up(grid):  
    columns = movement([list(i) for i in zip(*grid)])
    new_grid = [list(i) for i in zip(*columns)]
    b=0
    while b<4:
        j=0
        while j<4:
            grid[b][j] = new_grid[b][j]
            j+=1
        b+=1
    return grid

def push_down(grid):
    grid.reverse()
    columns = movement([list(i) for i in zip(*grid)])
    new_grid = [list(i) for i in zip(*columns)]
    b=0
    while b<4:
        j=0
        while j<4:
            grid[b][j] = new_grid[b][j]
            j+=1
        b+=1
    grid.reverse()
    return grid
    
def push_left(grid):
    grid = movement(grid)
    return grid

def push_right(grid):
    [i.reverse() for i in grid]
    grid = movement(grid)
    [i.reverse() for i in grid]
    return grid