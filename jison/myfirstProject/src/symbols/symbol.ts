import { Instruccion } from "../abstractas/instruccion";

export class Symbol {
    constructor(public id: string, public type: string) {}
  }
  

  export class Symbol2 {
    constructor(public id: string, public type: Instruccion) {}
  }
  