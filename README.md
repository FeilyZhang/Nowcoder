# Nowcoder
牛客网在线编程刷题集

## 剑指Offer
> 替换字符串中空格为字符%20
###### 题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
###### 思路如下：
+ 一种办法是将字符串转化为字符数组，然后逐个判断当前字符是不是空格，如果是的话就将空格替换为%20，也就意味着原字符数组的长度增加2，也就是要把当前位置之后的所有字符往后移动2位。总体来说，实现起来很麻烦且效率低。
+ 另一种办法效率明显高很多而且很简单，那就是重新定义一个空字符串，同样先将字符串转化为字符数组，遍历字符数组，如果当前字符不是空格那么就将该字符追加到定义的空字符串的末尾，如果是空格，就将%20追加到字符串末尾，以此类推。
