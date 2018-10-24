#Commands to change col names, also for schema purposes
#df11 = df1.toDF("regionEducativa","distritoEscolar ","municipio","Escuela_ID","Escuela_Nombre","nivel","CollegeBoard_ID ")
#df22 = df2.toDF("region","distrito","eid","nombreEscuela","nivel","sexo","sid")


df11.join(df22,'eid').filter(df11.nivel == "Superior").filter(df22.sexo == "M").filter((df11.municipio == "Ponce") | (df11.municipio == "San Juan")).show()
