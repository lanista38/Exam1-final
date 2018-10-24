#Commands to change col names, also for schema purposes
#df11 = df1.toDF("regionEducativa","distritoEscolar ","municipio","Escuela_ID","Escuela_Nombre","nivel","CollegeBoard_ID ")
#df22 = df2.toDF("region","distrito","eid","nombreEscuela","nivel","sexo","sid")


df11.filter(df11.regionEducativa == "Arecibo").groupBy(df11.distritoEscolar, df11.municipio).count().show()
