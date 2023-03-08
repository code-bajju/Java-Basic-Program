import random

# List of program names
program_names = ["Calculator", "Tic Tac Toe", "Weather App", "Hangman", "Chess Game",
                 "Rock Paper Scissors", "Todo List", "Snake Game", "2048", "Minesweeper"]

# Function to generate a random program
def generate_program(name):
    if name == "Calculator":
        # code for calculator
        print("Calculator program generated")
    elif name == "Tic Tac Toe":
        # code for tic tac toe
        print("Tic Tac Toe program generated")
    elif name == "Weather App":
        # code for weather app
        print("Weather App program generated")
    elif name == "Hangman":
        # code for hangman
        print("Hangman program generated")
    elif name == "Chess Game":
        # code for chess game
        print("Chess Game program generated")
    elif name == "Rock Paper Scissors":
        # code for rock paper scissors
        print("Rock Paper Scissors program generated")
    elif name == "Todo List":
        # code for todo list
        print("Todo List program generated")
    elif name == "Snake Game":
        # code for snake game
        print("Snake Game program generated")
    elif name == "2048":
        # code for 2048
        print("2048 program generated")
    elif name == "Minesweeper":
        # code for minesweeper
        print("Minesweeper program generated")

# Generate 10 random programs
for i in range(10):
    program_name = random.choice(program_names)
    generate_program(program_name)
