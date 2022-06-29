package org.aposternak35.app.service;

import org.aposternak35.app.domain.Mark;
import org.aposternak35.app.domain.Model;
import org.aposternak35.app.domain.Modification;
import org.aposternak35.app.repository.MarkRepository;
import org.aposternak35.app.repository.ModelRepository;
import org.aposternak35.app.repository.ModificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {
    @Autowired
    MarkRepository markRepository;
    @Autowired
    ModelRepository modelRepository;
    @Autowired
    ModificationRepository modificationRepository;
    public List getAllMarks(){
        List marks=new ArrayList();
        markRepository.findAll().forEach(mark -> marks.add(mark));
        return marks;
    }
    public List getAllModels(){
        List models=new ArrayList();
        modelRepository.findAll().forEach(model -> models.add(model));
        return models;
    }
    public List getAllModifications(){
        List modifications=new ArrayList();
        modificationRepository.findAll().forEach(modification -> modifications.add(modification));
        return modifications;
    }
    public void addMark(Long uid, String mark, String caption){
        Mark mark1=new Mark(uid,mark,caption);
        markRepository.save(mark1);
    }

    public void addModel(Long uid, String model, String caption,String imgUrl){
        Model model1=new Model(uid,model,caption,imgUrl);
        modelRepository.save(model1);
    }

    public void addModification(Long uid, String modification, String caption, int periodBegin, int periodEnd){
        Modification modification1=new Modification(uid,modification,caption,periodBegin,periodEnd);
        modificationRepository.save(modification1);
    }
    public Mark getMarkById(long uid){
        return markRepository.findById(uid).get();
    }
    public void saveOrUpdate(Mark mark){
        markRepository.save(mark);
    }
    public void delete(long uid){
        markRepository.deleteById(uid);
    }
}
