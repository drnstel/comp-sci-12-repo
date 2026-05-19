def get_user_string(prompt):
    """
    Displays 'prompt' to the user and waits for their input. Repeats endlessly until they enter any text.

    Args:
        prompt (str): The text to prompt the user with.

    Returns:
        str: The non-empty text inputted by the user, with leading and trailing whitespace removed.
    """
    text = input(prompt).strip()
    while text == "":
        print("Input cannot be blank!")
        text = input(prompt).strip()
    
    return text



def get_user_int(prompt):
    """
    Displays 'prompt' to the user and waits for their input. Repeats endlessly until they enter a valid int.

    Args:
        prompt (str): The text to prompt the user with.

    Returns:
        int: The valid integer entered by the user.
    """
    while True:
        text = get_user_string(prompt)
        try:
            return int(text)
        except ValueError:
            print("Not a valid int!")

    

def get_user_float(prompt):
    """
    Displays 'prompt' to the user and waits for their input. Repeats endlessly until they enter a valid float.

    Args:
        prompt (str): The text to prompt the user with.

    Returns:
        float: The valid float entered by the user.
    """
    while True:
        text = get_user_string(prompt)
        try:
            return float(text)
        except ValueError:
            print("Not a valid float!")