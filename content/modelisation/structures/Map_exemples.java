// interface                          implantation
   Map<String, Object>     objetJson  = new HashMap<>(); 
   Map<Integer, String>    parDA      = new TreeMap<>(); 
   Map<StudentId, Billet>  rendezVous = new LinkedHashMap<>(); 

objetJson.put("attr01", true);
objetJson.put("attr02", null);
objetJson.put("attr03", 123.4);

Object valeur01 = objetJson.get("attr01");

parDA.put(421235, "Amina");
parDA.put(413354, "Bénison");
parDA.put(565624, "Carlos");
parDA.put(645143, "Delpine");

String nomEtudiant = parDA.get(413354);

StudentId id = new StudentId(645143);

rendezVous.put(id, new rendezVous());
rendezVous.get(id);
