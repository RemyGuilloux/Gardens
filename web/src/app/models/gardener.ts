import { Garden } from './Garden';

export class Gardener {
    constructor(
                type: string,
                localisation: string,
                name: string,
                lastname: string,
                phone: string,
                mail: string,
                gender: string) {

        
        this.type = type;
        this.localisation = localisation;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.gender = gender;

    }
    id: number;
    type: string;
    localisation: string;
    name: string;
    lastname: string;
    phone: string;
    mail: string;
    gender: string;

}



