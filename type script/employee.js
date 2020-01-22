"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, dob, age, emailid) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.emailid = emailid;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(121, 'yasmin', new Date(), 21, 'zubduma@gmail.com');
console.log(employee);
//console.log('date od birth' +employee.dob);
