def get_non_blank_text(prompt):
    text = input(prompt).strip()
    while text == "":
        print("Input cannot be blank!")
        text = input(prompt).strip()
    
    return text


def get_valid_int(prompt):
    while True:
        text = get_non_blank_text(prompt)
        try:
            return int(text)
        except ValueError:
            print("Not a valid int!")


def get_valid_column(prompt, board, blank_char):
    while True:
        column = get_valid_int(prompt) - 1
        
        if column < 0 or column > len(board[0]) - 1:
            print("Must choose a column from 1-" + str(len(board[0])) + "!")
        elif board[0][column] != blank_char:
            print("Can't add at that column!")
        else:
            return column
    

def display_board(board):
    for row in board:
        for col in row:
            print(col, end = " ")
        print()


def num_rows(board):
    return len(board)


def num_cols(board):
    return len(board[0])


def drop_piece(board, player, column, blank_char):
    for i in range(num_rows(board) - 1, -1, -1):
        if board[i][column] == blank_char:
            board[i][column] = player
            break


def check_horizontal_win(board, player):
    count = 0
    for row in board:
        col = 0
        while col < len(row):
            if row[col] == player:
                count += 1
                if count == 4:
                    return True
            else:
                count = 0
            col += 1
    
    return False


def check_vertical_win(board, player):
    count = 0
    for col in range(num_cols(board)):
        row = 0
        while row < num_rows(board):
            if board[row][col] == player:
                count += 1
                if count == 4:
                    return True
            else:
                count = 0
            row += 1
    return False


def check_diagonal_win(board, player):
    # part 1: down to the right
    
    # look for diagonals down and to the right, starting from the leftmost column
    for start_row in range(num_rows(board)):
        
        consecutive_count = 0
        row = start_row
        col = 0
        
        # loop in a straight line (down to the right), as long as row and col are valid
        while row < num_rows(board) and col < num_cols(board):
            if board[row][col] == player:
                consecutive_count += 1
                if consecutive_count == 4:
                    return True
            else:
                consecutive_count = 0
                
            row += 1 # moves one space down
            col += 1 # moves one space right
        
    # look for diagonals down and to the right, starting from the top row
    for start_col in range(num_cols(board)):
        
        consecutive_count = 0
        col = start_col
        row = 0
        
        # loop in a straight line (down to the right), as long as row and col are valid
        while row < num_rows(board) and col < num_cols(board):
            if board[row][col] == player:
                consecutive_count += 1
                if consecutive_count == 4:
                    return True
            else:
                consecutive_count = 0
                
            row += 1 # moves one space down
            col += 1 # moves one space right
        
        
    # part 2: down to the left
    
    # look for diagonals down and to the left, starting from the rightmost column
    for start_row in range(num_rows(board)):
        
        consecutive_count = 0
        row = start_row
        col = num_cols(board) - 1
        
        # loop in a straight line (down to the left), as long as row and col are valid
        while row < num_rows(board) and col >= 0:
            if board[row][col] == player:
                consecutive_count += 1
                if consecutive_count == 4:
                    return True
            else:
                consecutive_count = 0
                
            row += 1 # moves one space down
            col -= 1 # moves one space left


    # look for diagonals down and to the left, starting from the top row
    for start_col in range(num_cols(board)):
        
        consecutive_count = 0
        col = start_col
        row = 0
        
        # loop in a straight line (down to the left), as long as row and col are valid
        while row < num_rows(board) and col >= 0:
            if board[row][col] == player:
                consecutive_count += 1
                if consecutive_count == 4:
                    return True
            else:
                consecutive_count = 0
                
            row += 1 # moves one space down
            col -= 1 # moves one space left


def check_win(board, player):
    if check_horizontal_win(board, player):
        return True
    elif check_vertical_win(board, player):
        return True
    elif check_diagonal_win(board, player):
        return True
    
    return False


def main():
    # Setup parameters
    num_rows = 9
    num_cols = 9
    blank_char = ". "
    player_1_char = "X "
    player_2_char = "O "
    
    # Setup logic
    single_row = []
    for space in range(num_cols):
        single_row.append(blank_char)

    identifiers = ["A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I "]
    
    board = []
    for row in range(num_rows):
        board.append(single_row.copy())
    board.append(identifiers)
    
    player = player_1_char
    
    # Game loop
    while True:
        
        display_board(board)
        player_text = f"Player 1 ({player_1_char.strip()})" if player == player_1_char else f"Player 2({player_2_char.strip()})"
        column = get_valid_column(f"{player_text}, please choose a column from 1-9 or A-I: ", board, blank_char)
        drop_piece(board, player, column, blank_char)
        
        # game over logic
        game_over = check_win(board, player)
        if game_over:
            display_board(board)
            print(player + "wins!")
            break
        
        # swap players
        if player == player_2_char:
            player = player_1_char
        else:
            player = player_2_char


main()