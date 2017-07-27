package cn.zmlio.microcms.repository;

import cn.zmlio.microcms.entity.BasicEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class BasicRepository<T extends BasicEntity, ID> extends SimpleJpaRepository {
    public BasicRepository(Class domainClass, javax.persistence.EntityManager em) {
        super(domainClass, em);
    }

    @Override
    public void deleteAllInBatch() {
        super.deleteAllInBatch();
    }

    @Override
    public Object findOne(Serializable serializable) {
        return super.findOne(serializable);
    }

    @Override
    protected Map<String, Object> getQueryHints() {
        return super.getQueryHints();
    }

    @Override
    public Object getOne(Serializable serializable) {
        return super.getOne(serializable);
    }

    @Override
    public boolean exists(Serializable serializable) {
        return super.exists(serializable);
    }

    @Override
    public List findAll() {
        return super.findAll();
    }

    @Override
    public List findAll(Iterable iterable) {
        return super.findAll(iterable);
    }

    @Override
    public List findAll(Sort sort) {
        return super.findAll(sort);
    }

    @Override
    public Page findAll(Pageable pageable) {
        return super.findAll(pageable);
    }

    @Override
    public Object findOne(Specification spec) {
        return super.findOne(spec);
    }

    @Override
    public List findAll(Specification spec) {
        return super.findAll(spec);
    }

    @Override
    public Page findAll(Specification spec, Pageable pageable) {
        return super.findAll(spec, pageable);
    }

    @Override
    public List findAll(Specification spec, Sort sort) {
        return super.findAll(spec, sort);
    }

    @Override
    public Object findOne(Example example) {
        return super.findOne(example);
    }

    @Override
    public long count(Example example) {
        return super.count(example);
    }

    @Override
    public boolean exists(Example example) {
        return super.exists(example);
    }

    @Override
    public List findAll(Example example) {
        return super.findAll(example);
    }

    @Override
    public List findAll(Example example, Sort sort) {
        return super.findAll(example, sort);
    }

    @Override
    public Page findAll(Example example, Pageable pageable) {
        return super.findAll(example, pageable);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public long count(Specification spec) {
        return super.count(spec);
    }

    @Override
    public Object save(Object entity) {
        return super.save(entity);
    }

    @Override
    public Object saveAndFlush(Object entity) {
        return super.saveAndFlush(entity);
    }

    @Override
    public List save(Iterable entities) {
        return super.save(entities);
    }

    @Override
    public void flush() {
        super.flush();
    }

    @Override
    protected Page readPage(TypedQuery query, Pageable pageable, Specification spec) {
        return super.readPage(query, pageable, spec);
    }

    @Override
    protected Page readPage(TypedQuery query, Class domainClass, Pageable pageable, Specification spec) {
        return super.readPage(query, domainClass, pageable, spec);
    }

    @Override
    protected TypedQuery getQuery(Specification spec, Pageable pageable) {
        return super.getQuery(spec, pageable);
    }

    @Override
    protected TypedQuery getQuery(Specification spec, Class domainClass, Pageable pageable) {
        return super.getQuery(spec, domainClass, pageable);
    }

    @Override
    protected TypedQuery getQuery(Specification spec, Sort sort) {
        return super.getQuery(spec, sort);
    }

    @Override
    protected TypedQuery getQuery(Specification spec, Class domainClass, Sort sort) {
        return super.getQuery(spec, domainClass, sort);
    }

    @Override
    protected TypedQuery<Long> getCountQuery(Specification spec) {
        return super.getCountQuery(spec);
    }

    @Override
    protected TypedQuery<Long> getCountQuery(Specification spec, Class domainClass) {
        return super.getCountQuery(spec, domainClass);
    }
}
