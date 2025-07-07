package com.example.researchassisstant;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ResearchController {
    @Autowired
    private final ResearchService researchService;

    @PostMapping("/process")
    public ResponseEntity<String>processContent(@RequestBody ResearchRequest request){
        String result=researchService.processContent(request);
        return ResponseEntity.ok(result);
    }

}
