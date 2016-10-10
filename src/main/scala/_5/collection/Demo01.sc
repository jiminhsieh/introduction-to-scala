// construct List
val list1 = List(1, 2, 3)
// Element prepends to List
val list2 = 1 :: 2 :: 3 :: Nil
val list3 = 1 :: (2 :: (3 :: Nil))
val list4 = Nil.::(3).::(2).::(1)
// List prepends to List
val list5 = List(5, 5, 6, 6) ::: List(8, 7)
val list6 = List(8, 7).:::(List(5, 5, 6, 6))