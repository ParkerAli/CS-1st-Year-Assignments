def match(pattern, word):
    if len(pattern)==len(word) and len(pattern)!=0:
        if pattern[0]==word[0] or pattern[0]=="?":
            if len(pattern)==1 :
                return True
            else:
                return match(pattern[1:],word[1:])
        else:
            return False
    elif len(pattern)==len(word) and len(pattern)==0:
        return True
    else:
        return False
        
