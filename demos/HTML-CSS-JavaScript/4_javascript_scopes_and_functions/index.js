/*
  Scopes

  In JavaScript, we have 3 scopes:
    1. Global Scope (var, const, let)
    2. Function Scope (var, const, let)
    3. Block Scope (const, let) (added in ES6, not available w/ the var decleration )

    Besides, var not being able to be block scoped, it depends on the context of where a varaible is defined in terms of what scope it has
*/

var i = 1000;

for (var i = 0; i < 100; i++){ // var is not block scoped

}

console.log(i); // 100

// ===========================

let j = 1000; // global scoped j

for (let j = 0; j < 100; j++){

}
console.log(j); // 1000

function myFunc(){
  // k is function scoped

  var k = 100; // Recall that var is hoisted to the top of the scope it is declared in

  console.log(z);

  if (false){
    var z = 5; //function scoped, NOT block scoped (because var doesn't have block scope)
  }

  z = 200;
  console.log(z);
}

myFunc();
