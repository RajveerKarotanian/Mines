# Mines - README

## Overview
This Java program implements a Mines casino game where players attempt to uncover gems while avoiding hidden bombs. The game features a graphical user interface built with Java Swing.

## Game Description
- **Initial Balance**: $1000
- **Game Board**: 6x6 grid with hidden gems and bombs
- **Objective**: Uncover as many gems as possible without hitting a bomb to multiply your bet
- **Features**:
  - Adjustable number of mines (6, 9, or 12)
  - Betting system with balance tracking
  - Dynamic multiplier based on gems collected
  - Cashout option at any time
  - Visual effects including tile reveals and explosions

## How to Play
1. Select the number of mines (more mines = higher potential multiplier)
2. Enter your bet amount (must be ≤ current balance)
3. Click "Bet" to start the round
4. Click tiles to reveal what's underneath:
   - Gem: increases your multiplier
   - Bomb: ends the round and you lose your bet
5. Click "Cashout" at any time to collect your winnings

## Technical Details
- **File Location**: Mines > src > Mines.java
- **Dependencies**: Java AWT and Swing libraries
- **Image Files Required**:
  - Gem.png
  - Bomb.png
  - Tile.png
  - TileHover.png
  - SideButton.png
  - SideButtonHover.png
  - Explosion.gif

## Key Methods
- `reset()` - Resets the game board
- `randomize(int numOfBombs)` - Randomly places bombs on the board
- `gameOver(int x, int y)` - Handles bomb hits and game over state
- `updateProfit()` - Calculates current winnings
- `tryParse()` - Validates bet input
- `actionPerformed(ActionEvent e)` - Handles all button clicks

## Running the Game
Compile and run the Mines.java file. The game will launch in a 800x550 pixel window.

## Notes
- The multiplier formula is: `bet * max(0.6, (1.1 + (numBombs * 0.035)^gemCount - (0.7 - (numBombs * 0.01)))`
- More bombs increase both the potential payout and risk
- You must collect at least one gem before cashing out
