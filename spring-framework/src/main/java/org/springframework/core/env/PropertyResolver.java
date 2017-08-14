package org.springframework.core.env;

/**
 * @Description 对于潜在来源资源的解析器
 * @Project : collections
 * @Program Name  : org.springframework.core.env.PropertyResolver
 * @Author : zhongpingtang@yiruntz.com 唐忠平
 */
public interface PropertyResolver {

    /**
     * 检查是否含有一个资源
     *
     * @return
     */
    boolean constainsProperty(String key);


    /**
     * 获取一个资源
     *
     * @param key
     * @return
     */
    String getProperty(String key);


    /**
     * 尝试获取一个资源，如果不包含这个资源，则返回默认值
     *
     * @param key
     * @param defaultValue
     * @return
     */
    String getProperty(String key, String defaultValue);


    /**
     * 根据指定的类来获取指定的对象
     * @param key
     * @param targetClass
     * @return
     */
    <T> T getProperty(String key, Class<T> targetClass);


    /**
     * 带默认值的目标指定类型
     * @param key
     * @param targetClass
     * @param defaultValue
     * @return
     */
    <T> T getProperty(String key, Class<T> targetClass, T defaultValue);


    /**
     * 获取所需要的属性,如果属性不存在会抛出异常
     * @param key
     * @return
     */
    String getRequiredProperty(String key) throws IllegalStateException;


    /**
     * 获取指定类型的属性
     * @param key
     * @param targetClass
     * @param <T>
     * @return
     * @throws IllegalStateException
     */
    <T> T getRequiredProperty(String key, Class<T> targetClass) throws IllegalStateException;


    /**
     * 解析占位符
     * @param placeholder
     * @return
     */
    String resolverPlaceholders(String placeholder);


    /**
     * 解析占位符，如果无法解析会抛出异常
     * @param placeholders
     * @return
     * @throws IllegalStateException
     */
    String resolverRequiredPlaceholders(String placeholders) throws IllegalStateException;




}
