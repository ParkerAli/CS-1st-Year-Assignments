# nohelp.py

def welcome():
    print('Welcome to the automated technical support system.')
    print('Please describe your problem:')

def get_input():
    return input().lower()

def main():
    import random
    welcome()    
    query = get_input()
    dict_answers = {'crashed':'Are the drivers up to date?', 'blue':'Ah, the blue screen of death. And then what happened?', 'hacked':'You should consider installing anti-virus software.', 'bluetooth':'Have you tried mouthwash?','windows':'Ah, I think I see your problem. What version?', 'apple':'You do mean the computer kind?', 'spam':'You should see if your mail client can filter messages.', 'connection':'Contact Telkom.'}
    while (not query=='quit'):
        check=query.split()
        a=0
        for i in range(len(check)):
            if check[i] in dict_answers:
                print(dict_answers[check[i]])
                a+=1
                break
        if a==0:
            print("Curious, tell me more.")
            
        query = get_input()    
     
if __name__=='__main__':
    main()