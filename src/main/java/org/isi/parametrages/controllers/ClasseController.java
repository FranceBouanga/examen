package org.isi.parametrages.controllers;


import org.isi.parametrages.entities.Classe;
import org.isi.parametrages.entities.Sector;
import org.isi.parametrages.services.ClasseService;
import org.isi.parametrages.services.SectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/classes")
public class ClasseController {
    private final ClasseService classeService;
    private final SectorService sectorService;

    public ClasseController(ClasseService classeService, SectorService sectorService) {
        this.classeService = classeService;
        this.sectorService = sectorService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("classes", classeService.findAll());
        return "classes/list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("classe", new Classe());
        model.addAttribute("sectors", sectorService.findAll());
        return "classes/form";
    }

    @PostMapping
    public String save(Classe classe) {
        classeService.save(classe);
        return "redirect:/classes";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        classeService.delete(id);
        return "redirect:/classes";
    }
}
