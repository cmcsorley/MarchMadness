# MarchMadness
A March Madness Simulator

This program uses probabilities inferred from every March Madness game from 1985-2019 (https://data.world/michaelaroy/ncaa-tournament-results) using Python in order to infer what a theoretical probability might be for any two teams for any difference in seed.
The assumption here is that a probability of an 8 seed beating a 9 seed is the same as that of a 1 seed beating a 2 seed. The relationship between diffence in seeds and observed probabilities ended up being nearly linear and were inferred using simple linear regression.

A user can then change the number (n) of brackets that they want to simulate, and the program prints the expected number of each seed appearing in each round of the tournament: the Round of 32, the Sweet Sixteen, the Elite Eight, the Final Four, the Final, and the Winner.

A sample output for 2000 simulations is below:

Expected Number of each seed in Round of 32:
1: 4.0, 2: 3.759, 3: 3.4695, 4: 3.208, 5: 2.9815, 6: 2.661, 7: 2.417, 8: 2.175, 9: 1.825, 10: 1.583, 11: 1.339, 12: 1.0185, 13: 0.792, 13: 0.792, 14: 0.5305, 15: 0.241, 16: 0.0

Expected Number of each seed in the Sweet Sixteen:
1: 3.006, 2: 2.6515, 3: 2.223, 4: 1.8845, 5: 1.5635, 6: 1.2325, 7: 0.8695, 8: 0.5695, 9: 0.4245, 10: 0.4135, 11: 0.3875, 12: 0.2935, 13: 0.2585, 13: 0.2585, 14: 0.157, 15: 0.0655, 16: 0.0

Expected Number of each seed in the Elite Eight:
 1: 1.977, 2: 1.5865, 3: 1.2115, 4: 0.8435, 5: 0.67, 6: 0.556, 7: 0.3655, 8: 0.2455, 9: 0.177, 10: 0.1345, 11: 0.1135, 12: 0.053, 13: 0.034, 13: 0.034, 14: 0.0255, 15: 0.007, 16: 0.0
 
Expected Number of each seed in the Final Four:
 1: 1.171, 2: 0.857, 3: 0.6195, 4: 0.425, 5: 0.3095, 6: 0.22, 7: 0.1445, 8: 0.0975, 9: 0.0595, 10: 0.042, 11: 0.0285, 12: 0.015, 13: 0.007, 13: 0.007, 14: 0.0025, 15: 0.0015, 16: 0.0
 
Expected Number of each seed in the Final Two:
 1: 0.6495, 2: 0.464, 3: 0.3215, 4: 0.199, 5: 0.142, 6: 0.0905, 7: 0.0585, 8: 0.033, 9: 0.018, 10: 0.012, 11: 0.006, 12: 0.004, 13: 0.001, 13: 0.001, 14: 0.001, 15: 0.0, 16: 0.0
 
Expected Probability of each seed to win:
 1: 0.2905, 2: 0.2165, 3: 0.164, 4: 0.11, 5: 0.0805, 6: 0.051, 7: 0.0355, 8: 0.0225, 9: 0.011, 10: 0.0085, 11: 0.0055, 12: 0.003, 13: 0.001, 13: 0.001, 14: 5.0E-4, 15: 0.0, 16: 0.0

