def match(pattern,word):
    find=pattern.find('*')

    if find==0:
        if pattern=='*':
            return True
        elif pattern[-1]==word[-1] or pattern[-1]=='?':
            return match(pattern[:-2],word[:-2])
        else:
            return False
    elif find==(len(pattern)-1):
        if pattern[0]==word[0] or pattern[0]=='?':
            return match(pattern[1:],word[1:])
        else:
            return False  
    else:
        if (pattern[0]==word[0] or pattern[0]=='?') and (pattern[-1]==word[-1] or pattern[-1] == '?'):
            return match(pattern[1:-2],word[1:-2])
        
        
        
#pattern = 'bl*'
#word='bloo'

#if match(pattern,word):
    #print("k")
        
        
