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
    answers = ['Have you tried it on a different operating system?', 'Did you reboot it?', 'What colour is it?', 'You should consider installing anti-virus software.', 'Contact Telkom.', 'I should get that looked at if I were you.']
    while (not query=='quit'):
        print(answers[random.randint(0, len(answers)-1)])

        query = get_input()    
    
    
if __name__=='__main__':
    main()