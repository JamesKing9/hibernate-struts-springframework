package service;

import java.util.List;

import model.Person;

public interface PersonService {
	/**
	 * 查看person表的信息
	 * @return person集合
	 */
    public List<Person> findAll();

    /**
     * 向數據庫中插入一行記錄
     * @param person
     */
    public void save(Person person);

    /**
     * 根據提供的id刪除一行記錄
     * @param id
     */
    public void remove(int id);

    /**
     * 根據提供的id查詢對應行的記錄
     * @param id
     * @return
     */
    public Person find(int id);
}
