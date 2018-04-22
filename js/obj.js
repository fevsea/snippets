var myCar = new Object();
myCar.make = 'Ford';
myCar.color; // undefined

var myObj = new Object(),
    obj = 'make';

myObj.type = 'Dot syntax';
myObj[obj] = 'String with space';  // Set obf.toString() is as a key

for (var i in obj) {
  var result = '';
  // obj.hasOwnProperty() is used to filter out properties from the object's prototype chain
  if (obj.hasOwnProperty(i)) {
    result += objName + '.' + i + ' = ' + obj[i] + '\n';
  }
}

Object.keys(obj); // returns an array with all the own names (only enumerable)
Object.getOwnPropertyNames(obj) // return an array with all own names

// Object inizializers
var myHonda = {color: 'red', wheels: 4, engine: {cylinders: 4, size: 2.2}};

// Object constructor
function Car(make, model, year) {
  this.make = make;
  this.model = model;
  this.year = year;
}
var car1 = new Car('Eagle', 'Talon TSi', 1993);


// Getters and setters
var o = {
  a: 7,
  get b() {
    return this.a + 1;
  },
  set c(x) {
    this.a = x / 2;
  }
};

var d = Date.prototype;
Object.defineProperty(d, 'year', {
  get: function() { return this.getFullYear(); },
  set: function(y) { this.setFullYear(y); }
});
