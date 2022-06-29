package org.aposternak35.app.controller;

import org.aposternak35.app.domain.Mark;
import org.aposternak35.app.domain.Model;
import org.aposternak35.app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/mark")
    private List getAllMarks(){
        return carService.getAllMarks();
    }
    @GetMapping("/model")
    private List getAllModels(){
        return carService.getAllModels();
    }
    @GetMapping("/modification")
    private List getAllModifications(){
        return carService.getAllModifications();
    }
    @GetMapping("/mark/{uid}")
    private Mark getMark(@PathVariable("uid")long uid){
        return carService.getMarkById(uid);
    }
    @DeleteMapping("/mark/{uid}")
    private void deleteMark(@PathVariable("uid")long uid){
        carService.delete(uid);
    }
    @PostMapping("/mark")
    private long saveMark(@RequestBody Mark mark){
        carService.saveOrUpdate(mark);
        return mark.getUid();
    }
    @PostMapping("/mark/{uid}/{mark}/{caption}")
    private void markAdd(@PathVariable("uid")long uid,@PathVariable("mark")String mark,@PathVariable("caption")String caption){
        carService.addMark(uid,mark,caption);
    }
    @PostMapping("/model/{uid}/{model}/{caption}/{imgUrl}")
    private void markAdd(@PathVariable("uid")long uid,@PathVariable("model")String model,@PathVariable("caption")String caption,@PathVariable("imgUrl")String imgUrl){
        carService.addModel(uid,model,caption,imgUrl);
    }
    @PostMapping("/modification/{uid}/{modification}/{caption}/{periodBegin}/{periodEnd}")
    private void modificationAdd(@PathVariable("uid")long uid,@PathVariable("modification")String modification,@PathVariable("caption")String caption,@PathVariable("periodBegin")int periodBegin,@PathVariable("periodEnd")int periodEnd){
        carService.addModification(uid,modification,caption,periodBegin,periodEnd);
    }
}
