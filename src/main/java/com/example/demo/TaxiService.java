package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaxiService {


    @Autowired
    private TaxiRepository taxiRepository;

    public Taxi getTaxiForUser(int cluster)
    {
        Taxi taxi1 = new Taxi(1L,1,false);
        Taxi taxi2 = new Taxi(2L,1,false);
        Taxi taxi3 =  new Taxi(3L,1,true);
        Taxi taxi4 = new Taxi(4L,2,true);
        Taxi taxi5 = new Taxi(5L,3,false);
        Taxi taxi6 = new Taxi(6L,3,true);
        Taxi taxi7 =  new Taxi(7L,2,false);
        Taxi taxi8 = new Taxi(8L,2,true);

        taxiRepository.save(taxi1);
        taxiRepository.save(taxi2);
        taxiRepository.save(taxi3);
        taxiRepository.save(taxi4);
        taxiRepository.save(taxi5);
        taxiRepository.save(taxi6);
        taxiRepository.save(taxi7);
        taxiRepository.save(taxi8);

        List<Taxi> availableList =taxiRepository.findByClusterAndIsAvailable(cluster,true);

        if(availableList.isEmpty())
        {
            availableList =taxiRepository.findByClusterAndIsAvailable(cluster+1,true);
        }

        if(availableList.isEmpty())
        {
            availableList =taxiRepository.findByClusterAndIsAvailable(cluster-1,true);
        }

        if(availableList.isEmpty())
        {
            return new Taxi(0L,0,false);
        }

        else{
            return availableList.get(0);
        }
    }

}
