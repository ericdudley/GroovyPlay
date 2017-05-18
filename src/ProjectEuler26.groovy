/**
 * Find longest recurring decimal from 1 / d where d < 1000.
 */
record = 0
recordd = 0
for(d = 3; d < 1000; d++){
  if(d % 2 == 0 || d % 5 == 0 ){
    continue
  }
  // Must have some recurring section
  remainder = 99
  poten = 1
  while(remainder != 1){ // Find smallest power of ten that creates rem of 1
    remainder =  (10 ** poten++) % d
  }
  record = poten > record ? poten : record;
  recordd = poten > record ? d : recordd;
}
println record
