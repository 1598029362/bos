package com.ssm.mapper;


import com.ssm.model.SyMenus;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyMenusMapper {
    @Delete("delete from SY_Menus where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into SY_Menus values(SY_Menus_id.Nextval,#{parentid},#{type},#{text},#{url},#{tip})")
    int insert(SyMenus record);

    //查询模块的根目录
    /*@Select("select * from SY_Menus where parentid=-1 " )
    public List<SyMenus> findAllModule();


    @Select("select * from SY_Menus where parentid=#{parentid}")
    public List<SyMenus> findChildModule(int pid);*/

    //查询模块的根目录
    @Select("select * from SY_Menus  t INNER JOIN Sy_RolesMenus  u on t.id=u.menuid where parentid=-1 " )
    public List<SyMenus> findAllModule();


    @Select("select * from SY_Menus  t INNER JOIN Sy_RolesMenus  u on t.id=u.menuid where parentid=#{parentid} and roleid=#{roleid} ")
    public List<SyMenus> findChildModule(int parentid, int roleid);

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sy_menus) d where ROWNUM <=#{end})where ROWNUM_>#{start}")
    List<SyMenus> selectByPrimaryKey(int start, int end);

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sy_menus) d where ROWNUM <=#{end})where ROWNUM_>#{start} and text like #{text}")
    List<SyMenus> selectByPrimaryKeyLike(int start, int end, String text);

    @Select("select count(*) from sy_menus where text like #{text}")
    public int selectCount(String text);

    @Update("update SY_Menus set parentid=#{parentid},type=#{type},text=#{text},url=#{url},tip=#{tip} where id=#{id}")
    int updateByPrimaryKey(SyMenus record);
}