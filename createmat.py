import xlrd
def findClass(r1,r2):
	if r1 and r2 in range(1,6):
		c1=0
		c2=0
	elif r1 and r2 in range(6,11):
		c1=1
		c2=1
	elif r1 and r2 in range(11,16):
		c1=2
		c2=2
	else: 
		c1=3
		c2=3
	return [c1,c2]

def AQDQmat(first_sheet,teams):
	
	for i in range(1,381):	
		for j in range(1,3):	
			totalshots=first_sheet.cell(i,j+5).value
			ontarget=first_sheet.cell(i,j+7).value
			if totalshots == 0:
				ratio=0
			else: 
				ratio=ontarget/totalshots
			goalsscored=first_sheet.cell(i,j+2).value
			goalsconcede=first_sheet.cell(i,5-j).value
			if goalsconcede == 0:
				cleansheet=1
			else:
				cleansheet=0
			
			AQDQrow=[ratio,goalsscored,cleansheet,goalsconcede]
			teams[first_sheet.cell(i,j).value.strip()].append(AQDQrow)

def FORMmat(first_sheet,team_rank,teams,teams_matches,form_table):
	for i in range(1,381):
		t1=first_sheet.cell(i,1).value.strip()
		t2=first_sheet.cell(i,2).value.strip()
		result=first_sheet.cell(i,5).value
		if teams_matches[t1]>4 or teams_matches[t2]>4:
			r1,r2=team_rank[t1][teams_matches[t1]],team_rank[t2][teams_matches[t2]]
			c1,c2=findClass(r1,r2)
			
						
			if  result == 'H':
				points=1+form_table[c1][1]*form_table[c2][0]
				teams[t1][teams_matches[t1]].append(points)
				teams[t2][teams_matches[t2]].append(-points)
			elif result== 'A':
				points=1+form_table[c1][1]*form_table[c2][0]
				points+= (form_table[c1][2]*points)/100
				teams[t2][teams_matches[t2]].append(points)
				teams[t1][teams_matches[t1]].append(-points)
			#case of draw			
			elif c1==c2 or ((c1,c2)==(0,1) or (c1,c2)==(1,0))  or ((c1,c2)==(1,2) or (c1,c2)==(2,1)) or ((c1,c2)==(2,3) or (c1,c2)==(3,2)):
				teams[t1][teams_matches[t1]].append(0.5)
				teams[t2][teams_matches[t2]].append(0.5)
			else:
								
				if c1<c2:				
					points=form_table[c2][1]*form_table[c1][0]						
					teams[t1][teams_matches[t1]].append(0.5-points)
					teams[t2][teams_matches[t2]].append(0.5+points)		
				else:
					points=form_table[c2][0]*form_table[c1][1]
					teams[t1][teams_matches[t1]].append(0.5+points)	
					teams[t2][teams_matches[t2]].append(0.5-points)

			
		else:
			if result == 'H':
				teams[t1][teams_matches[t1]].append(1.2)
				teams[t2][teams_matches[t2]].append(-0.8)
			elif result == 'A':
				teams[t1][teams_matches[t1]].append(-0.8)
				teams[t2][teams_matches[t2]].append(1.2)
			else:
				teams[t1][teams_matches[t1]].append(0.5)
				teams[t2][teams_matches[t2]].append(0.5) 
		teams_matches[t1]+=1
		teams_matches[t2]+=1



