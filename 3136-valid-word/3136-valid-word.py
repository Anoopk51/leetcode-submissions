class Solution:
    def isValid(self, word: str) -> bool:
        data = {'vowel' : 0 , 'consonant' : 0 ,'nums' : 0 ,'special' : 0}
        if len(word) < 3:
            return False
        for i in range( 0 , len(word)):
            if word[i] in ['a','e','i','o','u','A','E','I','O','U']:
                data['vowel'] += 1
            elif(word[i].isdigit()):
                data['nums'] += 1
            elif(word[i].isalpha()):
                data['consonant'] += 1
            else:
                data['special'] += 1
        if (data['vowel'] >= 1) and (data['consonant'] >= 1) and (data['special'] == 0):
            return True
        else:
            return False