package org.isi.parametrages.controllers;
import org.isi.parametrages.entities.Sector;
import org.isi.parametrages.services.SectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sectors")
public class SectorController {

    private final SectorService service;

    public SectorController(SectorService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("sectors", service.findAll());
        return "sectors/list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("sector", new Sector());
        return "sectors/form";
    }

    @PostMapping
    public String save(Sector sector) {
        service.save(sector);
        return "redirect:/sectors";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/sectors";
    }
}

