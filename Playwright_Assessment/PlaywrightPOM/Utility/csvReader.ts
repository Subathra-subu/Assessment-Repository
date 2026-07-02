import fs from 'fs';
import path from 'path';
import {parse} from 'csv-parse/sync';

export interface loginuser{
    email:string
    password:string
}

export function readCsvFile(){
    const filepath = path.resolve(__dirname, '../TestData/LoginData.csv');
    const filecontent = fs.readFileSync(filepath,'utf-8');

    return parse(filecontent,{
        columns:true,
        skip_empty_lines:true,
        trim:true
    })as loginuser[];
}