package asu.clicknship.Services;

import asu.clicknship.Models.Dummy;
import asu.clicknship.Repository.DummyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DummyService {
    @Autowired
    private final DummyRepository dummyRepository;

    public List<Dummy> getDummy(){
        return dummyRepository.findAll();
    }

    public void addDummy(Dummy dummy) {
        dummyRepository.save(dummy);
    }
}
