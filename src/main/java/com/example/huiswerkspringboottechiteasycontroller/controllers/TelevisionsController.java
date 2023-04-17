package com.example.huiswerkspringboottechiteasycontroller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController {




    //extra klasse waarin de televisies staan - en dat je die teruggeeft.


    @GetMapping ("/televisions")
    public ResponseEntity<Object> getAllTelevisions(){
        //ResponseEntity.ok ==> een 200 code - dat het gelukt is
        return ResponseEntity.ok("All television");
    }

    //Path Variable gebruik je wanneer je maar 1 variabele kunt ontvangen - om een pad op te zoeken
    // Request Param - dan kan je geen /{id} gebruiken. Netter om bij een identificatie variable (id) - Path Variable te gebruiken. Dit kun je dan alleen niet via key en value in postman checken - dan moet het in de url genoteerd worden.
    // Je kunt dan op de voorkant iets schrijven zodat je beslist wat je laat zien.
    @GetMapping ("/television/{id}")
    public ResponseEntity<Object> getOneTelevision(@PathVariable long id){
        return ResponseEntity.ok("Television: " + id);
    }

    //Als je iets gecreeerd hebt, wil je als gebruiker de feedback krijgen dat het gelukt is. Je geeft het object terug.
    // Bijvoorbeeld geeft gegevens voor factuur in - fijn als je alle gegevens nog een keer te zien krijgt.
    @PostMapping ("/addtelevision")
    public ResponseEntity<Object> addTelevision (@RequestBody String television) {
        return ResponseEntity.created(null).body(television);
    }


    // en een tv zoeken via path variable, en ook request info om iets aan te passen
    //RequestBody - (body is pakket aan meerdere variabelen) -
    // Je kan alleen de variabelen meepakken die iemand anders meegaat, en dat anders de waarden die er al in stonden - wordt behouden
    // Bij request body - doe je normaal Television television - maar omdat we nog geen obejcten hebben werken met deze opdracht even met een String
    // In de service pas je het object aan.
    @PutMapping ("/updatetelevision/{id}")
    public ResponseEntity<Object> updateTelevision (@PathVariable long id, @RequestBody String television) {
        return ResponseEntity.accepted().body("Television " + television);
    }

    @DeleteMapping ("/deletetelevision/{id}")
    public ResponseEntity<Object> deleteTelevision (@PathVariable long id) {
        // je wil no content teruggeven, met build geef je dan een nieuw pad aan waar je heengaat. Het object is verwijderd - dus daar kun je niet meer naar verwijzen.
        // Je wilt dus dat je teruggeleid wordt naar een andere pagina. De melding dat iets goed verwijderd is, doe je op de frontend kant. Omdat de pagina dus verwijderd is (want tv verwijderd die heeft eigen pagina) - dan ga je naar een andere pagina - waar je met javascript de melding succesvol verwijderd.
        return ResponseEntity.noContent().build();
    }




}
