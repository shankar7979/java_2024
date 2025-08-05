export class Employee {
    public id: number;
    public name: string;
    public dob: Date;

    constructor() {
        this.id = 0;
        this.name = ""
        this.dob = new Date();
    }
}
