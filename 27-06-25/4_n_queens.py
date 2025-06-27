def solve_n_queens(n):
    solutions = []
    board = [-1] * n

    def is_safe(row, col):
        for prev_row in range(row):
            if board[prev_row] == col or                abs(board[prev_row] - col) == abs(prev_row - row):
                return False
        return True

    def solve(row):
        if row == n:
            solutions.append(board[:])
        for col in range(n):
            if is_safe(row, col):
                board[row] = col
                solve(row + 1)

    solve(0)
    return solutions