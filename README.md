Football Match Winner Prediction
=================================

### About ###
-----------------------------
This project is about learning and implementing ***machine learning*** models to predict the outcome of a football match and identify the winning team. We have extracted and built our ***own features*** that calculate and provides the stats per match. Features are the main essence of our project that highly impacts are end results.

### Technology Stack ### 
-----------------------------
1. Java
2. Python
3. Matlab
4. Linux
5. Machine Learning 
6. Netbeans
7. Pycharm
8. Matlab

### Data Selection and Extraction ### 
-----------------------------
We selected Barclays Premier League website as our main source of data. To extract the data we wrote a script that goes through each year's data and for each year it extracts fixture table after the results of each match day. You can find the data [here](https://github.com/kushg18/football-match-winner-prediction/tree/master/MatchDays). 

### Feature Extraction ### 
-----------------------------
1. Current Form
    - Home / Away Wins
    - Relative Team Position
2. Attack Quotient
    - Shots on Target
    - Goals Scored
3. Goals Conceded
4. Clean Sheets

### Machine Learning Models ### 
-----------------------------
1. Logistic Regression
2. Vote Algorithm
    - Naive Bayes Classifier and,
    - Random Forest 

### Graphical User Interface ###
-----------------------------
1. We created a simple graphical user interface that takes in the already built model for a particular year. 
2. Based on the given model it provides prediction results for all the fixtures suggested for that particular year.
3. It also provides a way to look at stats per match defending the idea behind the predicted results.

Home Page |  Team Selection to View Stats
:-------------------------:|:-------------------------:
![alt text](https://github.com/kushg18/football-match-winner-prediction/blob/master/finalgui/1Home.png)  |  ![alt text](https://github.com/kushg18/football-match-winner-prediction/blob/master/finalgui/2TeamSelection.png)

Predicitons Per Match |  Stats Per Match
:-------------------------:|:-------------------------:
![alt text](https://github.com/kushg18/football-match-winner-prediction/blob/master/finalgui/3Predictions.png)  |  ![alt text](https://github.com/kushg18/football-match-winner-prediction/blob/master/finalgui/4.PerMatchStats.png)


### Technical Research Paper ###
-----------------------------------
Our paper is published at International Journal of Computer Applications. You can access it using this [link](https://www.ijcaonline.org/archives/volume154/number3/26474-2016912066)