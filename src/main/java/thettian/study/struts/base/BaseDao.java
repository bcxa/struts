package thettian.study.struts.base;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T,ID extends Serializable> extends JpaRepository<T, ID>{

}
