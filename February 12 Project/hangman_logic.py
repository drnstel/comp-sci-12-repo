import input_validation
import wordlist
import random

def get_random_word(min_length, max_length):
    """
    Gets a word with a number of letters between min_length and max_length (both inclusive).

    Args:
        min_length (int): The minimum number of letters in the word that will be returned.
        max_length (int): The maximum number of letters in the word that will be returned.

    Returns:
        str: The randomly selected word with number of letters in the specified range.
    """
    ...



def get_valid_player_guess(guessed_letters):
    """
    Gets a single letter as input from the player. Ensures that the letter does not appear in guessed_letters.

    Args:
        guessed_letters (list of str): The list of letters that the player has guessed.

    Returns:
        str: The single letter that the player guesses.
    """
    ...



def all_letters_are_revealed(hidden_word, guessed_letters):
    """
    Checks if all letters in hidden_word are present in guessed_letters.

    Args:
        hidden_word (str): The word the player is supposed to guess.
        guessed_letters (list of str): The list of letters that the player has guessed.

    Returns:
        bool: True if all letters in hidden_word are found in guessed_letters, False otherwise.
    """
    ...
