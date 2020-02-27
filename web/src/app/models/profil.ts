import { Garden } from 'src/app/models/garden';
import { Address } from 'src/app/models/address';

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