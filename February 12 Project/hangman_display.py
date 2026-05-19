def display_hidden_word(hidden_word, guessed_letters, blank_char):
    """
    Displays the hidden word in its current state of being guessed.
    Letters that are in guessed_letters are revealed.
    Letters missing from guessed_letters remain hidden (displayed as blank_char).

    Args:
        hidden_word (str): The word the player is supposed to guess.
        guessed_letters (list of str): The list of letters that the player has guessed.
        blank_char (str): The character used to represent a hidden letter.

    Returns:
        None.
    """
    ...



def display_win_message(hidden_word, guesses_remaining):
    """
    Displays the win message, including what the hidden word was, and how many guesses the player had remaining.

    Args:
        hidden_word (str): The word the player successfully guessed.
        guesses_remaining (int): The number of guesses the player had remaining after their winning guess.

    Returns:
        None.
    """
    ...



def display_lose_message(hidden_word):
    """
    Displays the lose message, including what the hidden word was.

    Args:
        hidden_word (str): The word the player was unsuccessful at guessing.

    Returns:
        None.
    """
    ...



def display_image(guesses_remaining):
    """
    Displays the image corresponding to the number of guesses the player has left.
    For example, 0 guesses remaining indicates the player has lost.

    Args:
        guesses_remaining (int): The number of guesses the player currently has remaining.

    Returns:
        None.
    """
    ...
