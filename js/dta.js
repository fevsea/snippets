// JS does not have Aray datatype, but an object.
// Equivalent declarations
var arr = new Array(element0, element1, ..., elementN);
var arr = Array(element0, element1, ..., elementN);
var arr = [element0, element1, ..., elementN];

// Non zero lenght but undefined
var arr = new Array(arrayLength);
var arr = Array(arrayLength);

// Length in arrays is implemented as a property, setting is to zero will empty the aray

var myArray = new Array('1', '2', '3');
myArray = myArray.concat('a', 'b', 'c');
// myArray is now ["1", "2", "3", "a", "b", "c"]

var myArray = new Array('Wind', 'Rain', 'Fire');
var list = myArray.join(' - '); // list is "Wind - Rain - Fire"
var myArray = new Array('1', '2');
myArray.push('3');  // Add '3' to the end and return length
let last = myArray.pop1();  // Removo and return '3'
var first = myArray.shift(); // Remove and return the firt element
myArray.unshift(1, 2); // Add to the begining and return length
myArray.slice(1, 4); // Etract the sgmanet [1, 4)
myArray.splice(a, b, ...n)  // Remove b items since a and inseert n elementsi instead
myArray.reversed()
myArray.sort() // An opcional function may be pass that return -1 if a < b, smilary 0 and 1

indexOf(searchElement[, fromIndex]) // -1 if not found
lastIndexOf(searchElement[, fromIndex])  // -1 if not found

forEach(callback[, thisObject])
map(callback[, thisObject])
filter(callback[, thisObject]) // return new array with anly item return true
every(callback[, thisObject]) // return true if all maps to true
some(callback[, thisObject])   // true if a least one map to true
// all of that functions receive 3 parameters (current item value, index, array)

var total = a.reduce[Right](function(first, second) { return first + second; }, 0);
    accumulator
    currentValue
    currentIndex
    array

void(0);

// Array-like objects
Array.prototype.forEach.call('a string', function(chr) {
  console.log(chr);
});




// Map (ECMA15)

var sayings = new Map();
sayings.set('dog', 'woof');
sayings.set('cat', 'meow');
sayings.set('elephant', 'toot');
sayings.size; // 3
sayings.get('fox'); // undefined
sayings.has('bird'); // false
sayings.delete('dog');
sayings.has('dog'); // false

// Ieration of maps is in insertion order of the elements.
for (var [key, value] of sayings) {
  console.log(key + ' goes ' + value);
}
// "cat goes meow"
// "elephant goes toot"

sayings.clear();
sayings.size; // 0

// statements_1var mySet = new Set();
mySet.add(1);
mySet.add('some text');
mySet.add('foo');

mySet.has(1); // true
mySet.delete('foo');
mySet.size; // 2

for (let item of mySet) console.log(item);

// COnverting and copying
Array.from(mySet);
mySet2 = new Set([1, 2, 3, 4]);
