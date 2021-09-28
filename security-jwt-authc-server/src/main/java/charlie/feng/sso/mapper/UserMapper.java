package charlie.feng.sso.mapper;

import charlie.feng.sso.pojo.UserPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    //@Select("select * from t_user where username = #{userName}")
    UserPojo queryByUserName(@Param("userName") String userName);
}
