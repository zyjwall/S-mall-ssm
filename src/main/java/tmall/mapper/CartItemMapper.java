package tmall.mapper;

import java.util.List;
import tmall.pojo.CartItem;
import tmall.pojo.CartItemExample;
// 因为里面配置了映射器，所以下一步需要创建映射器。在创建映射器之前，还要配置SqlSessionTemplate，其配置如下
public interface CartItemMapper extends BaseMapper<CartItem, CartItemExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    int insert(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    int insertSelective(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    List<CartItem> selectByExample(CartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    CartItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cartitem
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CartItem record);
}
