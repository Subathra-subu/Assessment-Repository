import re

class  InvalidFieldError(Exception):
    pass

def validate_email(email):
    re.match("^[a-zA-z0-9]@[a-zA-z].[a-zA-Z0-9],{2,5}")

def validate_phone(phone):
    res = re.search(r"^[6-9]/d{9}")

def validate_usn(usn):
    res = re.search(r"^[25MCA]/d{3}")

try:

    name = input("Enter the name:")
    value = input("Enter the value:")

    if(name.isdigit()):
        raise InvalidFieldError
    else:
        print("Name:",name,"Value:",value)

except InvalidFieldError:
    print("Name must contains alphabets")