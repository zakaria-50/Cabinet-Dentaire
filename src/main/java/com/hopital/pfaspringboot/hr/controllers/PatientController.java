package com.hopital.pfaspringboot.hr.controllers;

import com.hopital.pfaspringboot.hr.models.Patient;
import com.hopital.pfaspringboot.hr.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService ;

    @GetMapping("/patients")
    /*@ResponseBody*/
    public String getAll(Model model){

        List <Patient> patients= patientService.getAll()   ;
       model.addAttribute("patients" , patients) ;
        return "assets/patientList";
    }

    @GetMapping("/patientAdd")
    public String addPatient(){
        return "assets/patientAdd" ;
        }


    @PostMapping("/patients")
    public String save (Patient patient){
        patientService.save(patient) ;
        return "redirect:/patients" ;
    }


    @RequestMapping(value = "/patients/delete/{id}" , method = {RequestMethod.GET , RequestMethod.DELETE })
    public String delete(@PathVariable Long id){
        patientService.delete(id);
        return "redirect:/patients" ;
    }



    @GetMapping("/patientEdit/{id}")
    public String editpatient (@PathVariable Long id , Model model){
        Patient patient = patientService.getById(id) ;
        model.addAttribute("patient" , patient) ;
        return "assets/patientEdit" ;
    }


    @RequestMapping(value = "/patients/update/{id}" , method = {RequestMethod.GET , RequestMethod.PUT})
    public String update(Patient patient){
        patientService.save(patient);
        return "redirect:/patients" ;
    }


    @GetMapping("/patientDetails/{id}")
    public String details(@PathVariable Long id , Model model){
        Patient patient = patientService.getById(id) ;
        model.addAttribute("patient" , patient) ;
        return "assets/patientDetails";
    }

}
