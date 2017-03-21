---
layout: page
title: Comment gérer ce site ? 
---

## Sur Git et Github

Git est un util pour la version contrôle. 
Vous trouverez [ici](http://gitref.org/) une documentation très
complète et [ici](https://try.github.io/) un tutoriel interactive,
qui est assez facil à comprendre.

[Github](https://github.com/)
 
Vous pouvez ajouter le compte de vous-mèmes dans le 
[repos](https://github.com/GTTLSTA/gttlsta.github.io) de ce cite.


``` settings/Collaborators/Add Collaborators```

## Structure de ce site

#### 1. /_post/année-mois-jour-nom.md

Si vous créez un ```.md``` comme ça, il y aura un article dans
Archive de ce cite.

#### 2. /xxxx.md

La page que vous êtes en train de lire est créée de cette faĉon.

c'est-à-dire, si vous créez un ```.md``` avec

```
---
layout: page
title: Comment gérer ce site ? 
---

```

On aura une pageweb accessible dans le sidebar.

#### 3. /_draft

C'est le dossier pour les drafts. Il ne changera rien sur le site.

#### 4. configuration 


/._config.yml

/index.html (c'est le seule fichier où il faut toucher .html)

#### 5. les figures et les pdfs

Il faut les mettre dans ./public/imgs et ./public/pdf

## Contenus

* tous les objets disponible dans markdown

(figures, tableau, liens, etc...)

* latex (basique)

par ex.

$$I = \int_0^{\infty} f(x)dx$$

* code block


{% highlight R%}

x <- rnorm(100)

f <- funtion(y){
        return(cumsum(exp(y)/1:length(y))
    }
######################################################################
plot(x,f(x))

{% endhighlight%}

## Sur Jekyll 

Pour essayer localement sur votre maschine, il faut installer [jekyll](https://jekyllrb.com/)

S'il y a des gems manquant, vous pouvez les installer facilement par

```
sudo gem install nom-de-gem-manquant
```

Pour Ubuntu, peut-être il faut aussi installer la dependance

```
sudo apt install ruby-dev
```

S'il y a des problèmes, n'hésitez pas de me voir.


Qiming
