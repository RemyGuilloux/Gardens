import { Garden } from './Garden';
import { Address } from './Address';

export class Profil{
    id: number;
    localisation: string;
    name: string;
    lastname: string;
    phone: string;
    mail: string;
    gender: string;
    active: boolean;
    garden: Garden;
    address: Address;


}