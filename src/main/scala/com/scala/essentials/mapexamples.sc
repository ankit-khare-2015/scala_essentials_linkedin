

var shoplist = Map(1 -> "milk",
  2 -> "bread")

shoplist = shoplist + (3 -> "eggs")

shoplist.getOrElse(4,"No Match")

for((k,v) <- shoplist) yield (v,k)

