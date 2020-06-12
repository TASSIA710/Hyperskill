print('Hello! My name is Aid.')
print('I was created in 2020.')
print('Please, remind me your name.')

name = input()

print('What a great name you have, ' + name + '!')
print('Let me guess your age.')
print('Enter remainders of dividing your age by 3, 5 and 7.')

# reading all remainders
r3 = int(input())
r5 = int(input())
r7 = int(input())
age = (r3 * 70 + r5 * 21 + r7 * 15) % 105

print('Your age is ' + str(age) + '; that\'s a good time to start programming!')
