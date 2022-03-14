console.log("Hello, World!");

console.log(0== -0);
console.log(1/0);
console.log(1 / Infinity);
console.log(1/ -Infinity);
console.log(false + true);
console.log(true + true);
console.log(null == undefined);
console.log(null === undefined);

console.log(a);

var a = 'some string';
console.log(a);
a = 2;
console.log(a);

obj1 = new Object ({
  "firstName":"Ankur"
});
console.log(obj1);

obj2 = {
  "firstName":"Ankur"
};

console.log(obj2);

let myJSON = `{
  "Key1": 1,
  "Key2": true,
  "key3": ${a}
}`;

let obj3 = JSON.parse(myJSON);
console.log(obj3);

let myJSON2 = JSON.stringify(obj3);
console.log(myJSON2);

/*
  Truthy/Falsy

  JS like many programming languages has the concept of truthy vs. falsy. Java does not have this concept.
*/

// Empty strings can be treated as false values.
// Any other string will be treates as true.
console.log(''== false);
console.log('');