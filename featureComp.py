class Feature:
    counter=1
    string=''
    def featureCompute(self,first_sheet,sheet1,teams,matches_played,teamprofile):
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
                teamprofile[t1].append(list1)
                teamprofile[t2].append(list2)
                row=sheet1.row(Feature.counter)
                list1.extend(list2)
                #list1.append(t1)
                #list1.append(t2)
                result=first_sheet.cell(i,5).value
                if result == 'D':
                    list1.append(3)
                elif result == 'H':
                    list1.append(1)
                else :
                    list1.append(2)
                Feature.counter+=1
                if i==6:
                    print "break"
                    break
                for j in range(len(list1)):
                    '''
                    if not j == len(list1)-1:
                        entry=str(j+1)+':'+str(list1[j])
                    else:
                        entry=list1[j]
                    '''
                    row.write(j,list1[j])
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

    def WEKAformat(self,trainsheet,fileobj):
        fileobj.write("@RELATION football\n@ATTRIBUTE form1 numeric\n@ATTRIBUTE aq1 numeric \n@ATTRIBUTE cs1 numeric \n@ATTRIBUTE gc1 numeric \n@ATTRIBUTE form2 numeric \n@ATTRIBUTE aq2 numeric \n@ATTRIBUTE cs2 numeric \n@ATTRIBUTE gc2 numeric \n@ATTRIBUTE class {1.0,2.0,3.0} \n@DATA\n")
        for i in range(1,331):
            for j in range(8):
                Feature.string+=str(trainsheet.cell(i,j).value)+' '
            Feature.string+=str(trainsheet.cell(i,8).value)+'\n'
            fileobj.write(Feature.string)
            Feature.string=''



















