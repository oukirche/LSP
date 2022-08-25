# LSP
## Liskov Substitution Principle (LSP)
Si B et C sont des implémentations de A, alors B et C doivent pouvoir être inter-changées sans affecter l’exécution du programme.<br>

Le principe de substitution de Liskov stipule que les sous-classes doivent être substituables à leurs classes de base.<br>

Cela signifie que, étant donné que la classe B est une sous-classe de la classe A, nous devrions pouvoir passer un objet de la classe B à toute méthode qui attend un objet de la classe A et la méthode ne devrait pas donner de sortie bizarre dans ce cas.<br>

C'est le comportement attendu, car lorsque nous utilisons l'héritage, nous supposons que la classe enfant hérite de tout ce que possède la superclasse. La classe enfant étend le comportement mais ne le réduit jamais.
### Exemple
Nous avons créer une Class Rectange qui contient une seul methode qui nous retourne la surface de rectangle
et puisque le carré n'est qu'un type spécial de rectangle dont la largeur est égale à la hauteur.
Notre classe Square étend la classe Rectangle. Nous définissons la hauteur et la largeur sur la même valeur dans le constructeur, mais nous ne voulons pas qu'un client (quelqu'un qui utilise notre classe dans son code) modifie la hauteur ou le poids d'une manière qui puisse violer la propriété square.<br>

Par conséquent, nous remplaçons les setters pour définir les deux propriétés chaque fois que l'une d'entre elles est modifiée. 
#### Probleme
Le problème avec cette solution est que si nous voulons faire des tests spécifiques comme nous avons dans la classe Test, nous arrivons avec un comportement différent de celui auquel nous nous attendons.
#### Solution
La solution que je propose est de créer une classe abstraite Shape qui contient uniquement la méthode getArea et les deux autres classes (Rectangle, Square) héritent de cette classe et redéfinissent la méthode getArea