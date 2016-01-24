class Feature:
    counter=1
    def featureCompute(self,first_sheet,sheet1,teams,matches_played):
        """
        Computes the training set features
        :rtype: none
        """
        for i in range(1,381):
            t1=first_sheet.cell(i,1).value
            t2=first_sheet.cell(i,2).value
            if matches_played[t1]> 4 and matches_played[t2]> 4:
                list1=Feature.compute(t1,teams,matches_played[t1]-1,5)
                list2=Feature.compute(t2,teams,matches_played[t2]-1,5)
                row=sheet1.row(Feature.counter)
                list1.extend(list2)
                list1.append(t1)
                list1.append(t2)
                result=first_sheet.cell(i,5).value
                if result == 'D':
                    list1.append(3)
                elif result == 'H':
                    list1.append(1)
                else :
                    list1.append(2)
                Feature.counter+=1
                for j in range(len(list1)):
                    if not j == len(list1)-1:
                        entry=str(j+1)+':'+str(list1[j])
                    else:
                        entry=list1[j]
                    row.write(j,entry)
            elif matches_played[t1] <= 4 and matches_played[t2] <=4:
                pass
          #  list1=compute(t1,teams,)
            matches_played[t1]+=1
            matches_played[t2]+=1




    @staticmethod
    def compute(t,teams,n,r):
        form,sum_ratio,GScount,CScount,GCcount=0.0,0.0,0.0,0.0,0.0
        for i in range(n,n-r,-1):
            form+=teams[t][i][4]
            sum_ratio+=teams[t][i][0] ** 2
            GScount+=teams[t][i][1]
            GCcount+=teams[t][i][3]
            CScount+=teams[t][i][2]
        aq=(sum_ratio/r) ** 1/2 + (GScount/r)
        #print CScount,r
        CScount=CScount/r
        GCcount=GCcount/r
        #print t,CScount,'\n'
        return [form,aq,CScount,GCcount]
    '''
    def SVMformat(self,sheet):
        for i in range(1,3289):
            result=sheet.cell(i,10).value
            if result == 'D':

    '''













