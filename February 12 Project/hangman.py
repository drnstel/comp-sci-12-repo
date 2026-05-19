import hangman_logic
import hangman_display

def main():    
    # game settings
    blank_char = "_"
    min_length = 6
    max_length = 8
    max_guesses = 6
    
    # logic setup
    guessed_letters = []
    guesses_remaining = max_guesses
    hidden_word = hangman_logic.get_random_word(min_length, max_length)
    game_is_won = False
    
    while guesses_remaining > 0 and not game_is_won:
        
        # display current image and hidden word
        hangman_display.display_image(guesses_remaining)
        hangman_display.display_hidden_word(hidden_word, guessed_letters, blank_char)
        
        # get a valid guess
        guess = hangman_logic.get_valid_player_guess(guessed_letters)
        guessed_letters.append(guess)
        guesses_remaining -= 1
        
        # check if all letters in the word have been guessed, i.e. player wins
        game_is_won = hangman_logic.all_letters_are_revealed(hidden_word, guessed_letters)
        
    if game_is_won:
        hangman_display.display_win_message(hidden_word, guesses_remaining)
    else:
        hangman_display.display_lose_message(hidden_word)
    
    
main()