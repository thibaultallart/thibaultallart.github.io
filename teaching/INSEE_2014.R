# source : http://www.ined.fr/fr/tout-savoir-population/chiffres/france/mortalite-cause-deces/table-mortalite/
# On suppose que la date de naissance n'a pas d'influence sur le taux de mortalité, ce qui est faux.
library(data.table)
#DT <- fread("INSEE hommes 2014.csv")
DT <- fread("INSEE femmes 2014.csv")

setnames(DT, 1:2, c("t", "S"))
DT[, S:=as.numeric(S)/100000]
t <- DT$t
S <- DT$S

# Courbe de survie
plot(y=S, x=t, type="s", lwd=2,
     xlab="age", ylab="Survie", main="Courbe de survie en France 2014")

# Probabilite de survivre au moins jusqu'a 80 ans
DT$S[t==80]

# Probabilite de survivre au moins jusqu'a 80 ans,
# sachant que l'on a 30 ans
# S(80|30) :
DT$S[t==80]/DT$S[t==30]

# Esperance de vie
E <- sum(S)
E

# Durée de vie médiane
DT$t[max(which(DT$S>0.50))]

# Taux de deces annuel \lambda(t)
H <- -log(S)
h <- diff(H)
plot(y=h, x=t[-length(t)], type="l", lwd=2, ylim=c(1e-4, 1),
     xlab="age", ylab="Taux de décès annuel", 
     main="Taux de décès annuel en France 2014")

plot(y=h, x=t[-length(t)], type="l", lwd=2, log = "y", ylim=c(1e-4, 1),
     xlab="age", ylab="Taux de décès annuel", 
     main="Taux de décès annuel en France 2014")

# Taux de deces entre 30 et 31 ans
-log(DT$S[t==31])+log(DT$S[t==30])
h[31]


