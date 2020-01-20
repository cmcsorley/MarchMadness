# MarchMadness
A March Madness Simulator

This program uses probabilities from the first round of the tournament (https://www.liveabout.com/march-madness-statistics-3126162) in order to infer what a theoretical probability might be for any two teams for any difference in seed.
The assumption here is that a probability of an 8 seed beating a 9 seed is the same as that of a 1 seed beating a 2 seed.
Even differences in seed are imputed based on an average of the nearest two odd number differences.

A user can then change the number (n) of brackets that they want to simulate, and the program prints the expected number of each see appearing in each round of the tournament: the Round of 32, the Sweet Sixteen, the Elite Eight, the Final Four, the Final, and the Winner.

A sample output for 1000 simulations is below:

Expected Number of each seed in Round of 32:
1: 4.0, 2: 3.846, 3: 3.416, 4: 3.139, 5: 2.65, 6: 2.706, 7: 2.425, 8: 1.858, 9: 2.142, 10: 1.575, 11: 1.294, 12: 1.35, 13: 0.861, 13: 0.861, 14: 0.584, 15: 0.154, 16: 0.0

Expected Number of each seed in the Sweet Sixteen:
1: 2.822, 2: 2.71, 3: 2.177, 4: 1.744, 5: 1.495, 6: 1.255, 7: 0.818, 8: 0.608, 9: 0.57, 10: 0.424, 11: 0.395, 12: 0.436, 13: 0.325, 13: 0.325, 14: 0.173, 15: 0.048, 16: 0.0

Expected Number of each seed in the Elite Eight:
 1: 1.891, 2: 1.546, 3: 1.245, 4: 0.822, 5: 0.67, 6: 0.506, 7: 0.379, 8: 0.272, 9: 0.202, 10: 0.172, 11: 0.107, 12: 0.097, 13: 0.046, 13: 0.046, 14: 0.036, 15: 0.009, 16: 0.0
 
Expected Number of each seed in the Final Four:
 1: 1.031, 2: 0.879, 3: 0.64, 4: 0.456, 5: 0.315, 6: 0.21, 7: 0.132, 8: 0.121, 9: 0.083, 10: 0.057, 11: 0.03, 12: 0.026, 13: 0.014, 13: 0.014, 14: 0.004, 15: 0.002, 16: 0.0
 
Expected Number of each seed in the Final Two:
 1: 0.56, 2: 0.485, 3: 0.331, 4: 0.233, 5: 0.141, 6: 0.088, 7: 0.056, 8: 0.044, 9: 0.033, 10: 0.016, 11: 0.008, 12: 0.002, 13: 0.002, 13: 0.002, 14: 0.0, 15: 0.001, 16: 0.0
 
Expected Probability of each seed to win:
 1: 0.256, 2: 0.232, 3: 0.154, 4: 0.114, 5: 0.082, 6: 0.053, 7: 0.035, 8: 0.03, 9: 0.024, 10: 0.012, 11: 0.004, 12: 0.002, 13: 0.001, 13: 0.001, 14: 0.0, 15: 0.001, 16: 0.0

