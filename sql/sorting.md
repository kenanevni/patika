# patikasorting

insertion and selection sorting

## insertion sorting

[referans](https://www.geeksforgeeks.org/insertion-sort/)

22,27,16,2,18,6
lets compare one by one
22 & 27 which is small? 22 no change

22,27,16,2,18,6

22 & 16 which is small? 16 move 16 to begin

16,22,27,2,18,6

16 & 2 which is small? 2 move 2 to begin

2,16,22,27,18,6

2 & 18   which is small? 2.  16 & 18  which is small? 16. 22 & 18  which is small? 18 so put the 18 left of 22

2,16,18,22,27,6

2 & 6  which is small? 2. 16 & 6  which is small? 6 then put 6 to left of 16

2,6,16,18,22,27

Big-O O(n^2)

18 Avarage Case

## Selection Sort

[referans](https://www.geeksforgeeks.org/selection-sort/)

[7,3,5,8,2,9,4,15,6] write till fourth step due to selection sort

7 is default minimum number compare 7 & rest of array then you find 2 then swap 2 and 7 

[2,3,5,8,7,9,4,15,6]

2 is now the minimum nuber lets look 3. and 3 is the minumum number after 2 so nothing changed

[2,3,5,8,7,9,4,15,6]

next number is 5. 5 is our default min number in the rest of array. and compare one by one and 4 is lower then 5 so swap 5 ad 4

[2,3,4,8,7,9,5,15,6]

next number is 8. 8 is our default min number rest of array. then compare one by one. 6 is lower then 8. swap 8 and 6

[2,3,4,6,7,9,5,15,8]

## Merge Sorting

[16,21,11,8,12,22]

16,21,11 | 8,12,22
16,21 | 11 | 8,12 | 22

16 | 21 | 11 | 8 | 12 | 22

16,21 | 8,11 | 12,22

8,11,16,21 | 12,22

8,11,12,16,21,22
Bio-O (nlogn)

## Binary-Search-Tree

[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]

root is 5

![Screenshot_11](https://user-images.githubusercontent.com/109909988/225522523-50f1ce56-36d5-4297-a0cc-e0d64aff70ce.png)
