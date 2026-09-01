class Solution:
    def isValid(self, word: str) -> bool:
        if len(word) < 3:
            return False
        
        hasVowel = False
        hasConsonant = False
        vowel = "aeiouAEIOU"

        for i in word:
            if i.isdigit():
                continue
            elif (i.isalpha()) and (i in vowel):
               hasVowel = True
            elif (i.isalpha()) and (i not in vowel):
                hasConsonant = True
            else:
                return False
        return  hasVowel and hasConsonant


        