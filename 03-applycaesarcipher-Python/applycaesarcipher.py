# A Caesar Cipher is a simple cipher that works by shifting each letter in
# the given message by a certain number. For example, if we shift the message
# "We Attack At Dawn" by 1 letter, it becomes "Xf Buubdl Bu Ebxo"
# Write the function applyCaesarCipher(message, shift) which shifts the given
# message by shift letters. You are guaranteed that message is a string, and
# that shift is an integer between -25 and 25. Capital letters should stay capital
# and lowercase letters should stay lowercase, and non-letter characters should not be changed.
# Note that "Z" wraps around to "A". So, for example:
# assert(applyCaesarCipher("We Attack At Dawn", 1) == "Xf Buubdl Bu Ebxo")
# assert(applyCaesarCipher("zodiac", -2) == "xmbgya")


def fun_applycaesarcipher(msg, shift):
    new_str = ''
    for each in msg:
        asc = ord(each)
        if (asc >= 65 and asc <= 90):
            newVal = asc + shift
            if (newVal >= 65 and newVal <= 90):
                new_str += chr(newVal)
            elif newVal >= 65:
                new_str += chr(newVal - 90 + 64)
            else:
                new_str += chr(newVal + 90 - 64)
        elif (asc >= 97 and asc <= 120):
            newVal = asc + shift
            if (newVal >= 97 and newVal <= 122):
                new_str += chr(newVal)
            elif newVal >= 97:
                new_str += chr(newVal - 122 + 96)
            else:
                new_str += chr(newVal + 122 - 96)
        else:
            new_str += each
    return new_str
