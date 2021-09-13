import pygame 
import random

pygame.init()

#Defining game window,play window and block size (for later use)
window_width = 800
window_height = 700
play_width = 300
play_height = 600
block_size = 30

# Creating game window
window = pygame.display.set_mode((window_width, window_height))

# Naming the window 
pygame.display.set_caption("Tetris")

top_left_x = (window_width - play_width) // 2
top_left_y = window_height - play_height

# Defining the shapes 

# SHAPE FORMATS

S = [['.....',
      '.....',
      '..00.',
      '.00..',
      '.....'],
     ['.....',
      '..0..',
      '..00.',
      '...0.',
      '.....']]

Z = [['.....',
      '.....',
      '.00..',
      '..00.',
      '.....'],
     ['.....',
      '..0..',
      '.00..',
      '.0...',
      '.....']]

I = [['..0..',
      '..0..',
      '..0..',
      '..0..',
      '.....'],
     ['.....',
      '0000.',
      '.....',
      '.....',
      '.....']]

O = [['.....',
      '.....',
      '.00..',
      '.00..',
      '.....']]

J = [['.....',
      '.0...',
      '.000.',
      '.....',
      '.....'],
     ['.....',
      '..00.',
      '..0..',
      '..0..',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '...0.',
      '.....'],
     ['.....',
      '..0..',
      '..0..',
      '.00..',
      '.....']]

L = [['.....',
      '...0.',
      '.000.',
      '.....',
      '.....'],
     ['.....',
      '..0..',
      '..0..',
      '..00.',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '.0...',
      '.....'],
     ['.....',
      '.00..',
      '..0..',
      '..0..',
      '.....']]

T = [['.....',
      '..0..',
      '.000.',
      '.....',
      '.....'],
     ['.....',
      '..0..',
      '..00.',
      '..0..',
      '.....'],
     ['.....',
      '.....',
      '.000.',
      '..0..',
      '.....'],
     ['.....',
      '..0..',
      '.00..',
      '..0..',
      '.....']]

shapes = [S, Z, I, O, J, L, T]

# Defining the block color 

lime = (0, 255, 0)
red = (255, 0, 0)
cyan = (0, 255, 255)
yellow = (255, 255, 0)
orange = (255, 165, 0)
blue = (0, 0, 255)
purple = (128, 0, 128)

shape_colors = [(0, 255, 0), (255, 0, 0), (0, 255, 255), (255, 255, 0), (255, 165, 0), (0, 0, 255), (128, 0, 128)]
named_shape_colors = [lime, red, cyan, yellow, orange, blue, purple]

class Piece(object):  # *
    def __init__(self, x, y, shape):
        self.x = x
        self.y = y
        self.shape = shape
        self.color = shape_colors[shapes.index(shape)]
        self.rotation = 0

# Getting the current piece
def get_shape():
    return Piece(5, 0, random.choice(shapes))

# Creating the grid
black = (0, 0, 0)
grid = [[black for x in range(10)] for x in range(20)]


# Filling the screen border background 
border_color = (139,69,19) # saddle brown as requested by Roman
window.fill(border_color) 

# Drawing the grid

def draw_grid(window, grid):
    sx = top_left_x
    sy = top_left_y

    for i in range(len(grid)):
        for j in range(len(grid[i])):
            pygame.draw.rect(window, grid[i][j], (top_left_x + j* block_size, top_left_y + i * block_size, block_size, block_size), 0)

    for i in range(len(grid)):
        pygame.draw.line(window, (128, 128, 128), (sx, sy +
                                                    i * block_size), (sx + play_width, sy + i * block_size))
        for j in range(len(grid[i])):
            pygame.draw.line(window, (128, 128, 128), (sx + j *
                                                        block_size, sy), (sx + j * block_size, sy + play_height))

# draw grid and border (execution)
draw_grid(window, grid)
pygame.draw.rect(window, (255, 0, 0), (top_left_x, top_left_y, play_width, play_height), 5)
pygame.display.update()

# Creating display loop 
def main():
    run = True
    while run:
        testpiece=get_shape()
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                # Ends the loop if the red "X" is clicked 
                run = False
main()