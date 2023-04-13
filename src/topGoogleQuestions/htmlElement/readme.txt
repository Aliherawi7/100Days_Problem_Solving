

###  32. HTML Element


description:
Have the function HTMLElements(String str) read the str parameter
being passed which will be a string of HTML DOM elements and
plain text. The elements that will be used are : b, i , em, div, p.

for example:
if str is <div> <b> <p> hello world </p> </b> </div>

then this is string of DOM is nested correctly so your program
should return the string "true" if a string is not nested
correctly, return the first element encountered where, if changed
into a different element would result in a properly  formatted
string. if the string is not formatted properly, then it will return
the only one element that need to be changed

For example: if str is '<div>'<i>hello </i> world </b>" then your
program should return the string "div" because if the first <div>
element were changed into a <b> the string would be properly formatted.

Examples:

Input : "<div><div><b></b></div>< /p>"
Output: div

Input : "<div>abc </div> <p> <em> <i> test test </b> </em> </p>"
Output: i