package TH18_CREATEBINARYFILE.SERVICE;

import java.util.List;

public interface IService <T>{
    void add(T object);
    List<T> findByName(String name);
    List<T> findAll();
}
