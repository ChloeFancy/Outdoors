package Service;

import bean.UserEntity;

public interface UserDAO {
    public void add(UserEntity userEntity);
    public void delete(int id);
}
