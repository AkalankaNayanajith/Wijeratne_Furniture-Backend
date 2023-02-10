package com.wijeratnefurniture.ecomfurniture.service.implementation;

import com.wijeratnefurniture.ecomfurniture.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import java.util.Objects;
import com.wijeratnefurniture.ecomfurniture.service.CategoryService;


import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private MongoOperations mongoOperations;


    public int getSequenceNumber(String sequenceName) {

        //get Sequence No
        Query query = new Query(Criteria.where("id").is(sequenceName));
        //update the sequence no
        Update update = new Update().inc("seq", 1);
        //modify in document
        Category counter = mongoOperations
                .findAndModify(query,
                        update, options().returnNew(true).upsert(true),
                        Category.class);

        return !Objects.isNull(counter) ? counter.getSeq() :1;
    }
    
}
