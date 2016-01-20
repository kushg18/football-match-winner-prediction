from createmat import * 
import xlrd
def findRank(path2):
	for i in range(1,39):
		path3=path2+str(i)+'.xlsx'
		matchday=xlrd.open_workbook(path3)
		sheet1=matchday.sheet_by_index(0)
		#print path3,'\n'
		for j in range(1,21):			
			team_rank[sheet1.cell(j,2).value.strip()].append(sheet1.cell(j,0).value)
					

teams={}
teams_matches={}
team_rank={}
book = xlrd.open_workbook("Season_table.xlsx")
first_sheet = book.sheet_by_index(0)
form_table=([0.75,0.15,20],[0.6,0.25,16],[0.4,0.4,12],[0.15,0.6,10])
for i in range(1,37):
	teams[first_sheet.cell(i,0).value.strip()]=[]
	teams_matches[first_sheet.cell(i,0).value.strip()]=0
	team_rank[first_sheet.cell(i,0).value.strip()]=[]
num=2005
match=1
for j in range(10):
	path='Fixtures/'+str(num)+'.xlsx'
	path2='Match Days/'+str(num)+'/Match'
	fsheet=xlrd.open_workbook(path)
	first_sheet = fsheet.sheet_by_index(0)
	findRank(path2)
	AQDQmat(first_sheet,teams)	
	FORMmat(first_sheet,team_rank,teams,teams_matches,form_table)
	num=num+1


for k in teams.keys():
	print k
	print '------------------'
	for i in range(len(teams[k])):
		print len(teams[k][i]),'\n' 



