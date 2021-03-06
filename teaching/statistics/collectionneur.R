#https://fr.wikipedia.org/wiki/Probl%C3%A8me_du_collectionneur_de_vignettes
#https://fr.wikipedia.org/wiki/Loi_g%C3%A9om%C3%A9trique
n <- 10 # nb total � collectionner
k <- 9 # d�j� poss�d�es
p <- (n-(k))/n # proba d'avoir une nouvelle (proba conditionnelle)
pgeom(q=0, prob=p)
rgeom(n=10, prob=p) # nombre achet�s avant d'en tirer une nouvelle (commence � zero)

# --- Simulation de la collection totale ---
n <- 10 # 698
# On simule le nombre de cartes n�cessaires � l'obtention d'une nouvelle carte
# P(k+1|k)
TimeToGetAllCards <- function(n, start=0){
   total <- rep(0,n)
   for (k in 0:(n-1)){
      p <- (n-(k))/n # proba d'avoir une nouvelle (proba conditionnelle)
      total[k]  <-  rgeom(n=1, prob=p) + 1
   }
   return(total)
}
times <- TimeToGetAllCards(n=698)
plot(cumsum(times))

# --- Monte Carlo simulation ---
nb.simu=100
sim <- rep(0, nb.simu)
for (k in 0:(nb.simu-1)){
   sim[k] <- sum(TimeToGetAllCards(n=698)) 
   print(k)
}
summary(sim)