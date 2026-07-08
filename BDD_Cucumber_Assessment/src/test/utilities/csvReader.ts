import fs from 'fs'
import path from 'path'
import {parse} from 'csv-parse/sync'


export interface registerUser{

    firstName:string;
    lastName:string;
    email:string;
    password:string;
    confirm:string;

}

export function readCsvFile(){

    const filePath = path.resolve(__dirname, '../../../testData/regsiterData.csv');
    const content = fs.readFileSync(filePath,'utf-8');
    return parse(content,{
        skip_empty_lines:true,
        columns:true,
        trim:true
    }) as registerUser[]
        
}